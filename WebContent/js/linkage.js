/**
 * 
 */
//数组 - 键值对  [键：值，];
//这三个数组也可以从数据库中读出
var arr_p=[
	{'id':0,'text':'请选择省'},
	{'id':1,'text':'河北省'},
	{'id':2,'text':'德玛西亚'},
	{'id':3,'text':'艾欧尼亚'},
];

var arr_c=[
	{'id':0,'c_id':0,'text':'请选择市'},
	{'id':1,'c_id':1,'text':'H-A'},
	{'id':2,'c_id':1,'text':'H-B'},
	{'id':3,'c_id':2,'text':'D-A'},
	{'id':4,'c_id':2,'text':'D-B'},
	{'id':5,'c_id':3,'text':'A-A'},
	{'id':6,'c_id':3,'text':'A-B'},
];

var arr_a=[
	{'id':0,'a_id':0,'text':'请选择县'},
	{'id':1,'a_id':1,'text':'H-A-a'},
	{'id':2,'a_id':1,'text':'H-A-b'},
	{'id':3,'a_id':2,'text':'H-B-a'},
	{'id':4,'a_id':2,'text':'H-B-b'},
	{'id':5,'a_id':3,'text':'D-A-a'},
	{'id':6,'a_id':3,'text':'D-A-b'},
	{'id':7,'a_id':4,'text':'D-B-a'},
	{'id':8,'a_id':4,'text':'D-B-b'},
	{'id':9,'a_id':5,'text':'A-A-a'},
	{'id':10,'a_id':5,'text':'A-A-b'},
	{'id':11,'a_id':6,'text':'A-B-a'},
	{'id':12,'a_id':6,'text':'A-B-b'},
	
]
//基础：select—下拉框，option-框中内容
//第一个下拉菜单
function general_select_p(){
	var select = $("#sel_p");
	var len=arr_p.length;
	for(var i=0;i<len;i++){
		var option='<option value="'+arr_p[i]['id']+'">'+arr_p[i]['text']+'</option>'
		select.append(option);
	}
}
//第二个
function general_select_c(c_id){
	var select=$("#sel_c");
	select.empty();//清空option的值
	var len=arr_c.length;
	for(var i=0;i<len;i++){
		if(arr_c[i]['c_id']==c_id){
			var option='<option value="'+arr_c[i]['id']+'">'+arr_c[i]['text']+'</option>'
			select.append(option);
		}
	}
}
//第三个
function general_select_a(a_id){
	var select=$("#sel_a");
	select.empty();
	var len=arr_a.length;
	for(var i=0;i<len;i++){
		if(arr_a[i]['a_id']==a_id){
			var option='<option value="'+arr_a[i]['id']+'">'+arr_a[i]['text']+'</option>'
			select.append(option);
		}
	}
}

//加载方法
//$().ready()
$(document).ready(function(){
	general_select_p();
	general_select_c(0);
	general_select_a(0);
	
	//select-加change事件
	//p->c,c->a
	$("#sel_p").change(function(){
		var c_id=$(this).val();//当前元素的第一个值
		general_select_c(c_id);
		var a_id=$("#sel_c").val();
		general_select_a(a_id);
	});
	$("#sel_c").change(function(){
		var a_id=$(this).val();
		general_select_a(a_id);
	})
})

