package per.sun.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {
	
	//获取连接对象connection
	public static Connection getConnection() {
		String driver="com.mysql.jdbc.Driver";
		String root="root";
		String pass="sunyu";
		String url="jdbc:mysql://localhost:3306/use?useUnicode=true&characterEncoding=UTF-8";
		//useUnicode=true&characterEncoding=UTF-8&
		//&useSSL=false
		try {
				try {
					Class.forName(driver).newInstance();
				} catch (InstantiationException e) {
					System.out.println("数据库加载驱动失败1");
				}
		} catch (IllegalAccessException | ClassNotFoundException e) {
				System.out.println("数据库加载驱动失败2");
		}
		
		Connection connection=null;
		
		try {
			connection=DriverManager.getConnection(url,root,pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("数据连接对象加载失败");;
		}
		
		return connection;
	}
	
	//关闭资源
	public static void close(Connection connection) {
		try {
			if(connection!=null) 
				connection.close();
		}catch (SQLException e) {
			System.out.println("连接对象关闭失败");
		}
	}
	public static void close(PreparedStatement preparedStatement) {
		try {
			if(preparedStatement!=null) 
				preparedStatement.close();
		}catch (SQLException e) {
			System.out.println("语句传输对象关闭失败");
		}
	}
	public static void close(ResultSet resultSet) {
		try {
			if(resultSet!=null) 
				resultSet.close();
		}catch (SQLException e) {
			System.out.println("结果集对象关闭失败");
		}
	}
}
