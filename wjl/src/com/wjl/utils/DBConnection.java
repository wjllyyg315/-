package com.rj.utils;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {

	private static String url="jdbc:mysql://localhost:3306/student";
	private static String user="root";
	private static String password="wlw123456!";
static{
	//1.��������
	try{
	Class.forName("com.mysql.jdbc.Driver");
	}catch(ClassNotFoundException e){
		e.printStackTrace();
	}
}
/**
 * ��ȡ���Ӷ���
 * @return
 */
public static Connection getConn(){
	Connection conn=null;
	try {
		conn=DriverManager.getConnection(url, user,password);
		System.out.println("�������ݿ�ɹ�");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return conn;
}
/**
 * �ر�����
 * @param rs
 * @param ps
 * @param conn
 */
public static void close(ResultSet rs, PreparedStatement ps, Connection conn) {
	if(rs != null) {
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	if(ps != null) {
		try {
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	if(conn != null) {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

/**
 * �ر�����
 * @param rs
 * @param cs
 * @param conn
 */
public static void close(ResultSet rs, CallableStatement cs, Connection conn) {
	if(rs != null) {
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	if(cs != null) {
		try {
			cs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	if(conn != null) {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
public static void main(String [] args){
	System.out.println(DBConnection.getConn());
}
}