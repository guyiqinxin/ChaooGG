<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<jsp:useBean id="date" class="java.util.Date" />    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首页</title>
<%@include file="/WEB-INF/include/common-js.jsp"%>
<script type="text/javascript">
//layer.alert("hello")

</script>
</head>
<body>
<div class="page-header">
  <h1>欢迎进入我的ChaooGG&ensp;&ensp;&ensp;&ensp;&ensp;<small>测试页面继续开发中......</small></h1>
  <div class="alert alert-success" role="alert">   <h3 >&ensp;&ensp;&ensp;&ensp;<fmt:formatDate value="${date}" type="both" dateStyle="long" pattern="yyyy年MM月dd日 HH:mm:ss" />
 <button type="button"  class="btn btn-xs" onclick="javascript:window.location.reload()">
  刷新
</button>
  </h3></div>
<h1><a href="topageone">点击跳转消息提示页面</a></h1>

<h1><a href="login.jsp">点击跳转系统登录页面</a></h1>

<h1><a href="toEmpPage">点击跳转员工列表页面</a></h1>

<h1><a href="toupload">点击跳转文件上传页面</a></h1>

<h1><a href="toiReportPage">点击跳转员工报表页面</a></h1>

<h1><a href="${APP_PATH }/bootstrap/index.html"  target="_blank">点击跳转bootstrap页面</a></h1>
</div>




</body>

</html>