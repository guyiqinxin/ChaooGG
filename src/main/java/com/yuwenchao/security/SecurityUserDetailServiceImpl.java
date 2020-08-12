package com.yuwenchao.security;



import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.yuwenchao.bean.UserInfo;
import com.yuwenchao.bean.UserInfoExample;
import com.yuwenchao.bean.UserInfoExample.Criteria;
import com.yuwenchao.mapper.UserInfoMapper;

@Service
public class SecurityUserDetailServiceImpl implements UserDetailsService {
	Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	UserInfoMapper adminMapper;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserInfoExample example = new UserInfoExample();
		example.createCriteria().andLoginacctEqualTo(username);
		List<UserInfo> list = adminMapper.selectByExample(example);
		if(!list.isEmpty()&&list.size()==1) {
			UserInfo userInfo = list.get(0);
			//new User(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities)
			//Set<GrantedAuthority> authorities = new HashSet<>();
			//return new TSecurityAdmin(userInfo,authorities);
			return new TSecurityAdmin(userInfo,null);
		}
		
		return null;
	}

}
