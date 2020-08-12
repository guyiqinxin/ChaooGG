package com.yuwenchao.exception;
//自定义 用户异常
public class UserInfoException extends RuntimeException {

	//1写异常的构造器  创建多个异常的枚举   构造器中传入枚举
	public UserInfoException(UserExceptionEnum userenum){
		//如果在页面还想显示
		super(userenum.getMsg());
//例如以下：		
//		long l = adminMapper.countByExample(example);
//		if (l > 0) {
//			//别人已经占用了邮箱;异常机制
		     //注意错误消息 不能多处页面跳转回显
//		    model.addAttribute("msg", e.getMsg());
//			throw new UserException(UserExceptionEnum.EMAIL_EXIST);
//		}
		
		
	}
	
}
