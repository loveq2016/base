<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div style="padding: 10px 0 10px 60px">
	<form:form action="system/resources/save" id="resourcesEditForm" method="post" modelAttribute="resources">
	   <form:hidden path="id"/>
	   <form:hidden path="parentId"/>
		<table>
			<tr>
				<td>资源名:</td>
				<td><form:input path="name" class="easyui-validatebox" validType="length[0,20]" data-options="required:true" /></td>
			</tr>
			<tr>
				<td>URL:</td>
				<td><form:input path="linkUrl" class="easyui-validatebox"  validType="length[0,20]" type="text" data-options="required:true" /></td>
			</tr>
			<tr>
				<td>排序号:</td>
				<td><form:input path="sequence" class="easyui-numberbox" data-options="required:true" /></td>
			</tr>
			<tr>
				<td>资源类型:</td>
				<td><form:select path="type" items="${resourcesType }" ></form:select> </td>
			</tr>
			<tr>
				<td>code:</td>
				<td><form:input path="code" class="easyui-validatebox"  data-options="required:true" /></td>
			</tr>
			<tr>
				<td>描述:</td>
				<td><form:textarea path="description"  rows="5" validType="length[0,200]" style="height: 60px;" data-options="required:false" /></td>
			</tr>
		</table>
	</form:form>
</div>
<div style="text-align: center; padding: 5px">
	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm('resources')">提交</a> <a href="javascript:void(0)" class="easyui-linkbutton" onclick="$('#editResourcesForm').form('reset');">重置</a>
</div>
<script type="text/javascript" src="static/js/system/resources/resources.js"></script>