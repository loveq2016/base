
function userAction(value,row,index) {
	return "<a href='javascript:void(0);' onclick='delById(\"user\",\"execute/user/deleteById\","+row.id+");' class='easyui-linkbutton' iconCls='icon-cut' plain='true'>删除</a>";
}


function assignRole(namespace) {
	var row = getSelected(namespace);
	if (row) {
		$("#dialogDiv").dialog({
		    title: '分配角色',
		    href: 'forward/system/role/assignRole?userId='+row.id,
		    width: 1100,
		    height: 560
		}).dialog('open');
	}
}