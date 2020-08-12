<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>员工带条件查询列表</title>
<%@include file="/WEB-INF/include/common-js.jsp"%>
<script type="text/javascript">
$(function(){
$("#iReInfo").click(function(){
	layer.alert("报表系统支持iReport报表的预览、下载、打印！")
})	
});


</script>
</head>
<body>
<div class="jumbotron">
  <h2>报表管理系统</h2>
  <br/>
  <p><a class="btn btn-primary btn-lg" id="iReInfo" href="#" role="button">报表须知</a></p>
  <br/>
  <h3><a href="ireport" target="_blank">测试报表-测试报表打印</a><h3>
  
 <!--    <h3><a href="showempVo" target="_blank">FirstEmp-测试报表打印</a><h3> -->
    
     <h3><a href="toshowempVoCondition"  target="_blank">FirstEmp-条件测试报表打印</a><h3>
<br/><br/>

  <a class="btn btn-success" href="index.jsp" >返回上一层</a>
</div>



</body>
</html>