<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@include file="taglibs.jsp" %>
<base href="<%=basePath%>">
<link rel="stylesheet" href="<c:url value="/static/js/jqueryEasyui/themes/default/easyui.css"></c:url>">
<link rel="stylesheet" href="<c:url value="/static/js/jqueryEasyui/themes/icon.css"></c:url>">
<script type="text/javascript" src="<c:url value="/static/js/jquery/jquery-1.7.2.min.js"></c:url>"> </script>
<script type="text/javascript" src="<c:url value="/static/js/common/common.js"></c:url>"> </script>
<script type="text/javascript" src="<c:url value="/static/js/jquery/jquery.validate.min.js"></c:url>"> </script>
<script type="text/javascript" src="<c:url value="/static/js/jquery/jquery.metadata.js"></c:url>"> </script>
<script type="text/javascript" src="<c:url value="/static/js/common/common_easyui.js"></c:url>"> </script>
<script type="text/javascript" src="<c:url value="/static/js/common/common_jquery.js"></c:url>"> </script>
<script type="text/javascript" src="<c:url value="/static/js/jqueryEasyui/jquery.easyui.min.js"></c:url>"> </script>
<script type="text/javascript" src="<c:url value="/static/js/jqueryEasyui/locale/easyui-lang-zh_CN.js"></c:url>"> </script>
<div id="dialogDiv" class="easyui-dialog" data-options="resizable:true,modal:true,closed:true">
      
</div>
