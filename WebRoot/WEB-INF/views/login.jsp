<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>系统登录</title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <%@include file="common/common.jsp" %>
  </head>
  
  <body>
     <div class="easyui-window" title="登录窗口" data-options="iconCls:'icon-save'" style="width:500px;height:200px;padding:10px;">
        <div align="center">
	        <form id="form" action="loginCheck" method="post">
	            <table>
	                <tr>
	                    <td>用户名:</td>
	                    <td><input class="easyui-validatebox" type="text" name="userName" validType="length[0,20]" data-options="required:true"></input></td>
	                </tr>
	                <tr>
	                    <td>密码:</td>
	                    <td><input class="easyui-validatebox" type="password" name="password" validType="length[0,20]" data-options="required:true"></input></td>
	                </tr>
	            </table>
	        </form>
	        <div >
	            <a class="easyui-linkbutton" data-options="iconCls:'icon-ok'" href="javascript:void(0)" onclick="login();">登录</a>
	            <a class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" href="javascript:void(0)" onclick="$('#form').form('clear');">重置</a>
	        </div>
	    </div>
    </div>
    
    <script type="text/javascript">
	    function login() {
	    	if ($('#form').form('validate')) {
	    		$('#form').submit();
	    	}
	    }
	    
	    function showMsg(msg){
            $.messager.show({
                title:'系统提示',
                msg:msg,
                showType:'show'
            });
        }
    </script>
    
    <c:if test="${!empty param.login_error}">
         <script type="text/javascript">
             showMsg('<c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message }"></c:out>');
         </script>
     </c:if>
  </body>
</html>
