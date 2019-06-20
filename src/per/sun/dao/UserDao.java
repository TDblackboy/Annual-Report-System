package per.sun.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import per.sun.modal.User;
import per.sun.util.Database;

public class UserDao implements UserDaoIF {

	@Override
	public void add(User user) {
		String sql="insert into user(username,userpass,usertype) value(?,?,?)";
		Connection connection=Database.getConnection();
		PreparedStatement preparedStatement=null;
		
		//添加判断是否存在
		try {
			preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2, user.getUserpass());
			preparedStatement.setString(3, user.getUsertype());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println("user向数据表中添加数据失败");
		}finally {
			Database.close(connection);
			Database.close(preparedStatement);
		}
	}

	@Override
	public void deleted(int userId) {
		String sql="delete from user where userid = ?";
		Connection connection=Database.getConnection();
		PreparedStatement prepared=null;
		try {
			prepared=connection.prepareStatement(sql);
			prepared.setInt(1, userId);
			prepared.executeUpdate();
		} catch (SQLException e) {
			System.out.println("user删除失败。");
		}finally {
			Database.close(connection);
			Database.close(prepared);
		}
		
	}

	@Override
	public void update(User user) {
		String sql="update user set username=?,userpass=? where userid = ?";
		Connection connection=Database.getConnection();
		PreparedStatement prepared=null;
		try {
			prepared=connection.prepareStatement(sql);
			prepared.setString(1, user.getUsername());
			prepared.setString(2, user.getUserpass());
			prepared.setInt(3, user.getId());
			prepared.executeUpdate();
		} catch (SQLException e) {
			System.out.println("user更新失败。");
		}finally {
			Database.close(connection);
			Database.close(prepared);
		}
		
	}

	@Override
	public User load(int userId) {
		String sql="select * from user where userid = ?";
		User user=null;
		ResultSet result=null;
		PreparedStatement prepared=null;
		Connection connection=Database.getConnection();
		try {
			prepared=connection.prepareStatement(sql);
			prepared.setInt(1, userId);
			result=prepared.executeQuery();
			while(result.next()) {
				user=new User();
				user.setId(result.getInt("userid"));
				user.setUsername(result.getString("username"));
				user.setUserpass(result.getString("userpass"));
				user.setUsertype(result.getString("usertype"));
			}
		} catch (SQLException e) {
			System.out.println("user以id查询用户失败。");
		}finally {
			Database.close(connection);
			Database.close(prepared);
			
		}
 		return user;
	}

	@Override
	public List<User> load() {
		String sql="select * from user";
		Connection connection=Database.getConnection();
		List<User> users=new ArrayList<>();
		PreparedStatement prepared=null;
		ResultSet result=null;
		try {
			prepared=connection.prepareStatement(sql);
			result=prepared.executeQuery();
			while(result.next()) {
				User user=new User();
				user.setId(result.getInt("userid"));
				user.setUsername(result.getString("username"));
				user.setUserpass(result.getString("userpass"));
				user.setUsertype(result.getString("usertype"));
				users.add(user);
			} 
		}catch (SQLException e) {
				System.out.println("user查询全部失败");
		}finally {
				Database.close(connection);
				Database.close(prepared);
				Database.close(result);
		}
		return users;
	}

	@Override
	public User load(String name) {
		String sql="select * from user where username = ?";
		Connection connection=Database.getConnection();
		PreparedStatement prepared=null;
		ResultSet result=null;
		User user=null;
		try {
			prepared=connection.prepareStatement(sql);
			prepared.setString(1, name);
			result=prepared.executeQuery();
			while(result.next()) {
				user=new User();
				user.setId(result.getInt("userid"));
				user.setUsername(result.getString("username"));
				user.setUserpass(result.getString("userpass"));
				user.setUsertype(result.getString("usertype"));
			}
		} catch (SQLException e) {
			System.out.println("user查询失败-name");
		}finally {
			Database.close(connection);
			Database.close(prepared);
			Database.close(result);
		}
		return user;
	}

}
