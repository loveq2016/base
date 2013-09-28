<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<script type="text/javascript">

function getData(){
	var rows = ${resultValue};
	return rows;
}

$(function() {
	var statuss = [{value:'1',text:'启用'},{value:'2',text:'关闭'}];
	$('#userList').datagrid({
		idField : 'id',
		title : '用户管理',
		url : '',
		fit : true,
		loadMsg : '数据加载中...',
		pageSize : 10,
		pagination : true,
		sortOrder : 'asc',
		rownumbers : true,
		singleSelect : true,
		fitColumns : true,
		showFooter : true,
		frozenColumns : [ [] ],
		columns : [[
				{
					field : 'id',
					title : '编号',
					width : 30,
					hidden : true,
					sortable : true,
					editor:'text'
				},
				{
					field : 'code',
					title : '字典编码',
					width : 20,
					editor:'text'
				},
				{
					field : 'value',
					title : '字典值',
					width : 30,
					editor:'text'
				},
				{
					field : 'name',
					title : '名称',
					width : 60,
					sortable : true,
					editor:'text'
				},
				{
					field : 'sequence',
					title : '排序号',
					width : 30,
					sortable : true,
					editor:'text'
				},
				{
					field : 'status',
					title : '状态',
					width : 30,
					formatter:function(value){
						for(var i=0; i < statuss.length; i++){
							if (statuss[i].value == value) {
								return statuss[i].text;
							}
						}
					},
					editor:{
						type:'combobox',
						options:{
							valueField:'value',
							textField:'text',
							data: statuss,
							required:true
						}
					}
				},
				{
					field:'action',title:'操作',width:70,align:'center',
		            formatter:function(value,row,index) {
		                if (row.editing){
		                    var s = '<a href="javascript:void(0);" onclick="saverow('+index+')">保存</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;';
		                    var c = '<a href="javascript:void(0);" onclick="cancelrow('+index+')">取消</a>';
		                    return s+c;
		                } else {
		                    var e = '<a href="#" onclick="editrow('+index+')">编辑</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;';
		                    var d = '<a href="#" onclick="deleterow('+index+')">删除</a>';
		                    return e+d;
		                }
		            }
		        }]],
		onClickRow : function(rowIndex, rowData) {
			rowid = rowData.id;
			gridname = 'userList';
		},
		onBeforeEdit:function(index,row) {  
	        row.editing = true;  
	        $('#userList').datagrid('refreshRow', index);  
	    },  
	    onAfterEdit:function(index,row) {  
	        row.editing = false;  
	        $('#userList').datagrid('refreshRow', index);  
	    },  
	    onCancelEdit:function(index,row) {  
	        row.editing = false;  
	        $('#userList').datagrid('refreshRow', index);  
	    }
	}).datagrid('loadData', getData());
	
	$('#userList').datagrid('getPager').pagination({
		beforePageText : '',
		afterPageText : '/{pages}',
		displayMsg : '{from}-{to}共{total}条',
		showPageList : true,
		pageList : [ 10, 20, 30 ],
		showRefresh : true
	});
	$('#userList').datagrid('getPager').pagination({
		onBeforeRefresh : function(pageNumber, pageSize) {
			$(this).pagination('loading');
			$(this).pagination('loaded');
		}
	});
});
	
var editIndex = undefined;
function endEditing(){
	if (editIndex == undefined){
		return true;
	}
	if ($('#userList').datagrid('validateRow', editIndex)) {
		$('#userList').datagrid('endEdit', editIndex);
		editIndex = undefined;
		return true;
	} else {
		return false;
	}
}

function append(){
	if (endEditing()){
		$('#userList').datagrid('appendRow',{opt:'P'});
		editIndex = $('#userList').datagrid('getRows').length-1;
		$('#userList').datagrid('selectRow', editIndex).datagrid('beginEdit', editIndex);
	}
}

function validateRow() {
	
}

function editrow(target){
	$('#userList').datagrid('beginEdit', target);
}


function cancelrow(target){
	$('#userList').datagrid('cancelEdit', target);
}

function saverow(target){
	$('#userList').datagrid('endEdit', target);
	$('#userList').datagrid('selectRow', target);
	var row = $('#userList').datagrid('getSelected');
    if (row){
    	$.post("system/datadictionary/save", row,function (data) {
    		if (data.code == 200) {
    			
    		}
    		tip(data.message);
    	},"json")
    }
}

function deleterow(target){
	$.dialog.confirm('确定删除该记录吗 ?', function(){
		$('#userList').datagrid('deleteRow', target);
	}, function(){
		
	});
}

</script>
<table width="100%" id="userList" toolbar="#userListtb"></table>
<div id="userListtb" style="padding: 3px; height: auto">
	<div>
		<span alght="float:left">
		    <a href="javascript:void(0);" class="easyui-linkbutton" plain="true" icon="icon-add"
			  onclick="append();">
			      字典录入
			</a>
		</span>
	</div>
</div>
