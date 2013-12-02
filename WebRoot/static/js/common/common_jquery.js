function ajaxPost(url,data,callName) {
	$.ajax({
	   type: "POST",
	   url: url,
	   data: data,
	   dataType : "json",
	   success: function(resultData){
		   callName(resultData);
	   },
	   error: function(XMLHttpRequest){
		   // 请求出错处理
		   alert(XMLHttpRequest);
	   }
	});
}