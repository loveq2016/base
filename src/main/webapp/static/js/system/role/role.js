function roleAction(value, row, index) {
	return "<a href='javascript:void(0);' onclick='delById(\"system/role/delete\","+row.id+");'>删除</a>";
}

function assignResources() {
	var row = getSelected();
	if (row) {
		$("#dialogDiv").dialog({
		    title: '分配访问资源',
		    href: 'forward/system/resources/assignResources?roleId='+row.id,
		    width: 400,
		    height: 490
		}).dialog('open');
	}
}

function assignRoleAction(value, row, index) {
	return "<a href='javascript:void(0);' onclick=\"delUserRole("+row.id+");\">删除</a>";
}

function addUserRole(userId) {
	var row = getSelected("role");
	if (row) {
		var roleId = row.id;
		if (!isExistRowId(roleId,"existRole")) {
			var sendData = {userId: userId, roleId: roleId};
			ajaxPost("execute/userRole/save",sendData, function (resultData) {
				if (isSuccess(resultData)) {
					$("#existRoleGrid").datagrid('reload');
				}
			});
		}
	}
}

function delUserRole(roleId) {
	var userId = $("#existRoleGrid").attr("userId");
	if (!isEmpty(roleId)) {
		var sendData = {userId:userId, roleId:roleId};
		ajaxPost("system/role/delUserRole",sendData, function (resultData) {
			if (isSuccess(resultData)) {
				$("#existRoleGrid").datagrid('reload');
			}
		});
	}
}

function saveRoleResources(roleId) {
	var rows = getSelections("roleResources");
	if (rows && rows.length > 0) {
		var sendData = {roleIds:[],resourcesIds:[]};
		for (var i = 0; i < rows.length; i++) {
			sendData.roleIds[i] = roleId;
			sendData.resourcesIds[i] = rows[i].id;
		}
		ajaxPost("system/resources/saveRoleResources",$.param(sendData, true), function (resultData) {
			if (isSuccess(resultData)) {
				
			}
		});
	}
}

