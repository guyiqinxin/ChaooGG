<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>员工详细信息打印列表</title>
<%@include file="/WEB-INF/include/common-js.jsp"%>
<script type="text/javascript">
var time =layer.load(3,{time:0.5*1000});

</script>
</head>
<body>

<div class="page-header">
  <h2>带条件查询员工信息表 <small>报表输入框验证信息持续开发中......</small></h2>
  <form class="form-inline" action="showempVoCondition">
   <div class="form-group">
    <label for="exampleInputName2">员工编号</label>
    <input type="text"  name ="id" class="form-control"  placeholder="请输入员工编号">
  </div>
    
  <div class="form-group">
    <label for="exampleInputName2">员工姓名</label>
    <input type="text" name ="firstName" class="form-control" placeholder="请输入员工姓名关键字">
  </div>
  
   <div class="form-group">
    <label for="exampleInputName2">员工年龄</label>
    <input type="num"  name ="firstAge" class="form-control" placeholder="请输入员年龄">
  </div>
&ensp;&ensp;
<label for="exampleInputName2">员工性别</label>
&ensp;&ensp;&ensp;
<input type="radio" name="firstGender" id="thishidden" value="" checked="checked">
<label class="radio-inline">
<input type="radio" name="firstGender" id="inlineRadio1" value="男"> 男
</label>
<label class="radio-inline">
  <input type="radio" name="firstGender" id="inlineRadio2" value="女"> 女
</label>
 
&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;&ensp;
<label for="exampleInputName2">公司性质</label>
<select class="form-control" id="deptDN" name='deptNature'>
  <option value="">请选择公司性质</option>
  <option value="国有企业">国有企业</option>
  <option value="民有企业">民有企业</option>
  <option value="个人企业">个人企业</option>
  <option value="私有企业">私有企业</option>
  <option value="其他性质">其他性质</option>
</select>
  
  <div class="form-group">
    <label for="exampleInputName2">员工邮箱</label>
    <input type="text"  name ="firstEmail" class="form-control" placeholder="请输入员工邮箱关键字">
  </div>
  
  
   <div class="form-group">
    <label for="exampleInputName2">员工地址</label>
    <input type="text"  name ="firstAddress" class="form-control" placeholder="请输入员工地址关键字">
  </div>
  
   <div class="form-group">
    <label for="exampleInputName2">员工薪资</label>
    <input type="num"  name ="firstSalary" class="form-control" placeholder="请输入员工薪资关键数字">
  </div>
  
  <div class="form-group">
    <label for="exampleInputName2">员工公司</label>
    <input type="num"  name ="deptName" class="form-control" placeholder="请输入员工公司关键字">
  </div>
  
 <div class="form-group">
    <label for="exampleInputName2">员工电话</label>
    <input type="number"  name ="firstPhone" class="form-control" placeholder="请输入员工电话">
  </div>
<br/><br/>
   <button type="submit" style="margin-left: 60px" class="btn btn-primary" id="showOK">打印预览</button>
   <button type="reset" style="margin-left: 20px" class="btn btn-warning">数据重置</button>
</form>
</div>
 <a type="button" href="toiReportPage" style="margin-left: 60px" class="btn btn-success">返回上一层</a>
</body>
<script type="text/javascript"> 
//隐藏
$("#thishidden").hide()
$("#showOK").click(function(){
	   var id= $("input[name='id']").val();
	   var firstName= $("input[name='firstName']").val();
	   var firstAge= $("input[name='firstAge']").val();
	   var firstGender= $("input[name='firstGender']:checked").val();
	   var firstEmail= $("input[name='firstEmail']").val();
	   var firstAddress= $("input[name='firstAddress']").val();
	   var firstSalary= $("input[name='firstSalary']").val();
	   var deptName= $("input[name='deptName']").val();
	   var firstPhone= $("input[name='firstPhone']").val();
	   var deptNature= $("#deptDN option:selected").val();    
/* 	   
	   alert(id);
	   alert(firstName);
	   alert(firstAge);
	   alert(firstGender);
	   alert(firstEmail);
	   alert(firstAddress);
	   alert(firstSalary);
	   alert(deptName);
	   alert(firstPhone);
	   alrert(deptNature); */
      if(id==""&&firstName==""&&firstAge==""&&firstGender==""
    	&&firstEmail==""&&firstAddress==""&&firstSalary==""&&deptName==""
    	&&firstPhone==""&&deptNature==""){
    	   layer.confirm("你未输入任何条件将查询所有信息？",{icon: 3,title:'提示信息'},function(index){
    		   window.location.href="showempVoCondition"
    	   });
    	   return false;
    	   layer.close(index);
       } 
    	   
});




</script>
</html>