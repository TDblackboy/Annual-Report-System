/**
 * 
 */
//控制时间格式---没整好
function checkdate(e){
	var date=e.value;
	var reg=/^(\d{4})-(\d{2})-(\d{2})$/
	if(!date.test(reg)){
		alert("日期格式错误");
	}else{
	}
}

//控制Email格式---有欠缺
function checkemail(e){
	
	//var reg=/\w+@\w.\w+/;
	var apos=e.value.indexOf("@");
	var dotpos=e.value.indexOf(".");
	if(apos<1||dotpos-apos<2){
		alert("邮箱格式错误");
		//document.getElementByClassName("erroremail").innerHTML("邮箱格式错误");
	}else{
		//document.getElementByClass("erroremail").innerHTML("邮箱格式错误");
	}
	
}