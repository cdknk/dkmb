<!DOCTYPE html>
<html>
<head lang="en">
	<title>Spring Boot Demo - FreeMarker</title>
	
	<style type="text/css">
	 *{
	margin: 0;
}
.top{
	width: 310px;
	padding: 10px 20px;
	background-color: gray;
	border-top-left-radius: 5px;
	border-top-right-radius: 5px;
	font-size: 18px;
	font-weight: bold;
	color: white;
}
.content{
	background-color: white;
}
select{
	border: 2px solid gray;
	background: white; 
	width: 350px;
	height: 470px;
	padding: 10px;
}
table{
	border: 2px solid gray;
	background: white; 
	width: 350px;
	height: 470px;
	padding: 10px;
}
.send{
	width: 310px;
	padding: 10px 20px;
	background-color: gray;
	border-bottom-left-radius: 3px;
	border-bottom-right-radius: 3px;
}
.chat{
	
}
.box{
	float: left;
	margin: 20px 120px;
}
body{
	width: 100%;
	background:#ff8689;
}
.outer{
	width: 90%;
	margin: 10px auto;
}
.sText{
	width: 220px;
	height: 25px;
	border-radius: 5px;
	font-size: 15px;
}
.btn{
	width: 65px;
	height: 30px;
	border-radius: 5px;
	float: right;
	text-align: center;
	font-size: 18px;
	color: white;
	background-color: limegreen;
}
option{
	font-size: 15px;
	max-width: 325px;
	height: auto;
	border: 0.5px solid gainsboro;
	border-radius: 8px;
	padding: 10px;
	margin: 10px;
	word-wrap: break-word;
	word-break:break-all;
	margin-top: 10px;
	margin-bottom: 10px;
	max-width: 200px;
}
#ccc{
	margin-left: 158px;
	background-color: greenyellow;
}
#cccc{
	margin-left: 18px;
	background-color: #fff;
}


		</style>

		<script type="text/javascript">
		window.onload=function(){
				var leftText =document.getElementById('leftText');
				var leftSendBtn=document.getElementById('leftSendBtn');
				var leftContent =document.getElementById('leftContent');
				var rightText =document.getElementById('rightText');
				var rightSendBtn=document.getElementById('rightSendBtn');
				var rightContent =document.getElementById('rightContent');

				leftSendBtn.onclick=function(){
					if(leftText.value==''){
						alert('老王：内容不能为空');
						return;
					}
					console.log(leftText.value+'1');
					 var oLogin = document.createElement("option");
					 var oLogins = document.createElement("option");
					 oLogin.id="ccc";
					 oLogins.id="cccc";
					 oLogin.innerHTML=leftText.value;
					 oLogins.innerHTML=leftText.value;
					 shij(leftContent);
					 shij(rightContent);
					 leftContent.appendChild(oLogin);
					 rightContent.appendChild(oLogins);
					 leftText.value='';

				}
				rightSendBtn.onclick=function(){
					if(rightText.value==''){
						alert('李娟：内容不能为空');
						return;
					}
					console.log(rightText.value+'2');
					var oLogin = document.createElement("option");
					 var oLogins = document.createElement("option");
					 oLogin.id="cccc";
					 oLogins.id="ccc";
					 oLogin.innerHTML=rightText.value;
					 oLogins.innerHTML=rightText.value;
					 shij(leftContent);
					 shij(rightContent);
					 leftContent.appendChild(oLogin);
					 rightContent.appendChild(oLogins);
					 rightText.value='';

				}

				function shij(obj){
					var date = new Date();
					var year = date.getFullYear();
					var month = date.getMonth()+1;
					var day = date.getDate();
					var hour = date.getHours();
					var minute = date.getMinutes();
					var second = date.getSeconds();
					var bb = document.createElement("b");
					var rq=(year+'年'+month+'月'+day+'日 '+hour+':'+minute+':'+second);
					 bb.innerHTML='<center>'+rq+'</center>';
					 obj.appendChild(bb);
				}
			}
		</script>
</head>
<body>
	
	

	<center>
		<h1>首页</h1>
		<h2><a id="title" href="">${title}</a></h2>
	</center>
	<script type="text/javascript" src="/webjars/jquery/2.1.4/jquery.min.js"></script>
	<script>
		$(function(){
			$('#title').click(function(){
				alert('点击成功');
			});
		})
	</script>
	
	<center>
	<div class="outer">
			<div class="box">
				<div class="chat">
					<div class="top">
						<span class="">好好學習</span>
					</div>
					<div class="content">
						<table multiple="multiple" id="leftContent">
						</table>
					</div>
					<div class="send">
						<input type="text" id="leftText" class="sText"/>
						<input type="button" id="leftSendBtn" class="btn" value="发送"/>
					</div>
				</div>
			</div>
			<div class="box">
				<div class="chat">
					<div class="top">
						<span class="">天天向上</span>
					</div>
					<div class="content">
						<table multiple="multiple" id="rightContent">

						</table>
					</div>
					<div class="send">
						<input type="text" id="rightText" class="sText"/>
						<input type="button" id="rightSendBtn" class="btn" value="发送"/>
					</div>
				</div>
			</div>
		</div>
		</center>
</body>
</html>
