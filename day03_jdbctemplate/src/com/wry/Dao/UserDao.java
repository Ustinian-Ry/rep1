package com.wry.Dao;



import java.util.List;
import com.wry.bean.User;
public interface UserDao {
	//��ѯ���У���ѯһ��user����
 List<User> findAllUser();
}