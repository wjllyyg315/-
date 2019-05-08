package com.rj.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.rj.dao.DaoUser;
import com.rj.entity.UserInfo;
import com.rj.utils.DaoFactory;

public class DaoUserImpl implements DaoUser {
	DaoFactory df=new DaoFactory();
	ResultSet rs=null;
	int rows=0;
	//π‹¿Ì‘±µ«¬º
	public boolean AdminLogin(String username, String passwords) {
		// TODO Auto-generated method stub
		String sql="select * from UserInfo where username=? and password=? ";
		String [] params={username,passwords};
		rs=df.exeQu(sql, params);
		try {
			while(rs.next()){
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return false;
	}
}

