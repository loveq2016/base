<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/common/taglibs.jsp"%>
<div style="padding: 10px 0 10px 60px">
    
    <%-- 设置 form 的action 地址，id为空，为添加的地址，否则为修改的地址 --%>
    <c:choose>
        <c:when test="${empty resources.id }"><c:set var="action" value="system/resources/add"></c:set></c:when>
        <c:otherwise><c:set var="action" value="system/resources/update"></c:set></c:otherwise>
    </c:choose>
    
	<form:form action="${action }" id="form" method="post" modelAttribute="resources">
	   <form:hidden path="id"/>
	   <form:hidden path="parentId"/>
		<table>
			<tr>
				<td>名称:</td>
				<td><form:input path="name" class="easyui-validatebox" validType="length[0,20]" data-options="required:true" /></td>
			</tr>
			<tr>
				<td>URL:</td>
				<td><form:input path="linkUrl" class="easyui-validatebox"  validType="length[0,50]" type="text" data-options="required:true" /></td>
			</tr>
			<tr>
				<td>排序号:</td>
				<td><form:input path="sequence" class="easyui-numberbox" data-options="required:true" /></td>
			</tr>
			<tr>
				<td>类型:</td>
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
	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm();">提交</a> <a href="javascript:void(0)" class="easyui-linkbutton" onclick="resetForm();">重置</a>
</div>