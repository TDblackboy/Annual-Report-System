package per.sun.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import per.sun.modal.Platform;
import per.sun.util.Database;
import per.sun.util.Pack;

public class PlatformQueryImp implements PlatformQuery {

	@Override
	public List<Platform> search() {
		String sql="select * from platform";
		Connection con=Database.getConnection();
		PreparedStatement pre=null;
		ResultSet result=null;
		List<Platform> plats=new ArrayList<>();
		
			try {
				pre=con.prepareStatement(sql);
				result=pre.executeQuery();
				plats=Pack.packList(result);
			} catch (SQLException e) {
				System.out.println("manager���ݲ�ѯʧ��-1");
				e.printStackTrace();
			}finally {
				Database.close(result);
				Database.close(pre);
				Database.close(con);
			}
			//plats=Pack.packList(result);
		return plats;
	}
	
	@Override
	public List<Platform> search(String str) {
		
		String sql="select * from platform where pname like '%"+str+"%'";
		List<Platform> plats=new ArrayList<>();
		Connection con=Database.getConnection();
		PreparedStatement pre=null;
		ResultSet result=null;
			try {
				pre=con.prepareStatement(sql);
				result=pre.executeQuery();
				plats=Pack.packList(result);
			} catch (SQLException e) {
				System.out.println("manager���ݲ�ѯʧ��-2");
				e.printStackTrace();
			}
		return plats;
	}

	@Override
	public List<Platform> search(Platform platform) {
		//׼��������ѯ���
		String sql="select * from platform where pname =? and pyname = ?";
		
		List<Platform> plats=new ArrayList<>();
		Connection con=Database.getConnection();
		PreparedStatement pre=null;
		ResultSet result=null;
			try {
				pre=con.prepareStatement(sql);
				pre.setString(1, platform.getPname());
				pre.setString(2	, platform.getPyname());
				result=pre.executeQuery();
				plats=Pack.packList(result);
			} catch (SQLException e) {
				System.out.println("manager���ݲ�ѯʧ��-3");
				e.printStackTrace();
			}finally {
				Database.close(result);
				Database.close(pre);
				Database.close(con);
			}
			return plats;
	}

	@Override
	public Platform load(String pname) {
		String sql="select * from platform where pname =?";
		Platform  plat=null;
		Connection con=Database.getConnection();
		PreparedStatement pre=null;
		ResultSet result=null;
			try {
				pre=con.prepareStatement(sql);
				pre.setString(1, pname);
				result=pre.executeQuery();
				plat=Pack.pack(result);
			} catch (SQLException e) {
				System.out.println("manager���ݲ�ѯʧ��-4");
				e.printStackTrace();
			}finally {
				Database.close(result);
				Database.close(pre);
				Database.close(con);
			}
			return plat;
	}

	@Override
	public List<Platform> search(String type, String choose) {
		String sql="select * from platform ";
		if(type.equals("1")) {
			sql+="where ptype=?";	
		}else if(type.equals("2")) {
			sql+="where pjibie=?";
		}
		Connection con=Database.getConnection();
		PreparedStatement pre=null;
		ResultSet result=null;
		List<Platform>list=new ArrayList<Platform>();
		try {
			pre = con.prepareStatement(sql);
			if(!type.equals("3")) {
				pre.setString(1, choose);
			}
			result=pre.executeQuery();
			list=Pack.packList(result);
		} catch (SQLException e) {
			System.out.println("manager���ݲ�ѯʧ��-5");
			e.printStackTrace();
		}finally {
			Database.close(result);
			Database.close(pre);
			Database.close(con);
		}
		return list;
	}
	
}
