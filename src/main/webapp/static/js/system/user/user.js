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
	var flag = true;
	var $this = $("#userName");
	var oldUserName = $("#userName").attr("oldValue");
	if ($this.validatebox("isValid")) {
		if (oldUserName == $this.val()) {
			flag = false;
		} else {
			var sendData = {userName: $this.val()};
			ajaxPost("system/user/isExist",sendData,function (resultData) {
				showMsg(resultData.msg);
				if (resultData.code != "200") {
					flag = true;
				} else {
					flag = false;
				}
			},false);
		}
	} 
	return flag;
}

function validateSubmitForm() {
	if (!isExist()) {
		submitForm();
	}
}

function toResetPassword() {
	var row = getSelected();
	if (row) {
		openDialog('重置密码', 'system/user/toResetPassword?userName='+row.userName+"&id="+row.id);
	}
}

function resetPassword() {
	var sendData = {userName: $this.val()};
	ajaxPost("system/user/resetPassword",sendData,function (resultData) {
	       
	});
}
