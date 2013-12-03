function roleAction(value, row, index) {
	return "<a href='javascript:void(0);'>删除</a>";
}


function assignResources(namespace) {
	var row = getSelected(namespace);
	if (row) {
		$("#dialogDiv").dialog({
		    title: '分配角色',
		    href: 'forward/system/userRole/assignRole?userId='+row.id,
		    width: 1100,
		    height: 560
		}).dialog('open');
	}
}