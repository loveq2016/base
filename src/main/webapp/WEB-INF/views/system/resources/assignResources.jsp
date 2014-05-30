<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<table  class="easyui-treegrid" fit="true"  id="roleResourcesGrid"
        url="system/resources/findAll"  
        rownumbers="true" singleSelect="false"
        idField="id" treeField="name" toolbar="#tbAssignRes">
    <thead>
        <tr>
            <th data-options="field:'id',checkbox:true"></th>
            <th field="name" width="250">名称</th>
        </tr>
    </thead>
</table>
 
<div id="tbAssignRes" style="padding:5px;height:auto">
    <div style="margin-bottom:5px">
        <a href="javascript:void(0);" class="easyui-linkbutton" iconCls="icon-save" plain="true" onclick="saveRoleResources(${param.roleId});">保存</a>
    </div>
</div>
<script type="text/javascript" src="static/js/system/resources/resources.js"></script>

<script type="text/javascript">
    var roleId = "${param.roleId}";
    $("#roleResourcesGrid").treegrid({
    	onLoadSuccess:function (row, data) {
    		findByRoleId(roleId);
        }
    });
</script>
