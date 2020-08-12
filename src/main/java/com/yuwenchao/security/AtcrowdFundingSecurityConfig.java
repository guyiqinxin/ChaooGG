package com.yuwenchao.security;

//Security安全框架不适用 已经取消  该包下类无实际意义 仅做参考

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.access.AccessDeniedHandler;


/**
 * 1、Spring一启动@Bean标注的所有方法能给容器中注册的Bean的信息保存起来
 * 		【PasswordEncoder=passwordEncoder】
 * 2、当我们第一次调用这个方法或者从容器中获取这组件
 * 		此时调用指定的方法，把我们自己创建的对象放在容器中返回并使用
 * 3、以后再调用这个方法或者@Autowired这个组件
 * 		直接从容器中获取即可，除非他是非单例的；（@Scope(scopeName="prototype")）
 * @author lfy
 *
 */
//@EnableGlobalMethodSecurity(prePostEnabled=true)
//@EnableWebSecurity
//@Configuration
public class AtcrowdFundingSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	SecurityUserDetailServiceImpl securityUserDetailServiceImpl;
	
	@Autowired
	AccessDeniedHandler accessDeniedHandler;
	
	//bean
	
	@Bean
	public PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(securityUserDetailServiceImpl).passwordEncoder(passwordEncoder());
	}
	
	/**
	 * 1、自定义请求授权访问规则
	 */
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/Static/**","/login.jsp").permitAll()
			.anyRequest().authenticated();//剩下都需要认证
		
		
		// /login.jsp==POST  用户登陆请求发给Security
		http.formLogin().loginPage("/login.jsp")
			.usernameParameter("loginacct")
			.passwordParameter("userpswd").defaultSuccessUrl("/toEmpPage").permitAll();
		
		
		http.csrf().disable();
		
		http.logout().logoutSuccessUrl("/login.jsp");
		
		http.exceptionHandling().accessDeniedHandler(accessDeniedHandler);
		//设置访问拒绝
	}
	

}
