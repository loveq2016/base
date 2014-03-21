
function userAction(value,row,index) {
	return "<a href='javascript:void(0);' onclick='delById(\"system/user/delete\","+row.id+");'>删除</a>";
}


function assignRole() {
	var row = getSelected();
	if (row) {
		$("#dialogDiv").dialog({
		    title: '分配角色',
		    href: 'forward/system/role/assignRole?userId='+row.id,
		    width: 1100,
		    height: 450
		}).dialog('open');
	}
}


function isExist() {
	var $this = $("#userEditForm").find("input[name='userName']");
	if ($this.validatebox("isValid")) {
		var sendData = {userName: $this.val()};
		ajaxPost("system/user/isExist",sendData,function (resultData) {
			showMsg(resultData.msg);
		});
	} 
}