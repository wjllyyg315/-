package com.rj.utils;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class DaoFactory {
	private String driver="com.mysql.jdbc.Driver";
	private String url="jdbc:mysql://localhost:3306/student";
	private String name="root";
	private String pwd="wlw123456!";
	public Connection con=null;
	public PreparedStatement pstmt=null;
	public ResultSet rs=null;
	public static CallableStatement cstmt=null;
	public int row=0;
	//获取数据库连接
	public Connection getCon(){
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con=DriverManager.getConnection(url,name,pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	} 
	//执行查询的方法
	public ResultSet exeQu(String sql,String[] params){
		try {
			pstmt=getCon().prepareStatement(sql);
			if(params!=null){
				for(int i=0;i<params.length;i++){
					pstmt.setString(i+1, params[i]);
				}
			}
			rs=pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	//执行增删改语句
	public int exeUp(String sql,String[] params){
		try {
			pstmt=getCon().prepareStatement(sql);
			if(params!=null){
				for(int i=0;i<params.length;i++){
					pstmt.setString(i+1, params[i]);
				}
			}
			row=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row;
	}
	
	
	
	//释放资源
	public void closeAll(ResultSet rs,PreparedStatement pstmt,Connection con){
		try {
			if(rs!=null){	
					rs.close();
			}
			if(pstmt!=null){
					pstmt.close();
			}
			if(con!=null){				
					con.close();				
			}
		} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
	}
}
