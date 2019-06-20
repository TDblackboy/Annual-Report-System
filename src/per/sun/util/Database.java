package per.sun.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {
	
	//��ȡ���Ӷ���connection
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
					System.out.println("���ݿ��������ʧ��1");
				}
		} catch (IllegalAccessException | ClassNotFoundException e) {
				System.out.println("���ݿ��������ʧ��2");
		}
		
		Connection connection=null;
		
		try {
			connection=DriverManager.getConnection(url,root,pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("�������Ӷ������ʧ��");;
		}
		
		return connection;
	}
	
	//�ر���Դ
	public static void close(Connection connection) {
		try {
			if(connection!=null) 
				connection.close();
		}catch (SQLException e) {
			System.out.println("���Ӷ���ر�ʧ��");
		}
	}
	public static void close(PreparedStatement preparedStatement) {
		try {
			if(preparedStatement!=null) 
				preparedStatement.close();
		}catch (SQLException e) {
			System.out.println("��䴫�����ر�ʧ��");
		}
	}
	public static void close(ResultSet resultSet) {
		try {
			if(resultSet!=null) 
				resultSet.close();
		}catch (SQLException e) {
			System.out.println("���������ر�ʧ��");
		}
	}
}
