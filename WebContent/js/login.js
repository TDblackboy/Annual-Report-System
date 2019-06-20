/**
 * 
 */
var err1,err2;
function onblurr(e){
	if(e.name=="username"){
		var len=e.value.length;
		if(e.value==""){
			err1=false;
			errname.innerHTML="不能为空";
		}else {
			err1=true;
			errname.innerHTML="";
		}
	}else if(e.name=="userpass"){
		var len=e.value.length;
		if(e.value==""){
			err2=false;
			errpass.innerHTML="不能为空";
		}else if(len<8){
			err2=false;
			errpass.innerHTML="密码错误";
		}else{
			err2=true;
			errpass.innerHTML="";
		}
	}
}
function checkname(){
	var na=document.getElementById("name");
	if(na.value==""){
		return false;
	}else{
		return true;
	}
}
function checkpass(){
	var pa=document.getElementById("pass");
	if(pa.value==""){
		return false;
	}else{
		return true;
	}
}


function login(){
	if(!err1||!err2){
		return false;
	}else if(err1&&err2){
		return true;
	}else if(checkname()&&checkpass()){
		return true;
	}else{
		return true;
	}
}