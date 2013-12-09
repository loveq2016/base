<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="../../common/common.jsp" %>
</head>
<body>
	<c:set var="namespace" value="user"></c:set>
	<table class="easyui-datagrid" style="height: 515px;" url="<c:url value="/system/user/find"> </c:url>" id="${namespace }Grid"  title="用户数据" data-options="onDblClickCell: function(index,field,value){initUpdate('${module }','execute/user/findById');}" singleSelect="true" rownumbers="true" pagination="true" toolbar="#tbUser">
		<thead>
			<tr>
				<th field="id" hidden="true">id</th>
				<th field=userName width="60">用户名</th>
				<th field="fullName" width="80">真实姓名</th>
				<th field="mobile" width="80">移动电话</th>
				<th field="age" width="80">年龄</th>
				<th field="gender" width="80">性别</th>
				<th field="status" width="80">状态</th>
				<th field="creationTime" width="200" formatter=dateFormatByEasyui>创建时间</th>
				<th field="action" width="200" formatter="userAction">操作</th>
			</tr>
		</thead>
	</table>

	<div id="tbUser" style="padding: 5px; height: auto">
		<div style="margin-bottom: 5px">
			<sec:authorize access="hasRole('USER_ADD')">
				<a href="javascript:void(0);" onclick="common_add('添加用户','<c:url value="/system/user/showView?action=1001"> </c:url>',400,420);" class="easyui-linkbutton" iconCls="icon-add" plain="true" title="添加">添加</a>
			</sec:authorize>
			<sec:authorize access="hasRole('USER_UPDATE')">
				<a href="javascript:void(0);" onclick="initUpdate('${namespace }','execute/user/findById');" class="easyui-linkbutton" iconCls="icon-edit" plain="true" title="编辑">编辑</a>
			</sec:authorize>
			<sec:authorize access="hasRole('USER_ASSIGN_ROLE')">
				<a href="javascript:void(0);" class="easyui-linkbutton" onclick="assignRole('${namespace }');" plain="true" title="分配角色">分配角色</a>
			</sec:authorize>
		</div>
		<div id="${module }SearchDiv">
			用户名: <input style="width: 80px" name="userName"> 年龄: <input name="age" style="width: 60px" class="easyui-numberbox" data-options="required:false"> 到 <input name="age" style="width: 60px" class="easyui-numberbox" data-options="required:false">之间 性别: <select class="easyui-combobox" name="gender">
				<option value="男">男</option>
				<option value="女">女</option>
			</select> <a href="javascript:void(0);" onclick="searchData('${module }');" class="easyui-linkbutton" iconCls="icon-search">搜索</a>
		</div>
	</div>
	
	<script type="text/javascript" src="<c:url value="/static/js/system/user/user.js"></c:url>"></script>
</body>
</html>