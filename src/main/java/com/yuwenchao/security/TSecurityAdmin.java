package com.yuwenchao.security;



import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import com.yuwenchao.bean.UserInfo;

public class TSecurityAdmin extends User {
	
	private UserInfo orignalUser;//为了将数据库查出来的所有原始信息都保存
	
	public TSecurityAdmin(UserInfo admin,Collection<? extends GrantedAuthority> authorities){
			
		super(admin.getLoginacct(), admin.getUserpswd(), true, true, true, true, authorities);
		this.orignalUser = admin;
		orignalUser.setUserpswd("");//密码擦除
	}

	public TSecurityAdmin(String username, String password, boolean enabled, boolean accountNonExpired,
			boolean credentialsNonExpired, boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserInfo getOrignalUser() {
		return orignalUser;
	}

	public void setOrignalUser(UserInfo orignalUser) {
		this.orignalUser = orignalUser;
	}
	
	

}
