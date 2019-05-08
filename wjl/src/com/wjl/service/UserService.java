package com.rj.service;

import java.util.List;

import com.rj.dao.DaoUser;
import com.rj.entity.UserInfo;
import com.rj.dao.DaoUserImpl;

public class UserService {
	DaoUser du=new DaoUserImpl();
	public boolean AdminLogin(String username,String password){
		return du.AdminLogin(username, password);
	}
}
