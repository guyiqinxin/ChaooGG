<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<jsp:useBean id="date" class="java.util.Date" />
<!DOCTYPE html>
<html>
<head> 
<meta charset="UTF-8">
<title>登录页面</title>
<%@include file="/WEB-INF/include/common-js.jsp"%>
<script type="text/javascript">
$(function(){
$("#welcome").click(function(){
	layer.alert("ChaooGG系统，采用jdk8,ssm框架,mysql数据库,druid连接池,logback日志,Bootstrap前端框架,layer弹出层,iReport报表,"+
	"MBG逆向生成,pageHelper、kaptcha插件、AJAX验证等前后端相关技术整合开发而成!&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;"+
	"&ensp;&ensp;"
	+"开发：余文超 &ensp;&ensp;&ensp;时间：2020年6月");
	
})
var i = 0;
//给验证码图片绑定单机事件，点击切换验证码
$("#codeImg").click(function(){	
	this.src = "code.jpg?t="+(i++);	
});
});
</script>
</head>
<body>
<div class="jumbotron" align="center">
  <h1>欢迎登录ChaooGG</h1>
  <small class="warning"  style="margin-left: 400px">&ensp;&ensp;&ensp;&ensp;<fmt:formatDate value="${date}" type="both" dateStyle="long" pattern="yyyy年MM月dd日 HH:mm:ss" />
 <button type="button"  class="btn btn-default btn-xs" onclick="javascript:window.location.reload()">
  刷新
</button>
  </small>
<!--   <p><a class="btn btn-primary btn-lg" id="welcome" role="button">系统详情</a></p> -->
 <br> 
  <!-- Button trigger modal -->
<button type="button" class="btn btn-success btn-lg" data-toggle="modal" data-target="#myModal">
 系统详情 
</button>

<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">关于ChaooGG</h4>
      </div>
      <div class="modal-body">
      <div class="alert alert-success" role="alert">&ensp;&ensp;&ensp;ChaooGG系统为SSM基础知识练习，采用jdk8,ssm框架,mysql数据库,druid连接池,logback日志,Bootstrap前端框架,layer弹出层,
		iReport报表,MBG逆向生成,pageHelper、kaptcha插件、AJAX验证等前后端相关技术整合开发而成! </div>		
<div class="alert alert-warning">开发：余文超&ensp;&ensp;&ensp;&ensp;时间：2020年6月</div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-info" data-dismiss="modal">确定</button>
       <!--  <button type="button" class="btn btn-primary">Save changes</button> -->
      </div>
    </div>
  </div>
</div>
<br><br>

  <form  class="form-group" id="loginfrom"  action="${APP_PATH }/newlogin"   method="post">
  
<%--   <div class="alert alert-danger alert-dismissible" role="alert">
  <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
  <strong>${errorMsg }</strong>
</div> --%>
         <c:if test="${!empty errorMsg}">
				<div style="width: 200px;height: 50px" class="alert alert-danger alert-dismissible" role="alert">
					<button type="button" class="close" data-dismiss="alert"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<strong>${errorMsg}</strong>
				</div>
			</c:if>
  
  <div class="form-group" >
    <label for="exampleInputEmail1">用户账号</label>
    <input type="tel"  name="loginacct"    class="form-control.col-lg" id="userid" placeholder="请输入用户名" value="${loginacct }">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">用户密码</label>
    <input type="password" name="userpswd"  class="form-control.col-lg" id="pswdid" placeholder="请输入密码">
  </div>
  
  <div class="form-group has-warning has-feedback">
  <label class="control-label" for="inputWarning2">验证码：</label>
  <input type="text" class="form-control.col-lg" id="inputWarning2"  name="code"  placeholder="请输入验证码">
 
</div>
   <img  id= "codeImg" alt="" src="code.jpg" style="width: 120px;height: 35px;" title="点击更换图片">
  
  <div class="checkbox">
    <label>
      <input type="checkbox" name="rememberMe" id="rememberMe" onclick="remember()"> 记住用户
    </label>
  </div>
  <button type="submit" class="btn btn-success" id='submitlogin' onclick="dologin()" style="margin-left: 50px">登录</button>
  <button type="reset" class="btn  btn-warning">重置</button>
  <button type="button" class="btn  btn-info">注册</button>
</form>


  <a class="btn btn-success" href="index.jsp" >返回上一层</a>
</div>
</body>
<script type="text/javascript">
$("#submitlogin").click(function(){
	var loginacct =$("input[name='loginacct']").val();
	var userpswd =$("input[name='userpswd']").val();
 if(loginacct==''){
		layer.tips("请输入用户名！","#userid");
		return false;
		
 }	
  if(userpswd==''){
	  layer.tips("请输入密码！","#pswdid");
		return false;
}else{
	 $("#loginfrom").submit();	
}

});

/* function dologin(){

 $("#loginfrom").submit();	
} */

$("input[name='loginacct']").change(function(){
	var loginacct = this.value;
	//alert(loginacct);
	 $.ajax({
		url:"checkLoginacct",
		type:"POST",
		data:{
			"loginacct":loginacct
		},
		success : function(result){
			
			if(result.loginacct==loginacct){
				layer.tips("恭喜你，用户可用","#userid")
			}else{
				layer.tips("该用户不存在！","#userid")
			}
		}
	}); 
});

</script>
</html>