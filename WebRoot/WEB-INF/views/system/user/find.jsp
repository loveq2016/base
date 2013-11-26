<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
 
<table  class="easyui-datagrid" id="userGrid" width="auto;" height="auto;"  
        url="system/user/find"  title="用户数据" data-options="onDblClickCell: function(index,field,value){initUpdate('user','execute/user/findById');}" singleSelect="true" rownumbers="true" pagination="true" toolbar="#tbUser">
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

 <div id="tbUser" style="padding:5px;height:auto">
    <div style="margin-bottom:5px">
        <a href="javascript:void(0);" onclick="initAdd('user');" class="easyui-linkbutton" iconCls="icon-add" plain="true" title="添加"></a>
        <a href="javascript:void(0);" class="easyui-linkbutton" iconCls="icon-edit" plain="true" title="编辑"></a>
        <a href="javascript:void(0);" class="easyui-linkbutton" onclick="assignRole();" plain="true" title="分配角色">分配角色</a>
    </div>
    <div>
        Date From: <input class="easyui-datebox" style="width:80px">
        To: <input class="easyui-datebox" style="width:80px" type="text">
        Language: 
        <select class="easyui-combobox" panelHeight="auto" style="width:100px">
            <option value="java">Java</option>
            <option value="c">C</option>
            <option value="basic">Basic</option>
            <option value="perl">Perl</option>
            <option value="python">Python</option>
        </select>
        <a href="javascript:void(0);" class="easyui-linkbutton" iconCls="icon-search">Search</a>
    </div>
</div>

<div class="easyui-dialog"  closed="true" id="userEditDiv" style="width:400px;" >
    <div style="padding:10px 0 10px 60px">
        <form id="userEditForm" method="post" action="system/user/save">
			<table>
			    <tr>
	                <td>用户名:</td>
	                <td><input class="easyui-validatebox" validType="length[4,20]" type="text" name="userName" data-options="required:true"></input>
	                    <input type="hidden" name="id" ></input>
	                </td>
	            </tr>
	            <tr>
	                <td>密码:</td>
	                <td><input class="easyui-validatebox" validType="length[6,20]" type="password" name="password" data-options="required:true"></input></td>
	            </tr>
	            <tr>
	                <td>Email:</td>
	                <td><input class="easyui-validatebox" type="text" name="email" data-options="required:false,validType:'email'"></input></td>
	            </tr>
	            <tr>
	                <td>移动电话:</td>
	                <td><input class="easyui-validatebox" type="text" name="mobile" data-options="required:false"></input></td>
	            </tr>
	            <tr>
	                <td>真实姓名:</td>
	                <td><input class="easyui-validatebox" validType="length[0,20]" type="text" name="fullName" data-options="required:false"></input></td>
	            </tr>
	            <tr>
	                <td>年龄:</td>
	                <td><input class="easyui-numberbox" type="text" name="age" data-options="required:false"></input></td>
	            </tr>
                <tr>
                    <td>性别:</td>
                    <td>
                        <select class="easyui-combobox" name="gender">
	                        <option value="男">男</option>
	                        <option value="女">女</option>
                        </select>
                    </td>
                </tr>
                <tr>
	                <td>描述:</td>
	                <td><textarea name="description" validType="length[0,200]" style="height:60px;" data-options="required:false"></textarea></td>
	            </tr>
            </table>
		</form>
    </div>
    <div style="text-align:center;padding:5px">
        <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm('user')">提交</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" onclick="$('#editUserForm').form('reset');">重置</a>
    </div>
</div>
<script type="text/javascript" src="static/js/system/user/user.js"></script>