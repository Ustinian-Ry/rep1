package com.wry.jdbcTemplate;

import java.util.List;
import com.wry.bean.User;
import com.wry.Dao.UserDao;
import com.wry.Dao.UserDaoImpl;

public class Demo01jdbcTemplate {
 public static void main(String[] args) {
	 //调用方法
     UserDao ud = new UserDaoImpl();
     List<User>  list = ud.findAllUser();
     for(User user : list) {
    	 System.out.println(user);
     }
     
     
     
 }
}