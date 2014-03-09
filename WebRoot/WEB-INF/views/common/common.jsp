<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath%>">
<link rel="stylesheet" href="static/js/jqueryEasyui/themes/default/easyui.css">
<link rel="stylesheet" href="static/js/jqueryEasyui/themes/icon.css">
<script type="text/javascript" src="static/js/jquery/jquery-1.7.2.min.js"> </script>
<script type="text/javascript" src="static/js/common/common.js"> </script>
<script type="text/javascript" src="static/js/jquery/jquery.validate.js"> </script>
<script type="text/javascript" src="static/js/jquery/jquery.metadata.js"> </script>
<script type="text/javascript" src="static/js/common/common_easyui.js"> </script>
<script type="text/javascript" src="static/js/common/common_jquery.js"> </script>
<script type="text/javascript" src="static/js/jqueryEasyui/jquery.easyui.min.js"> </script>
<script type="text/javascript" src="static/js/jqueryEasyui/locale/easyui-lang-zh_CN.js"> </script>
<div id="dialogDiv" class="easyui-dialog" data-options="resizable:true,modal:true,closed:true">
      
</div>
