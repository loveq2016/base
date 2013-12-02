/**
 * 清空表单数据
 * @param formName
 */
function resetForm(module) {
	var $form = $("#"+module+"EditForm"); 
	$form.form('reset');
	$(".validatebox-invalid").each(function(i){
		$(this).removeClass("validatebox-invalid"); 
	});
	$form.find("input[type=hidden]").each(function(i){
		if (!$(this).is('.combo-value')) {
			$(this).val("");
		} 
	});
}

/**
 * 格式化 日期类型的 函数
 * @param data
 * @returns
 */
function dateFormatter(data) {
	if (isEmpty(data)) {
		return "";
	}
	return dateFormat(data, null);
}

/**
 * 初始化添加的弹出层，如果不例外，所有的添加窗口都必须调用这个方法 
 * @param module 模块命，比如user模块，就传user,form跟dialog的id命名方法必须规范
 */
function initAdd(module) {
	resetForm(module);
    $("#"+module+"EditDiv").dialog({
        title: '添加',
        modal: true
    }).dialog('open');
}

/**
 * 初始化修改的弹出层，如果不例外，所有的修改窗口都必须调用这个方法 
 * @param module 模块命，比如user模块，就传user,form跟dialog的id命名方法必须规范
 * @param url 数据的后台加载地址
 */
function initUpdate(module,url) {
    var row = getSelected(module);
    if (row) {
    	$.post(url,{id:row.id},function (reslutData) {
			$("#"+module+"EditForm").form('load',reslutData);        // load from URL
            $("#"+module+"EditDiv").dialog({
                title: '修改',
                modal: true
            }).dialog('open');
    	},"json");
    }
}

/**
 * 更新和添加提交表单，如果不例外，所有的更新和添加窗口都必须调用这个方法
 * @param module  模块命，比如user模块，就传user,form跟dialog的id命名方法必须规范
 */
function submitForm(module) {
    var $form = $("#"+module+"EditForm");
    if ($form.form("validate")) {
        $.post($form.attr("action"),$form.serialize(),function (resultData) {
            if (isSuccess(resultData)) {
                $form.parents(".easyui-dialog").dialog('close');
                $("#"+module+"Grid").datagrid({pageNumber:1}).datagrid('reload');
            }
        },"json")
    }
}

/**
 * 通过id删除数据，如果不例外，所有的通过id删除数据都必须调用这个方法
 * @param module
 * @param url
 */
function delById(module,url, id) {
	if (isEmpty(id)) {
		var row = getSelected(module);
		id = row.id;
	}
    if (!isEmpty(id)) {
    	$.messager.confirm('系统提示', '您确认吗?', function(r){
            if (r){
            	$.post(url,{id:id},function (resultData) {
            		if (isSuccess(resultData)) {
            			$("#"+module+"Grid").datagrid('reload');
            		}
    	    	},"json");
            }
        });
    }
}

/**
 * 搜索数据，所有搜索都必须调用这个方法
 * @param module
 */
function searchData(module) {
	var $grid = $("#"+module+"Grid");
	var queryParams = $grid.datagrid('options').queryParams;
	$("#"+module+"SearchDiv").find('*').each(function() {
        queryParams[$(this).attr('name')] = $(this).val();
	});
	$grid.datagrid({pageNumber:1}).datagrid("reload");
}

function getSelected(namespace) {
	var row = $("#"+namespace+"Grid").datagrid('getSelected');
    if (!row) {
    	showMsg("你没有选中数据,请选择一条数据!");
    }
    return row;
}

function selectRow(module, index) {
	$("#"+module+"Grid").datagrid('selectRow', index);
}

/**
 * 判断后台方法是否操作成功
 * @param resultData
 * @returns {Boolean}
 */
function isSuccess(resultData) {
    if (resultData.code == "200") {
        if (!isEmpty(resultData.msg)) {
    		showMsg(resultData.msg);
    	}
        return true;
    } else {
    	 showAlertErrorMsg(resultData.msg);
    }
}

/**
 * 操作成功，在屏幕右下方提示用户成功
 * @param msg
 */
function showMsg(msg){
	$.messager.show({
	    title:'系统提示',
	    msg:msg,
	    showType:'show'
	});
}

/**
 * 操作失败，用alert error提示用户失败
 * @param msg
 */
function showAlertErrorMsg(msg){
    showAlertMsg(msg,'error');
}

function showAlertMsg(msg, type){
	$.messager.alert('系统提示',msg, type);
}

function addTab(subtitle, url, icon) {
    if (!$('#maintabs').tabs('exists', subtitle)) {
            //判断是否进行iframe方式打开tab，默认为href方式
        if(url.indexOf('isIframe') != -1){
            $('#maintabs').tabs('add', {
                    title : subtitle,
                    content : '<iframe src="' + url + '" frameborder="0" style="border:0;width:100%;height:99.4%;"></iframe>',
                    closable : true,
                    icon : icon
            });    
        } else {
            $('#maintabs').tabs('add', {
                    title : subtitle,
                    href : url,
                    closable : true,
                    icon : icon
            });                        
        }
    } else {
        $('#maintabs').tabs('select', subtitle);
    }
}