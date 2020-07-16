package com.wry.Dao;



import java.util.List;
import com.wry.bean.User;
public interface UserDao {
	//查询所有，查询一个user对象
 List<User> findAllUser();
}