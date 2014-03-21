<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/common/taglibs.jsp"%>
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="../../common/common.jsp"%>
</head>
<body>
	<table  class="easyui-datagrid" fit="true" id="grid"  url="system/role/find" title="角色数据" singleSelect="true" rownumbers="true" pagination="true" toolbar="#tb">
		<thead>
			<tr>
				<th field="id" hidden="true">id</th>
				<th field=name width="80">角色名</th>
				<th field="creationTime" width="200" formatter=dateFormatByEasyui>创建时间</th>
				<th field="action" width="200" formatter="roleAction">操作</th>
			</tr>
		</thead>
	</table>

	<div id="tb" style="padding: 5px; height: auto">
		<div style="margin-bottom: 5px">
			<a href="javascript:void(0);" onclick="add('system/role/showView?action=1001','添加用户',400,280);" class="easyui-linkbutton" iconCls="icon-add" plain="true" title="添加">添加</a> 
			<a href="javascript:void(0);" onclick="update('system/role/showView?action=1002','修改用户',400,420);" class="easyui-linkbutton" iconCls="icon-edit" plain="true" title="编辑">编辑</a>
			<a href="javascript:void(0);" class="easyui-linkbutton" onclick="assignResources('${namespace }');" plain="true" title="分配访问资源">分配访问资源</a>
		</div>
		<div id="searchDiv">
			角色名: <input style="width: 80px" name="name"> 
			<a href="javascript:void(0);" onclick="searchData();" class="easyui-linkbutton" iconCls="icon-search">搜索</a>
		</div>
	</div>
	<script type="text/javascript" src="static/js/system/role/role.js"></script>
</body>
</html>