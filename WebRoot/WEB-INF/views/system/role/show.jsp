<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/common/taglibs.jsp"%>
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="../../common/common.jsp"%>
</head>
<body>
	<c:set var="namespace" value="role"></c:set>
	<input type="hidden" id="namespace" value="${namespace }" />
	<table  class="easyui-datagrid" fit="true" id="roleGrid"  url="system/role/find" title="角色数据" singleSelect="true" rownumbers="true" pagination="true" toolbar="#tb">
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
			<a href="javascript:void(0);" onclick="addModel('Role');" class="easyui-linkbutton" iconCls="icon-add" plain="true" title="添加"></a> <a href="javascript:void(0);" class="easyui-linkbutton" iconCls="icon-edit" plain="true" title="编辑"></a> <a href="javascript:void(0);" class="easyui-linkbutton" onclick="assignResources('${namespace }');" plain="true" title="分配访问资源">分配访问资源</a>
		</div>
		<div>
			Date From: <input class="easyui-datebox" style="width: 80px"> To: <input class="easyui-datebox" style="width: 80px" type="text"> Language: <select class="easyui-combobox" panelHeight="auto" style="width: 100px">
				<option value="java">Java</option>
				<option value="c">C</option>
				<option value="basic">Basic</option>
				<option value="perl">Perl</option>
				<option value="python">Python</option>
			</select> <a href="javascript:void(0);" class="easyui-linkbutton" iconCls="icon-search">Search</a>
		</div>
	</div>
	<script type="text/javascript" src="static/js/system/role/role.js"></script>
</body>
</html>