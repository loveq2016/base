function roleAction(value, row, index) {
	return "<a href='javascript:void(0);'>删除</a>";
}


function assignResources(namespace) {
	var row = getSelected(namespace);
	if (row) {
		$("#dialogDiv").dialog({
		    title: '分配访问资源',
		    href: 'forward/system/resources/assignResources?roleId='+row.id,
		    width: 1100,
		    height: 560
		}).dialog('open');
	}
}

function assignRoleAction(value, row, index) {
	return "<a href='javascript:void(0);' onclick=\"delUserRole("+row.id+");\">删除</a>";
}

function addUserRole(userId) {
	var row = getSelected("role");
	if (row) {
		var sendData = {userId: userId, roleId: row.id};
		ajaxPost("execute/userRole/save",sendData, function (resultData) {
			if (isSuccess(resultData)) {
				$("#existGrid").datagrid('reload');
			}
		});
	}
}

function delUserRole(roleId) {
	var userId = $("#existGrid").attr("userId");
	if (!isEmpty(roleId)) {
		var sendData = {userId:userId, roleId:roleId};
		ajaxPost("system/role/delUserRole",sendData, function (resultData) {
			if (isSuccess(resultData)) {
				$("#existGrid").datagrid('reload');
			}
		});
	}
}


function getQueryString(name)
{
    // 如果链接没有参数，或者链接中不存在我们要获取的参数，直接返回空
    if(location.href.indexOf("?")==-1 || location.href.indexOf(name+'=')==-1)
    {
        return '';
    }
 
    // 获取链接中参数部分
    var queryString = location.href.substring(location.href.indexOf("?")+1);
 
    // 分离参数对 ?key=value&key2=value2
    var parameters = queryString.split("&");
 
    var pos, paraName, paraValue;
    for(var i=0; i<parameters.length; i++)
    {
        // 获取等号位置
        pos = parameters[i].indexOf('=');
        if(pos == -1) { continue; }
 
        // 获取name 和 value
        paraName = parameters[i].substring(0, pos);
        paraValue = parameters[i].substring(pos + 1);
 
        // 如果查询的name等于当前name，就返回当前值，同时，将链接中的+号还原成空格
        if(paraName == name)
        {
            return unescape(paraValue.replace(/\+/g, " "));
        }
    }
    return '';
};