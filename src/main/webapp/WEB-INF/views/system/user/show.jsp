<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/common/taglibs.jsp" %>
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@include file="../../common/common.jsp" %>
</head>
<body>
	<table class="easyui-datagrid" fit="true" style="height: 515px;" url="<c:url value="/system/user/find"> </c:url>" id="grid"  title="用户数据" 
	     data-options="<sec:authorize access="hasRole('USER_UPDATE')">onDblClickCell: function(index,field,value){update('system/user/showView/1002','修改用户',400,420);}</sec:authorize>" 
	     singleSelect="true" rownumbers="true" pagination="true" toolbar="#tbUser">
		<thead>
			<tr>
				<th field="id" hidden="true">id</th>
				<th field=userName width="60">用户名</th>
				<th field="fullName" width="80">真实姓名</th>
				<th field="mobile" width="80">移动电话</th>
				<th field="age" width="80">年龄</th>
				<th field="genderText" width="80">性别</th>
				<th field="status" width="80">状态</th>
				<th field="description" width="150">描述</th>
				<th field="creationTime" width="200" formatter="dateFormatByEasyui">创建时间</th>
				<th field="action" width="200" <sec:authorize access="hasRole('USER_DELETE')"> formatter="userAction" </sec:authorize> >操作</th>
			</tr>
		</thead>
	</table>

	<div id="tbUser" style="padding: 5px; height: auto">
		<div style="margin-bottom: 5px">
			<sec:authorize access="hasRole('USER_ADD')">
				<a href="javascript:void(0);" onclick="add('system/user/showView/1001','添加用户',400,420);" class="easyui-linkbutton" iconCls="icon-add" plain="true" title="添加">添加</a>
			</sec:authorize>
			<sec:authorize access="hasRole('USER_UPDATE')">
				<a href="javascript:void(0);" onclick="update('system/user/showView/1002','修改用户',400,420);" class="easyui-linkbutton" iconCls="icon-edit" plain="true" title="编辑">编辑</a>
			</sec:authorize>
			<sec:authorize access="hasRole('USER_RESET_PASSWORD')">
				<a href="javascript:void(0);" class="easyui-linkbutton" onclick="toResetPassword();" plain="true" title="重置密码">重置密码</a>
			</sec:authorize>
			<sec:authorize access="hasRole('USER_ASSIGN_ROLE')">
				<a href="javascript:void(0);" class="easyui-linkbutton" onclick="assignRole();" plain="true" title="分配角色">分配角色</a>
			</sec:authorize>
		</div>
		<div id="searchDiv">
		    <sec:authorize access="hasRole('USER_FIND')">
				用户名: <input style="width: 80px" name="userName"> 
				年龄: <input name="age" style="width: 60px" class="easyui-numberbox" data-options="required:false"> 到 <input name="provisional" style="width: 60px" class="easyui-numberbox" data-options="required:false">之间 
				性别: <select class="easyui-combobox" name="gender">
						 <option value="">全部...</option>
				         <c:forEach items="${userGender }" var="gender">
				             <option value="${gender.key }">${gender.value }</option>
				         </c:forEach>
					  </select> 
				<a href="javascript:void(0);" onclick="searchData();" class="easyui-linkbutton" iconCls="icon-search">搜索</a>
			</sec:authorize>
		</div>
	</div>
	 
	<script type="text/javascript" src="<c:url value="/static/js/system/user/user.js"></c:url>"></script>
	<script type="text/javascript" src="static/js/common/validatebox_rules.js"> </script>
	<script type="text/javascript" src="static/js/common/enterSearch.js"> </script>
</body>
</html>