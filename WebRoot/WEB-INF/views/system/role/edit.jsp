<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="../../common/taglibs.jsp" %> 
<div style="padding: 10px 0 10px 60px">
	<form:form id="form" method="post" action="system/role/save" modelAttribute="role">
		<table>
			<tr>
				<td>角色名:</td>
				<td>
				   <form:hidden path="id"/>
				   <form:input path="name" class="easyui-validatebox" validType="length[0,20]" data-options="required:true"/>
				</td>
			</tr>
			<tr>
				<td>描述:</td>
				<td>
				    <form:textarea path="description" validType="length[0,200]" style="height: 60px;" data-options="required:false"/>  
				</td>
			</tr>
		</table>
	</form:form>
</div>
<div style="text-align: center; padding: 5px">
	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm();">提交</a> <a href="javascript:void(0)" class="easyui-linkbutton" onclick="resetForm();">重置</a>
</div>