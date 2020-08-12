<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>员工提示消息列表</title>
<%@include file="/WEB-INF/include/common-js.jsp"%>
</head>
<body>
<h1  class="alert alert-success" role="alert">CONTROLLER提示信息！！！</h1>
<c:if test="${!empty msg }">${msg }</c:if>
    <c:if test="${!empty error }">
    
    <div class="alert alert-danger alert-dismissible" role="alert">
  <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
  <strong>Warning!</strong> ${error }
</div>
    </c:if>
<c:if test="${!empty newFile }">
<h3>文件上传成功！<span class="label label-success">success</span></h3>
<div class="alert alert-info" role="alert">文件详情：${newFile }</div>
</c:if>
<br/>
 
  <a class="btn btn-info" href="toupload" >返回文件上传页面</a>
<br><br>
  <a class="btn btn-success" href=index.jsp >返回首页</a>
</body>
</html>