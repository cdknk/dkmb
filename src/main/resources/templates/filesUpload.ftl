<!DOCTYPE html>
<html>
<head lang="en">
	<title>Spring Boot Demo - FreeMarker</title>
	
	
</head>
<body>
	<center>
		<img src="/images/logo.jpg" / style="width:300px;height:300px;">
		<h1 id="title">${title}</h1>
	
		<form method="POST" enctype="multipart/form-data" action="/file/upload"> 
	       	文件<input type="file" name="roncooFile" />
	       <input type="submit" value="上传" />
	   	</form>
	</center>
	<script type="text/javascript" src="/webjars/jquery/2.1.4/jquery.min.js"></script>
	
	<script>
		$(function(){
			$('#title').click(function(){
				alert('点击');
			});
		})
   });
	</script>
</body>
</html>
