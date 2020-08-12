<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>员工上传下载列表</title>
<%@include file="/WEB-INF/include/common-js.jsp"%>
<script type="text/javascript">
$(function(){
$("#welcome").click(function(){
	layer.alert("文件上传下载功能仅为测试功能!");	
})
});
</script>
</head>
<body>

<div class="jumbotron">
  <a class="btn btn-primary btn-lg" id="welcome" role="button">详情</a>
  <br>
  <br>
<form  action="upload" method="post" id="fromid" enctype="multipart/form-data">  

<div class="form-group">
    <label for="exampleInputFile">请选择你要上传的文件</label>
    <input type="file"  name="file" id="uploadid">
    <p class="help-block">上传文件大小不能超过...MB</p>
  </div>
        <input type="submit" onclick="submitfile()" value="上传">  
    </form>  
    <hr>  
    <form action="down" method="get">  
        <input type="submit" value="下载" id="xiazai" >  
    </form>  
    <br>
    <br>
    <a class="btn btn-success" href="index.jsp" >返回上一层</a>
</div>   
</body>
<script type="text/javascript">
function submitfile(){
	var fileInput = $('#uploadid').val();
if(fileInput==""){
	alert("你没有选择要上传的文件!!!")
  }
         //alert("不为什么不执行？")
	     //没有执行
		//$("#fromid").submit();
        window.location.href="upload" 
} 
	var tips;
$("#xiazai").on({
	mouseenter:function(){
		var that =this;
		tips=layer.tips("<span style='color: #000;'>下载功能为测试下载自定义单个文件！该功能仅做参考</span>",
        that,{tips:[2,'#fff'],time:0,area:'auto',maxWidth:500});	
	},
	mouseleave:function(){
		layer.close(tips);
	}
});	
	

</script>
</html>