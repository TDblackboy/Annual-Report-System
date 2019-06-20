package per.sun.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import per.sun.modal.Platform;

public class Pack {
		
	public static Platform pack(ResultSet result) {
		
		Platform plat=new Platform();
		try {
			while(result.next()) {
				plat.setPid(result.getInt("pid"));
				//plat.setUsername(result.getString("username"));
				plat.setPtype(result.getString("ptype"));
				plat.setPname(result.getString("pname"));
				plat.setPyituodanwei(result.getString("pyituodanwei"));
				plat.setPguikoubumen(result.getString("pguikoubumen"));
				plat.setPwenhao(result.getString("pwenhao"));
				plat.setPjibie(result.getString("pjibie"));
				plat.setPxianshi(result.getString("pxianshi"));
				plat.setPhangye(result.getString("phangye"));
				plat.setPxueke(result.getString("pxueke"));
				plat.setPwangzhanming(result.getString("pwangzhanming"));
				plat.setPwangzhi(result.getString("pwangzhi"));
				plat.setPtongxundizhi(result.getString("ptongxundizhi"));
				plat.setPyoubian(result.getString("pyoubian"));
				plat.setTname(result.getString("tname"));
				plat.setTbumen(result.getString("tbumen"));
				plat.setTdianhua(result.getString("tdianhua"));
				plat.setTshouji(result.getString("tshouji"));
				plat.setTime(result.getDate("time"));
				plat.setYname(result.getString("yname"));
				plat.setYzuzhidaima(result.getString("yzuzhidaima"));
				plat.setYfaren(result.getString("yfaren"));
				plat.setYdianhua(result.getString("ydianhua"));
				plat.setYtype(result.getString("ytype"));
				plat.setPyname(result.getString("pyname"));
				plat.setPysex(result.getString("pysex"));
				plat.setPybrith(result.getDate("pybrith"));
				plat.setPyzhicheng(result.getString("pyzhicheng"));
				plat.setPyzhuanye(result.getString("pyzhuanye"));
				plat.setPyxueli(result.getString("pyxueli"));
				plat.setPyxuewei(result.getString("pyxuewei"));
				plat.setPydianhua(result.getString("pydianhua"));
				plat.setPyshouji(result.getString("pyshouji"));
				plat.setPyemail(result.getString("pyemail"));
				
			}
		} catch (SQLException e) {
			System.out.println("��װ(һ��)����");
		}
		return plat;
	}
	
	public static List<Platform> packList(ResultSet result){
		
		List<Platform> list=new ArrayList<Platform>();
		try {
			while(result.next()) {
				Platform plat=new Platform();
				plat.setPid(result.getInt("pid"));
				//plat.setUsername(result.getString("username"));
				plat.setPtype(result.getString("ptype"));
				plat.setPname(result.getString("pname"));
				plat.setPyituodanwei(result.getString("pyituodanwei"));
				plat.setPguikoubumen(result.getString("pguikoubumen"));
				plat.setPwenhao(result.getString("pwenhao"));
				plat.setPjibie(result.getString("pjibie"));
				plat.setPxianshi(result.getString("pxianshi"));
				plat.setPhangye(result.getString("phangye"));
				plat.setPxueke(result.getString("pxueke"));
				plat.setPwangzhanming(result.getString("pwangzhanming"));
				plat.setPwangzhi(result.getString("pwangzhi"));
				plat.setPtongxundizhi(result.getString("ptongxundizhi"));
				plat.setPyoubian(result.getString("pyoubian"));
				plat.setTname(result.getString("tname"));
				plat.setTbumen(result.getString("tbumen"));
				plat.setTdianhua(result.getString("tdianhua"));
				plat.setTshouji(result.getString("tshouji"));
				plat.setTime(result.getDate("time"));
				plat.setYname(result.getString("yname"));
				plat.setYzuzhidaima(result.getString("yzuzhidaima"));
				plat.setYfaren(result.getString("yfaren"));
				plat.setYdianhua(result.getString("ydianhua"));
				plat.setYtype(result.getString("ytype"));
				plat.setPyname(result.getString("pyname"));
				plat.setPysex(result.getString("pysex"));
				plat.setPybrith(result.getDate("pybrith"));
				plat.setPyzhicheng(result.getString("pyzhicheng"));
				plat.setPyzhuanye(result.getString("pyzhuanye"));
				plat.setPyxueli(result.getString("pyxueli"));
				plat.setPyxuewei(result.getString("pyxuewei"));
				plat.setPydianhua(result.getString("pydianhua"));
				plat.setPyshouji(result.getString("pyshouji"));
				plat.setPyemail(result.getString("pyemail"));
				
				list.add(plat);
			}
		} catch (SQLException e) {
			System.out.println("��װall����");
		}
		return list;
		
	}
}
