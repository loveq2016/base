<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="../../common/taglibs.jsp"%>

<div class="easyui-dialog"  id="editRoleDiv" >
	<div style="padding: 10px 0 10px 60px">
		<form id="editRoleForm" method="post" action="system/role/save">
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
		</form>
	</div>
	<div style="text-align: center; padding: 5px">
		<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm('Role')">提交</a> <a href="javascript:void(0)" class="easyui-linkbutton" onclick="$('#editRoleForm').form('reset');">重置</a>
	</div>
</div>