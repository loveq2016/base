<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/common/taglibs.jsp"%>
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="../../common/common.jsp"%>
</head>
<body>
	<table  class="easyui-datagrid" fit="true" id="grid"  url="system/role/find" title="角色数据" singleSelect="true" 
	    data-options="<sec:authorize access="hasRole('ROLE_UPDATE')">onDblClickCell: function(index,field,value){update('system/role/showView/1002','修改角色',400,420);}</sec:authorize>" 
	    rownumbers="true" pagination="true" toolbar="#tb">
		<thead>
			<tr>
				<th field="id" hidden="true">id</th>
				<th field=name width="80">角色名</th>
				<th field="creationTime" width="200" formatter=dateFormatByEasyui>创建时间</th>
				<th field="action" width="200" <sec:authorize access="hasRole('ROLE_DELETE')">  formatter="roleAction" </sec:authorize>>操作</th>
			</tr>
		</thead>
	</table>

	<div id="tb" style="padding: 5px; height: auto">
		<div style="margin-bottom: 5px">
		    <sec:authorize access="hasRole('ROLE_ADD')">
				<a href="javascript:void(0);" onclick="add('system/role/showView/1001','添加角色',400,280);" class="easyui-linkbutton" iconCls="icon-add" plain="true" title="添加">添加</a> 
			</sec:authorize>
			<sec:authorize access="hasRole('ROLE_UPDATE')">
			    <a href="javascript:void(0);" onclick="update('system/role/showView/1002','修改角色',400,420);" class="easyui-linkbutton" iconCls="icon-edit" plain="true" title="编辑">编辑</a>
			</sec:authorize>
			<sec:authorize access="hasRole('ROLE_ASSIGN_RESOURCES')">
			    <a href="javascript:void(0);" class="easyui-linkbutton" onclick="assignResources();" plain="true" title="分配访问资源">分配访问资源</a>
			</sec:authorize>
		</div>
		<div id="searchDiv">
		    <sec:authorize access="hasRole('ROLE_FIND')">
				角色名: <input style="width: 80px" name="name"> 
				<a href="javascript:void(0);" onclick="searchData();" class="easyui-linkbutton" iconCls="icon-search">搜索</a>
			</sec:authorize>
		</div>
	</div>
	<script type="text/javascript" src="static/js/system/role/role.js"></script>
	<script type="text/javascript" src="static/js/common/enterSearch.js"> </script>
</body>
</html>