<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="namespace" value="resources"></c:set>

<table title="资源数据" class="easyui-treegrid" style="height: 515px;" data-options="
                url: 'system/resources/find',
                rownumbers: true,
                pagination: true,
                idField: 'id',
                treeField: 'name',
                toolbar:'#resourcesTb'
            ">
	<thead>
		<tr>
			<th field="id" hidden="true">
				id
			</th>
			<th field="name" width="180">
				权限名
			</th>
			<th field="linkUrl" width="220">
				URL
			</th>
			<th field="sequence" width="50">
				排序号
			</th>
			<th field="type" width="80">
				资源类型
			</th>
			<th field="creationTime" width="120" formatter=dateFormatByEasyui>
				创建时间
			</th>
			<th field="action" width="80" formatter="resourcesAction">
				操作
			</th>
		</tr>
	</thead>
</table>

<div id="resourcesTb" style="padding: 5px; height: auto">
	<div style="margin-bottom: 5px">
		<a href="javascript:void(0);" onclick="addModel('Resources');" class="easyui-linkbutton" iconCls="icon-add" plain="true" title="添加"></a>
		<a href="javascript:void(0);" class="easyui-linkbutton" iconCls="icon-edit" plain="true" title="编辑"></a>
		
	</div>
	<div>
		Date From:
		<input class="easyui-datebox" style="width: 80px">
		To:
		<input class="easyui-datebox" style="width: 80px" type="text">
		Language:
		<select class="easyui-combobox" panelHeight="auto" style="width: 100px">
			<option value="java">
				Java
			</option>
			<option value="c">
				C
			</option>
			<option value="basic">
				Basic
			</option>
			<option value="perl">
				Perl
			</option>
			<option value="python">
				Python
			</option>
		</select>
		<a href="javascript:void(0);" class="easyui-linkbutton" iconCls="icon-search">Search</a>
	</div>
</div>

<div class="easyui-dialog" closed="true" id="editResourcesDiv" style="width: 400px;">
	<div style="padding: 10px 0 10px 60px">
		<form id="editResourcesForm" method="post" action="system/resources/save">
			<table>
				<tr>
					<td>
						权限名:
					</td>
					<td>
						<input class="easyui-validatebox" validType="length[0,20]" type="text" name="name" data-options="required:true"></input>
					</td>
				</tr>
				<tr>
					<td>
						描述:
					</td>
					<td>
						<textarea name="description" validType="length[0,200]" style="height: 60px;" data-options="required:false"></textarea>
					</td>
				</tr>
			</table>
		</form>
	</div>
	<div style="text-align: center; padding: 5px">
		<a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm('Resources')">提交</a>
		<a href="javascript:void(0)" class="easyui-linkbutton" onclick="$('#editResourcesForm').form('reset');">重置</a>
	</div>
</div>
<script type="text/javascript" src="static/js/system/resources/resources.js"></script>