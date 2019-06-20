package per.sun.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import per.sun.modal.Platform;
import per.sun.util.Database;

public class PlatformDao implements PlatformDaoIF {


	@Override
	public void add(Platform platform,int i) {
		String sql1="insert into platform(username,ptype,pname,pyituodanwei,pguikoubumen,tname,tbumen,tdianhua,tshouji,temail,time) value(?,?,?,?,?,?,?,?,?,?,?)";//11+1
		String sql2="insert into platform(pjibie,pxianshi) value(?,?) where pid=?";//2.....+1
		String sql3="insert into platform(yname,yzuzhidaima,yfaren,ydianhua,ytype) value(?,?,?,?,?) where pid=?";//5+1
		String sql4="insert into platform(pyname,pysex,pybrith,pyzhicheng,pyzhuanye,pyxueli,pyxuewei,pydianhua,pyshouji,pyemail) value(?,?,?,?,?,?,?,?,?,?) where pid=?";//10+1
		String sql5="insert into platform(pwangzhanming,pwangzhi,ptongxundizhi,pyoubian) value(?,?,?,?) where pid=?";//4+1
		Connection con=Database.getConnection();
		PreparedStatement pre=null;
		if(i==1) {
			try {
				pre=con.prepareStatement(sql1);
				pre.setString(1,platform.getUsername());
				pre.setString(2, platform.getPtype());
				pre.setString(3, platform.getPname());
				pre.setString(4, platform.getPyituodanwei());
				pre.setString(5, platform.getPguikoubumen());
				pre.setString(6, platform.getTname());
				pre.setString(7, platform.getTbumen());
				pre.setString(8, platform.getTdianhua());
				pre.setString(9, platform.getTshouji());
				pre.setString(10, platform.getTemail());
				pre.setDate(11, platform.getTime());
				//pre.setInt(12, platform.getPid());
				pre.executeUpdate();
			} catch (SQLException e) {
				System.out.println("添加数据失败-1");
			}finally {
				Database.close(con);
				Database.close(pre);
			}
		}else if(i==2) {
			try {
				pre=con.prepareStatement(sql2);
				pre.setString(1, platform.getPjibie());
				pre.setString(2, platform.getPxianshi());
				pre.setInt(3, platform.getPid());
				pre.executeUpdate();
			} catch (SQLException e) {
				System.out.println("添加数据失败-2");
			}finally {
				Database.close(con);
				Database.close(pre);
			}
		}else if(i==3) {
			try {
				pre=con.prepareStatement(sql3);
				pre.setString(1, platform.getYname());
				pre.setString(2, platform.getYzuzhidaima());
				pre.setString(3, platform.getYfaren());
				pre.setString(4, platform.getYdianhua());
				pre.setString(5, platform.getYtype());
				pre.setInt(6, platform.getPid());
				pre.executeUpdate();
			} catch (SQLException e) {
				System.out.println("添加数据失败-3");
			}finally {
				Database.close(con);
				Database.close(pre);
			}
		}else if(i==4) {
			try {
				pre=con.prepareStatement(sql4);
				pre.setString(1, platform.getPyname());
				pre.setString(2, platform.getPysex());
				pre.setDate(3, platform.getPybrith());
				pre.setString(4, platform.getPyzhicheng());
				pre.setString(5, platform.getPyzhuanye());
				pre.setString(6, platform.getPyxueli());
				pre.setString(7, platform.getPyxuewei());
				pre.setString(8, platform.getPydianhua());
				pre.setString(9, platform.getPyshouji());
				pre.setString(10, platform.getPyemail());
				pre.setInt(11, platform.getPid());
				pre.executeUpdate();
			} catch (SQLException e) {
				System.out.println("添加数据失败-4");
			}finally {
				Database.close(con);
				Database.close(pre);
			}
		}else {
			try {
				pre=con.prepareStatement(sql5);
				pre.setString(1, platform.getPwangzhanming());
				pre.setString(2, platform.getPwangzhi());
				pre.setString(3, platform.getPtongxundizhi());
				pre.setString(4, platform.getPyoubian());
				pre.setInt(5, platform.getPid());
				pre.executeUpdate();
			} catch (SQLException e) {
				System.out.println("添加数据失败-5");
			}finally {
				Database.close(con);
				Database.close(pre);
			}
		}
		
	}

	@Override
	public void delete(int pid) {
		String sql="delete from platform where pid=?";
		Connection con=Database.getConnection();
		PreparedStatement pre=null;
		try {
			pre=con.prepareStatement(sql);
			pre.setInt(1, pid);
			pre.executeUpdate();
		} catch (SQLException e) {
			System.out.println("数据删除失败。");
		}finally {
			Database.close(con);
			Database.close(pre);
		}
		
	}

	@Override
	public void update(Platform platform,int i) {
		String sql1="update platform set pjibie=?,pxianshi=?,phangye=?,pxueke=? where pid=?";//4+1
		String sql2="update platform set yname=?,yzuzhidaima=?,yfaren=?,ydianhua=?,ytype=? where pid=?";//5+1
		String sql3="update platform set pyname=?,pysex=?,pybrith=?,pyzhicheng=?,pyzhuanye=?,pyxueli=?,pyxuewei=?,pydianhua=?,pyshouji=?,pyemail=? where pid=?";//10+1
		String sql4="update platform set pwangzhanming=?,pwangzhi=?,ptongxundizhi=?,pyoubian=? where pid=?";//4+1
		Connection con=Database.getConnection();
		PreparedStatement pre=null;
		if(i==1) {
			try {
				pre=con.prepareStatement(sql1);
				pre.setString(1, platform.getPjibie());
				pre.setString(2, platform.getPxianshi());
				pre.setString(3, platform.getPhangye());
				pre.setString(4, platform.getPxueke());
				pre.setInt(5, platform.getPid());
				pre.executeUpdate();
			} catch (SQLException e) {
				System.out.println("数据更新失败-1");
			}finally {
				Database.close(con);
				Database.close(pre);
			}
		}else if(i==2) {
			try {
				pre=con.prepareStatement(sql2);
				pre.setString(1, platform.getYname());
				pre.setString(2, platform.getYzuzhidaima());
				pre.setString(3, platform.getYfaren());
				pre.setString(4, platform.getYdianhua());
				pre.setString(5, platform.getYtype());
				pre.setInt(6, platform.getPid());
				pre.executeUpdate();
			} catch (SQLException e) {
				System.out.println("数据更新失败-2");
			}finally {
				Database.close(con);
				Database.close(pre);
			}
		}else if(i==3) {
			try {
				pre=con.prepareStatement(sql3);
				pre.setString(1, platform.getPyname());
				pre.setString(2, platform.getPysex());
				pre.setDate(3, platform.getPybrith());
				pre.setString(4, platform.getPyzhicheng());
				pre.setString(5, platform.getPyzhuanye());
				pre.setString(6, platform.getPyxueli());
				pre.setString(7, platform.getPyxuewei());
				pre.setString(8, platform.getPydianhua());
				pre.setString(9, platform.getPyshouji());
				pre.setString(10, platform.getPyemail());
				pre.setInt(11, platform.getPid());
				pre.executeUpdate();
			} catch (SQLException e) {
				System.out.println("数据更新失败-3");
			}finally {
				Database.close(con);
				Database.close(pre);
			}
		}else {
			try {
				pre=con.prepareStatement(sql4);
				pre.setString(1, platform.getPwangzhanming());
				pre.setString(2, platform.getPwangzhi());
				pre.setString(3, platform.getPtongxundizhi());
				pre.setString(4, platform.getPyoubian());
				pre.setInt(5, platform.getPid());
				pre.executeUpdate();
			} catch (SQLException e) {
				System.out.println("数据更新失败-4");
			}finally {
				Database.close(con);
				Database.close(pre);
			}
		}
	}

	@Override
	public Platform load(int pid) {
		String sql="select * from platform where pid=?";
		Connection con=Database.getConnection();
		PreparedStatement pre=null;
		ResultSet result=null;
		Platform plat=null;
		try {
			pre=con.prepareStatement(sql);
			pre.setInt(1, pid);
			result=pre.executeQuery();
			while(result.next()) {
				plat=new Platform();
				plat.setPid(pid);
				plat.setUsername(result.getString("username"));
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
			System.out.println("数据查询失败-ID");
		}finally {
			Database.close(con);
			Database.close(pre);
			Database.close(result);
		}
		return plat;
	}

	@Override
	public List<Platform> load() {
		String sql="select * from platform";
		Connection con=Database.getConnection();
		PreparedStatement pre=null;
		ResultSet result=null;
		List<Platform> plats=new ArrayList<>();
		try {
			pre=con.prepareStatement(sql);
			result=pre.executeQuery();
			while(result.next()) {
				Platform plat=new Platform();
				plat.setPid(result.getInt("pid"));
				plat.setUsername(result.getString("username"));
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
				
				plats.add(plat);
			}
		} catch (SQLException e) {
			System.out.println("数据查询失败-all");
		}finally {
			Database.close(con);
			Database.close(pre);
			Database.close(result);
			
		}
		
		return plats;
	}

	//用userid来查询pid
	@Override
	public int seek(String name) {
		String sql="select pid from platform where username=?";
		Connection con=Database.getConnection();
		PreparedStatement pre=null;
		ResultSet result=null;
		int pid=-1;
		try {
			pre=con.prepareStatement(sql);
			pre.setString(1,name);
			result=pre.executeQuery();
			while(result.next()) {
				pid=result.getInt("pid");
			}
		} catch (SQLException e) {
			System.out.println("数据查询失败-platform ID");
		}finally {
			Database.close(con);
			Database.close(pre);
		}
		return pid;
	}




}
