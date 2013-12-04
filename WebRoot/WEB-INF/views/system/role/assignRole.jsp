<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<div class="easyui-layout" style="width: 100%; height: 100%;">
	<div data-options="region:'east',split:true" title="已经存在的角色" style="width: 220px;height: 100%;">
		<a href="javascript:void(0)" class="easyui-linkbutton" iconcls="icon-add" onclick="addUserRole(${param.userId });">添加角色</a> <br>
		<table class="easyui-datagrid" style="height:465px;" id="existGrid" data-options="rownumbers:true,singleSelect:true,collapsible:true,url:'system/role/findByUserId?userId=${param.userId }',method:'get',pageSize:20">
			<thead>
				<tr>
					<th data-options="field:'id',hidden:true">
					</th>
					<th data-options="field:'name',width:100">
						角色名
					</th>
					<th field="action" formatter="assignRoleAction">操作</th>
				</tr>
			</thead>
		</table>
	</div>
	<div data-options="region:'center'">
		<%@include file="../role/find.jsp"%>
	</div>
</div>
<script type="text/javascript" src="static/js/system/userRole/userRole.js"></script>