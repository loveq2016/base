<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<script type="text/javascript">
	$(function() {
		$('#userList')
				.datagrid(
						{
							idField : 'id',
							title : '用户管理',
							url : 'system/user/find',
							fit : true,
							loadMsg : '数据加载中...',
							pageSize : 10,
							pagination : true,
							sortOrder : 'asc',
							queryParams: {
								page: 'offset',
								rows: 'pageSize'
							},
							rownumbers : true,
							singleSelect : true,
							fitColumns : true,
							showFooter : true,
							frozenColumns : [ [] ],
							columns : [ [
									{
										field : 'id',
										title : '编号',
										width : 30,
										hidden : true,
										sortable : true
									},
									{
										field : 'userName',
										title : '用户名',
										width : 20
									},
									{
										field : 'TSDepart_departname',
										title : '部门',
										width : 30,
										formatter : function(value, rec, index) {
											if (value == '150') {
												return '信息部'
											}
											if (value == '152') {
												return '设计部'
											}
											if (value == '297e5a493d9f2cbc013d9f4450530001') {
												return '研发室'
											} else {
												return value
											}
										}
									},
									{
										field : 'fullName',
										title : '真实姓名',
										width : 60,
										sortable : true
									},
									{
										field : 'status',
										title : '状态',
										width : 30,
										sortable : true,
										formatter : function(value, rec, index) {
											if (value == '1') {
												return '正常'
											}
											if (value == '0') {
												return '禁用'
											}
											if (value == '-1') {
												return '超级管理员'
											} else {
												return value
											}
										}
									},
									{
										field : 'opt',
										title : '操作',
										width : 100,
										formatter : function(value, rec, index) {
											if (!rec.id) {
												return '';
											}
											var href = '';
											href += "[<a href='#' onclick=delObj('userController.do?del&id="
													+ rec.id
													+ "&userName="
													+ rec.userName
													+ "','userList')>";
											href += "删除</a>]";
											return href;
										}
									} ] ],
							onClickRow : function(rowIndex, rowData) {
								rowid = rowData.id;
								gridname = 'userList';
							}
						});
		$('#userList').datagrid('getPager').pagination({
			beforePageText : '',
			afterPageText : '/{pages}',
			displayMsg : '{from}-{to}共{total}条',
			showPageList : true,
			pageList : [ 10, 20, 30 ],
			showRefresh : true
		});
		$('#userList').datagrid('getPager').pagination({
			onBeforeRefresh : function(pageNumber, pageSize) {
				$(this).pagination('loading');
				$(this).pagination('loaded');
			}
		});
	});
	function reloadTable() {
		$('#' + gridname).datagrid('reload');
	}
	function reloaduserList() {
		$('#userList').datagrid('reload');
	}
	function getuserListSelected(field) {
		return getSelected(field);
	}
	function getSelected(field) {
		var row = $('#' + gridname).datagrid('getSelected');
		if (row != null) {
			value = row[field];
		} else {
			value = '';
		}
		return value;
	}
	function getuserListSelections(field) {
		var ids = [];
		var rows = $('#userList').datagrid('getSelections');
		for ( var i = 0; i < rows.length; i++) {
			ids.push(rows[i][field]);
		}
		ids.join(',');
		return ids
	};
	function userListsearch() {
		var queryParams = $('#userList').datagrid('options').queryParams;
		$('#userListtb').find('*').each(function() {
			queryParams[$(this).attr('name')] = $(this).val();
		});
		$('#userList').datagrid({url : 'system/user/find'});
	}
	function dosearch(params) {
		var jsonparams = $.parseJSON(params);
		$('#userList')
				.datagrid(
						{
							url : 'userController.do?datagrid&field=id,userName,TSDepart_departname,realName,status,',
							queryParams : jsonparams
						});
	}
	function userListsearchbox(value, name) {
		var queryParams = $('#userList').datagrid('options').queryParams;
		queryParams[name] = value;
		queryParams.searchfield = name;
		$('#userList').datagrid('reload');
	}
	$('#userListsearchbox').searchbox({
		searcher : function(value, name) {
			userListsearchbox(value, name);
		},
		menu : '#userListmm',
		prompt : '请输入查询关键字'
	});
	function searchReset(name) {
		$("#" + name + "tb").find(":input").val("");
		userListsearch();
	}
</script>
<table width="100%" id="userList" toolbar="#userListtb"></table>
<div id="userListtb" style="padding: 3px;">
	<div name="searchColums">
		<span style="display: -moz-inline-box; display: inline-block;"><span
			style="display: -moz-inline-box; display: inline-block; width: 80px; text-align: right;">用户名：</span>
		<input type="text" name="userName" style="width: 100px" />
		</span><span style="display: -moz-inline-box; display: inline-block;"><span
			style="display: -moz-inline-box; display: inline-block; width: 80px; text-align: right;">部门：</span>
		<select name="TSDepart_departname" WIDTH="100" style="width: 104px">
				<option value="">
					---请选择---
				</option>
				<option value="150">
					信息部
				</option>
				<option value="152">
					设计部
				</option>
				<option value="297e5a493d9f2cbc013d9f4450530001">
					研发室
				</option>
			</select>
		</span><span style="display: -moz-inline-box; display: inline-block;"><span
			style="display: -moz-inline-box; display: inline-block; width: 80px; text-align: right;">真实姓名：</span>
		<input type="text" name="realName" style="width: 100px" />
		</span>
	</div>
	<div style="height: 30px;" class="datagrid-toolbar">
		<span style="float: left;"><a href="#"
			class="easyui-linkbutton" plain="true" icon="icon-add"
			onclick="add('用户录入','userController.do?addorupdate','userList')">用户录入</a><a
			href="#" class="easyui-linkbutton" plain="true" icon="icon-edit"
			onclick="update('用户编辑','userController.do?addorupdate','userList')">用户编辑</a>
		</span><span style="float: right"><a href="#"
			class="easyui-linkbutton" iconCls="icon-search"
			onclick="userListsearch()">查询</a><a href="#"
			class="easyui-linkbutton" iconCls="icon-reload"
			onclick="searchReset('userList')">重置</a>
		</span>
	</div>
</div>

