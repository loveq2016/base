<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div style="padding: 10px 0 10px 60px">
	<form id="editResourcesForm" method="post" action="system/resources/save">
		<table>
			<tr>
				<td>资源名:</td>
				<td><input class="easyui-validatebox" validType="length[0,20]" type="text" name="name" data-options="required:true"></input></td>
			</tr>
			<tr>
				<td>URL:</td>
				<td><input class="easyui-validatebox" validType="length[0,20]" type="text" name="linkUrl" data-options="required:true"></input></td>
			</tr>
			<tr>
				<td>排序号:</td>
				<td><input class="easyui-numberbox" type="text" name="sequence" data-options="required:true"></input></td>
			</tr>
			<tr>
				<td>资源类型:</td>
				<td></td>
			</tr>
			<tr>
				<td>描述:</td>
				<td><textarea name="description" rows="5" validType="length[0,200]" style="height: 60px;" data-options="required:false"></textarea></td>
			</tr>
		</table>
	</form>
</div>
<div style="text-align: center; padding: 5px">
	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm('Resources')">提交</a> <a href="javascript:void(0)" class="easyui-linkbutton" onclick="$('#editResourcesForm').form('reset');">重置</a>
</div>
