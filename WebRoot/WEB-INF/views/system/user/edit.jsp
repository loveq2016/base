<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="../../common/taglibs.jsp" %> 
<div style="padding: 10px 0 10px 60px">
	<form:form id="userEditForm" method="post" action="system/user/save" modelAttribute="user" >
		<table>
			<tr>
				<td>用户名:</td>
				<td>
				   <form:hidden path="id"/>
				   <form:input path="userName" class="easyui-validatebox" validType="length[4,20]" type="text" name="userName" onblur="isExist();" data-options="required:true"/>
				</td>
			</tr>
			<tr>
				<td>密码:</td>
				<td>
				   <form:input path="password" class="easyui-validatebox" validType="length[6,20]" type="password" name="password" data-options="required:true"/>
				</td>
			</tr>
			<tr>
				<td>Email:</td>
				<td>
				  <form:input path="mail" class="easyui-validatebox" type="text"  data-options="required:false,validType:'email'"/> 
				</td>
			</tr>
			<tr>
				<td>移动电话:</td>
				<td>
				    <form:input path="mobile" class="easyui-validatebox"  name="mobile" data-options="required:false"/>
				</td>
			</tr>
			<tr>
				<td>真实姓名:</td>
				<td>
				  <form:input path="fullName" class="easyui-validatebox" validType="length[0,20]" type="text" name="fullName" data-options="required:false"/>
				</td>
			</tr>
			<tr>
				<td>年龄:</td>
				<td>
				    <form:input path="age" class="easyui-numberbox"  data-options="required:false"/>
				</td>
			</tr>
			<tr>
				<td>性别:</td>
				<td>
				    <form:select class="easyui-combobox" path="gender">
				        <form:option value="男">男</form:option>
				        <form:option value="女">女</form:option>
				    </form:select>    
				</td>
			</tr>
			<tr>
				<td>描述:</td>
				<td>
				   <form:textarea path="description" validType="length[0,200]" style="height: 60px;" data-options="required:false"/>
				</td>
			</tr>
		</table>
	</form:form>
</div>
<div style="text-align: center; padding: 5px">
	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm('user')">提交</a> <a href="javascript:void(0)" class="easyui-linkbutton" onclick="$('#userEditForm').form('reset');">重置</a>
</div>
