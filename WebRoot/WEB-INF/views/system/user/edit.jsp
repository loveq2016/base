<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="../../common/taglibs.jsp" %> 
<div style="padding: 10px 0 10px 60px">
	<form id="userEditForm" method="post" action="<c:url value="/system/user/save"></c:url>">
		<table>
			<tr>
				<td>用户名:</td>
				<td><input class="easyui-validatebox" validType="length[4,20]" type="text" name="userName" onblur="isExist(this);" data-options="required:true"></input> <input type="hidden" name="id"></input></td>
			</tr>
			<tr>
				<td>密码:</td>
				<td><input class="easyui-validatebox" validType="length[6,20]" type="password" name="password" data-options="required:true"></input></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input class="easyui-validatebox" type="text" name="email" data-options="required:false,validType:'email'"></input></td>
			</tr>
			<tr>
				<td>移动电话:</td>
				<td><input class="easyui-validatebox" type="text" name="mobile" data-options="required:false"></input></td>
			</tr>
			<tr>
				<td>真实姓名:</td>
				<td><input class="easyui-validatebox" validType="length[0,20]" type="text" name="fullName" data-options="required:false"></input></td>
			</tr>
			<tr>
				<td>年龄:</td>
				<td><input class="easyui-numberbox" type="text" name="age" data-options="required:false"></input></td>
			</tr>
			<tr>
				<td>性别:</td>
				<td><select class="easyui-combobox" name="gender">
						<option value="男">男</option>
						<option value="女">女</option>
				</select></td>
			</tr>
			<tr>
				<td>描述:</td>
				<td><textarea name="description" validType="length[0,200]" style="height: 60px;" data-options="required:false"></textarea></td>
			</tr>
		</table>
	</form>
</div>
<div style="text-align: center; padding: 5px">
	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm('user')">提交</a> <a href="javascript:void(0)" class="easyui-linkbutton" onclick="$('#${module }EditForm').form('reset');">重置</a>
</div>
