<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/common/taglibs.jsp"%>
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="../../common/common.jsp"%>
</head>
<body>
	<table  class="easyui-treegrid" fit="true" id="grid"  url="system/resources/find" title="资源数据" singleSelect="true" 
	    data-options="<sec:authorize access="hasRole('RESOURCES_UPDATE')">onDblClickCell: function(index,field,value){update('system/resources/showView/1002','修改资源',400,420);}</sec:authorize>" 
	    rownumbers="true"  idField="id" 
                treeField="name"  pagination="true" toolbar="#tb">
		<thead>
			<tr>
				<th field="id" hidden="true">id</th>
				<th field="name" width="180">权限名</th>
				<th field="linkUrl" width="220">URL</th>
				<th field="sequence" width="50">排序号</th>
				<th field="typeText" width="80">资源类型</th>
				<th field="code" width="140">资源code</th>
				<th field="creationTime" width="120" formatter=dateFormatByEasyui>创建时间</th>
				<th field="action" width="80"  <sec:authorize access="hasRole('RESOURCES_DELETE')"> formatter="resourcesAction" </sec:authorize> >操作</th>
			</tr>
		</thead>
	</table>

	<div id="tb" style="padding: 5px; height: auto">
		<div style="margin-bottom: 5px">
		    <sec:authorize access="hasRole('RESOURCES_ADD')">
				<a href="javascript:void(0);" onclick="add('system/resources/showView/1001','添加资源',400,380);" class="easyui-linkbutton" iconCls="icon-add" plain="true" title="添加">添加</a> 
			</sec:authorize>
			<sec:authorize access="hasRole('RESOURCES_UPDATE')">
				<a href="javascript:void(0);" onclick="update('system/resources/showView/1002','修改资源',400,420);" class="easyui-linkbutton" iconCls="icon-edit" plain="true" title="编辑">编辑</a>
			</sec:authorize>
		</div>
		<div id="searchDiv">
		    <sec:authorize access="hasRole('RESOURCES_FIND')">
				
			</sec:authorize>
		</div>
	</div>
	<script type="text/javascript" src="static/js/system/resources/resources.js"></script>
	<script type="text/javascript" src="static/js/common/enterSearch.js"> </script>
</body>
</html>