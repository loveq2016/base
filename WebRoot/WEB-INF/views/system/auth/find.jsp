<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
 
<table  class="easyui-datagrid" id="tableAuthDatagrid" width="auto;" height="auto;"  
        url="system/auth/find"  title="权限数据" singleSelect="true" rownumbers="true" pagination="true" toolbar="#tb">
    <thead>
        <tr>
            <th field="id" hidden="true">id</th>
            <th field=name width="80">权限名</th>
            <th field="creationTime" width="200" formatter=dateFormatByEasyui>创建时间</th>
            <th field="action" width="200" formatter="authAction">操作</th>
        </tr>
    </thead>
</table>

 <div id="tb" style="padding:5px;height:auto">
    <div style="margin-bottom:5px">
        <a href="javascript:void(0);" onclick="addModel('Auth');" class="easyui-linkbutton" iconCls="icon-add" plain="true" title="添加"></a>
        <a href="javascript:void(0);" class="easyui-linkbutton" iconCls="icon-edit" plain="true" title="编辑"></a>
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

<div class="easyui-dialog"  closed="true" id="editAuthDiv" style="width:400px;" >
    <div style="padding:10px 0 10px 60px">
        <form id="editAuthForm" method="post" action="system/auth/save">
			<table>
			    <tr>
	                <td>权限名:</td>
	                <td><input class="easyui-validatebox" validType="length[0,20]" type="text" name="name" data-options="required:true"></input></td>
	            </tr>
                <tr>
	                <td>描述:</td>
	                <td><textarea name="description" validType="length[0,200]" style="height:60px;" data-options="required:false"></textarea></td>
	            </tr>
            </table>
		</form>
    </div>
    <div style="text-align:center;padding:5px">
        <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm('Auth')">提交</a>
        <a href="javascript:void(0)" class="easyui-linkbutton" onclick="$('#editAuthForm').form('reset');">重置</a>
    </div>
</div>
<script type="text/javascript" src="static/js/system/auth/auth.js"></script>