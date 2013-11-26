
function userAction() {
	return "<a href='#' class='easyui-linkbutton' iconCls='icon-cut' plain='true'>删除</a>";
}


function assignRole() {
	$("#dialogDiv").dialog({
	    title: '分配角色',
	    resizable:true,
	    modal:true,
	    closed: false,
	    cache: false,
	    modal: true,
	    href: 'forward/system/role/find',
	}).dialog('open');
}