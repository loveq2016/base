<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="../../common/taglibs.jsp" %> 
<div style="padding: 10px 0 10px 60px">
	<form:form id="roleEditForm" method="post" action="system/role/save" modelAttribute="role">
		<table>
			<tr>
				<td>用户名:</td>
				<td><input class="easyui-validatebox" validType="length[0,20]" type="text" name="name" data-options="required:true"></input></td>
			</tr>
			<tr>
				<td>描述:</td>
				<td><textarea name="description" validType="length[0,200]" style="height: 60px;" data-options="required:false"></textarea></td>
			</tr>
		</table>
	</form:form>
</div>
<div style="text-align: center; padding: 5px">
	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm('user')">提交</a> <a href="javascript:void(0)" class="easyui-linkbutton" onclick="$('#roleEditForm').form('reset');">重置</a>
</div>