<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="../../common/taglibs.jsp" %> 
<div style="padding: 10px 0 10px 60px">  
	<form id="form" action="system/user/resetPassword" method="post">
		<table>
			<tr>
				<td>用户名:</td>
				<td>
				   <input id="id" name="id" type="hidden" value="${param.id }"/>
				   ${param.userName }
				</td>
			</tr>
			<tr>
				<td>旧密码:</td>
				<td>
				   <input id="password" validType="length[6,20]" name="oldPassword" class="easyui-validatebox" data-options="required:true" type="password" value=""/>
				</td>
			</tr>
			 <tr>
				<td>新密码:</td>
				<td>
				   <input id="newPassword" validType="length[6,20]" name="newPassword" class="easyui-validatebox" data-options="required:true" type="password" value=""/>
				</td>
			</tr>
			 <tr>
				<td>再次输入:</td>
				<td>
				   <input id="confirmPassword" validType="equalTo['#newPassword']" invalidMessage="两次输入密码不匹配" name="confirmPassword" class="easyui-validatebox" data-options="required:true" type="password" value=""/>
				</td>
			</tr>
		</table>
	</form>
</div>
<div style="text-align: center; padding: 5px">
	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm();">提交</a> 
	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="resetForm();">重置</a>
</div>