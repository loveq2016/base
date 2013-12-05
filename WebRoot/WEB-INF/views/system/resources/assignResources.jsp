<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="easyui-layout" style="width: 100%; height: 100%;">
	<div data-options="region:'east',split:true" title="已经存在访问资源" style="width: 220px;height: 100%;">
		<a href="javascript:void(0)" class="easyui-linkbutton" iconcls="icon-add" onclick="addRoleResources(${param.roleId });">添加访问资源</a> <br>
		<table class="easyui-datagrid" style="height:465px;" roleId="${param.roleId }" id="existResourcesGrid" data-options="rownumbers:true,singleSelect:true,collapsible:true,url:'system/resources/findByRoleId?roleId=${param.roleId }',method:'get',pageSize:20">
			<thead>
				<tr>
					<th data-options="field:'id',hidden:true">
					</th>
					<th data-options="field:'name',width:100">
						资源名
					</th>
					<th field="action" formatter="assignResourcesAction">操作</th>
				</tr>
			</thead>
		</table>
	</div>
	<div data-options="region:'center'">
		<%@include file="find.jsp"%>
	</div>
</div>
<script type="text/javascript" src="static/js/system/resources/resources.js"></script>