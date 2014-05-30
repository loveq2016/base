function ajaxPost(url,data,callName,async) {
	$.ajax({
	   type: "POST",
	   url: url,
	   data: data,
	   async : async, 
	   dataType : "json",
	   success: function(resultData){
		   callName(resultData);
	   },
	   error: function(XMLHttpRequest){
		   // 请求出错处理
		   if (XMLHttpRequest.status == "403") {
			   alert("会话超时!");
		   }
	   }
	});
}