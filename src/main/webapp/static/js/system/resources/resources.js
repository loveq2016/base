function resourcesAction(value, row, index) {
	return "<a href='javascript:void(0);' onclick='delById(\"system/resources/delete\","+row.id+");'>删除</a>";
}

function assignResourcesAction(value, row, index) {
	return "<a href='javascript:void(0);' onclick=\"delRoleResources("+row.id+");\">删除</a>";
}

function addRoleResources(roleId) {
	if (!isEmpty(roleId)) {
		var row = getSelected("resources");
		if (row) {
			var sendData = {roleId: roleId, resourcesId:row.id};
			ajaxPost("execute/roleResources/save",sendData, function (resultData) {
				if (isSuccess(resultData)) {
					$("#existResourcesGrid").datagrid('reload');
				}
			});
		}
	}
}

function delRoleResources(resourcesId) {
	var roleId = $("#existResourcesGrid").attr("roleId");
	if (!isEmpty(roleId)) {
		var sendData = {roleId:roleId,resourcesId:resourcesId};
		ajaxPost("system/resources/delRoleResources",sendData, function (resultData) {
			if (isSuccess(resultData)) {
				$("#existResourcesGrid").datagrid('reload');
			}
		});
	}
}

function findByRoleId(roleId) {
	var sendData = {roleId:roleId};
	ajaxPost("system/resources/findByRoleId",sendData, function (resultData) {
		$.each(resultData, function(i, n){
		    $("#roleResourcesGrid").treegrid("select", n.resourcesId);
		});
	});
}
