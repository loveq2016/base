<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="../common/common.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>表单验证</title>

<script type="text/javascript">
$(document).ready(function() {
	$("#commentForm").validate({meta: "validate",errorPlacement: function(error, element) {  
	    alert(error.text());  
	}});
});
</script>

</head>
<body>
<form class="cmxform" id="commentForm" method="post" action="dd.html">
	<fieldset>
		<legend>Please enter your email address</legend>
		<p>

			<label for="cemail">E-Mail *</label>
			<input id="cemail" name="email" class="{validate:{required:true, email:true, messages:{required:'Please enter your email address', email:'Please enter a valid email address'}}}"/>
		</p>
		<p>
			<input class="submit" type="submit" value="Submit"/>
		</p>
	</fieldset>
</form>
</body>
</html>