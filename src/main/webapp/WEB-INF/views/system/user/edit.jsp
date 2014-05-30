<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="../../common/taglibs.jsp" %> 
<div style="padding: 10px 0 10px 60px">  

    <%-- 设置 form 的action 地址，id为空，为添加的地址，否则为修改的地址 --%>
    <c:choose>
        <c:when test="${empty user.id }"><c:set var="action" value="system/user/add"></c:set></c:when>
        <c:otherwise><c:set var="action" value="system/user/update"></c:set></c:otherwise>
    </c:choose>
    
	<form:form id="form" method="post" action="${action }" modelAttribute="user">
		<table>
			<tr>
				<td>用户名:</td>
				<td>
				   <form:hidden path="id"/>
				   <form:input path="userName" class="easyui-validatebox" validType="length[4,20]" type="text" name="userName" oldValue="${user.userName }" onblur="isExist();" data-options="required:true"/>
				</td>
			</tr>
			
			<%-- 新增页面显示【密码】，修改则隐藏 --%>
			<c:if test="${empty user.id }">
				<tr>
					<td>密码:</td>
					<td>
					   <form:input path="password" class="easyui-validatebox" validType="length[6,20]" type="password" name="password" data-options="required:true"/>
					</td>
				</tr>
			</c:if>
			<tr>
				<td>Email:</td>
				<td>
				  <form:input path="mail" class="easyui-validatebox" type="text"  data-options="required:false,validType:'email'"/> 
				</td>
			</tr>
			<tr>
				<td>移动电话:</td>
				<td>
				    <form:input path="mobile" class="easyui-validatebox" validType="length[6,20]"  name="mobile" data-options="required:false"/>
				</td>
			</tr>
			<tr>
				<td>真实姓名:</td>
				<td>
				  <form:input path="fullName" class="easyui-validatebox" validType="length[0,20]" type="text" name="fullName" data-options="required:false"/>
				</td>
			</tr>
			<tr>
				<td>年龄:</td>
				<td>
				    <form:input path="age" class="easyui-numberbox"  data-options="required:false"/>
				</td>
			</tr>
			<tr>
				<td>性别:</td>
				<td>
				    <form:select class="easyui-combobox" path="gender" items="${userGender }" />
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
	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="validateSubmitForm();">提交</a> 
	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="resetForm();">重置</a>
</div>
