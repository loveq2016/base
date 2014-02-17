<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@include file="../common/common.jsp"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>表单验证</title>

<!-- for styling the form
<script src="../lib/jquery.js" type="text/javascript"></script>
<script src="../jquery.validate.js" type="text/javascript"></script>
<script src="../lib/jquery.metadata.js" type="text/javascript"></script>
 -->

 

<script type="text/javascript">
$(document).ready(function() {
	$("#commentForm").validate({meta: "validate"});
	$("#commentForm2").validate();
	$("#commentForm3").validate({
		messages: {
			email: {
				required: 'Enter this!'
			}
		}		
	});

});

function singleInput2(_this) {
	/* $("#validateForm").validate({errorPlacement: function(error, element) {  
	    alert(error.text());  
	}});
	$("#validateForm").find("input[name='validate']").val($(_this).val());
	$("#validateForm").find("input[name='validate']").rules("add",{required:true, email:true, messages:{required:'Please enter your email address', email:'Please enter a valid email address'}});
	if ($("#validateForm").find("input[name='validate']").valid()) {
		
	} */
	
	alert($(_this).email());
}
</script>

<style type="text/css">
form { width: 500px; }
form label { width: 250px; }
form label.error, 
form input.submit { margin-left: 253px; }
</style>

</head>
<body>
	
<form id="validateForm">
    <input  name="validate" type="hidden" />
</form>
 
<!-- Custom messages with custom "meta" setting -->
<form class="cmxform" id="commentForm" method="post" action="">
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
<!-- Custom messages with default "meta" setting -->
<form class="cmxform" id="commentForm2" method="post" action="">
	<fieldset>
		<legend>Please enter your email address</legend>
		<p>

			<label for="cemail">E-Mail *</label>
			<input id="cemail" name="email" class="{required:true, email:true, messages:{required:'Please enter your email address', email:'Please enter a valid email address'}}"/>
		</p>
		<p>
			<input class="submit" type="submit" value="Submit"/>
		</p>
	</fieldset>
</form>
<!-- Custom message for "required" in metadata is overriden by a validate option -->
<form class="cmxform" id="commentForm3" method="post" action="">
	<fieldset>
		<legend>Please enter your email address</legend>
		<p>

			<label for="cemail">E-Mail *</label>
			<input id="cemail" name="email" class="{required:true, email:true, messages:{email:'Please enter a valid email address'}}"/>
		</p>
		<p>
			<input class="submit" type="submit" value="Submit"/>
		</p>
	</fieldset>
</form>

<form class="cmxform" id="commentForm4" method="post" action="">
<div class="cmxform">
	<fieldset>
		<legend>单个input验证</legend>
		<p>

			<label for="cemail">E-Mail *</label>
			<input id="singleInput" name="singleInput" onblur="singleInput2(this);"/>
		</p>
		<p>
			<input class="submit" type="submit" value="Submit"/>
		</p>
	</fieldset>
</div>
</form>
</body>
</html>