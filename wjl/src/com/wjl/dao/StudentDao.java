package com.rj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.rj.entity.Student;
import com.rj.utils.DBConnection;

/**
 * student数据访问对象
 * 
 * @author Administrator
 * 
 */
public class StudentDao {
	/**
	 * 查询全部
	 * @return
	 */
	public static List<Student> queryAll(){
		List<Student> list=new ArrayList<Student>();
		//1.取得对象连接
		Connection conn =DBConnection.getConn();
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			ps=conn.prepareStatement("select * from student");
			//执行
			rs=ps.executeQuery();
			while (rs.next()){
				list.add(new Student(rs.getInt(1),rs.getString(2),rs.
						getString(3),rs.getString(4),rs.getInt(5)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBConnection.close(rs, ps, conn);
		}
		return list;
		
	}
	/**
	 * 根据id删除
	 * @param id
	 */
	public static void delById(int id){
		Connection conn = DBConnection.getConn();
		String sql = "delete from student where id=?";
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			//给参数赋值
			ps.setInt(1, id);
			// 执行
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBConnection.close(null, ps, conn);
		}
	}
	/**
	 * 根据id修改
	 * @param id
	 */
	public static void alterById(int id,String stuno,String name,String gender,int age){
		Connection conn = DBConnection.getConn();
		String sql = "update student set stuno=?,name=?,gender=?,age=? where id=?";
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			//给参数赋值
			 ps.setString(1, stuno);  
	         ps.setString(2, name);  
	         ps.setString(3, gender);  
	         ps.setInt(4, age);  
	         ps.setInt(5, id); 
			// 执行
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBConnection.close(null, ps, conn);
		}
	}
	/**
	 * 增加
	 * @param id
	 */
	public void addstudent(int id,String stuno,String name,String gender,int age){
		Connection conn = DBConnection.getConn();
		String sql = "insert into student values (?,?,?,?,?)";
		PreparedStatement ps = null;
		try {
			ps = conn.prepareStatement(sql);
			//给参数赋值
			ps.setInt(1, id);
			ps.setString(2, stuno);
			ps.setString(3, name);
			ps.setString(4, gender);
			ps.setInt(5, age);
			// 执行
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DBConnection.close(null, ps, conn);
		}
	}
	
	/**
	 * 根据id查询
	 * @param id
	 */
    public static Student queryById(int id){  
        String sql = "select * from student where id = ?";  
        Connection conn = null;  
        PreparedStatement ps = null;      
        ResultSet res = null;  
        Student student = null;  
        try {  
            conn = DBConnection.getConn();  
            ps =(PreparedStatement) conn.prepareStatement(sql);  
            ps.setInt(1, id);  
            res = ps.executeQuery();              
            while(res.next()){  
                student = new Student(res.getInt(1),res.getString(2), res.getString(3), res.getString(4), res.getInt(5));  
            }  
              
        } catch (SQLException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }finally{  
            try{  
                if(null!=res){  
                    res.close();                  
                }  
                if(null!=ps){  
                    ps.close();  
                }  
                if(null!=conn){  
                    conn.close();  
                }  
            }catch(SQLException e){  
                e.printStackTrace();  
            }  
        }  
        return student;  
    }  
}
