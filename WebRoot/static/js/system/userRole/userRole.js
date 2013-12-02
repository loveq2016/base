function assignRoleAction(value, row, index) {
	return "<a href='javascript:void(0);' onclick=\"delById('exist','execute/userRole/deleteById',"+row.id+");\">删除</a>";
}

function addUserRole(userId) {
	var row = getSelected("role");
	if (row) {
		var sendData = {userId: userId, roleId: row.id};
		ajaxPost("execute/userRole/save",sendData, success);
		
	}
}

function success(resultData) {
	if (isSuccess(resultData)) {
		$("#existGrid").datagrid('reload');
	}
}

function del(id) {
	
}