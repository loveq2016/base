<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%  
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<link rel="stylesheet" href="<%=basePath%>static/css/jqueryui/jquery-ui-1.9.1.custom.min.css">
<link rel="stylesheet" href="<%=basePath%>static/js/jqueryEasyui/themes/default/easyui.css">
<link rel="stylesheet" href="<%=basePath%>static/css/jquery/pagination.css">
<script type="text/javascript" src="<%=basePath%>static/js/jquery/jquery-1.7.2.min.js"> </script>
<script type="text/javascript" src="<%=basePath%>static/js/common/common.js"> </script>
<script type="text/javascript" src="<%=basePath%>static/js/jquery/jquery.pagination.js"> </script>
<script type="text/javascript" src="<%=basePath%>static/js/jquery/jquery.validate.js"> </script>
<script type="text/javascript" src="<%=basePath%>static/js/jquery/jquery.tmpl.min.js"> </script>
<script type="text/javascript" src="<%=basePath%>static/js/jqueryui/jquery-ui-1.9.1.custom.min.js"> </script>
<script type="text/javascript" src="<%=basePath%>static/js/jqueryEasyui/jquery.easyui.min.js"> </script>
<script type="text/javascript" src="<%=basePath%>static/js/jqueryEasyui/locale/easyui-lang-zh_CN.js"> </script>
<c:set var="basePath" value="<%=basePath%>"/>
<script type="text/javascript">
     window.basePath = "<%=basePath%>";
</script>
<div id="dialogDiv"></div>
