/**
 * 弹出添加用户的DIV
 */
function toAddUser() {
	$("#dialogDiv").dialog({title: "添加用户",modal: true,show:1000,hide:2000});
	$("#dialogDiv").load(basePath+"system/toAddUser");
}

/**
 * 角色分配
 * @param userId
 */
function loadRoles(userId) {
	$("#dialogDiv").dialog({title: "角色分配",modal: true,show:1000,hide:2000});
	$("#dialogDiv").load("system/loadRoles",{id:userId});
}

/**
 * 权限分配
 * @param roleId
 */
function loadMenus(roleId) {
	$("#dialogDiv").dialog({title: "权限分配",modal: true,show:1000,hide:2000,width:800,height:600});
	$("#dialogDiv").load("system/loadMenus",{id:roleId});
}


