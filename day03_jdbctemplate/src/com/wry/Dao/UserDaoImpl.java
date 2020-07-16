package com.wry.Dao;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import com.wry.bean.User;
import com.wry.demo.JDBCUtils;

public class UserDaoImpl implements UserDao{
	
 //创建jdbctemplate对象
 //private static DataSource jdbcutils;
 JdbcTemplate jt = new JdbcTemplate(JDBCUtils.getDataSource());
 @Override
 public List<User> findAllUser() {
  String sql = "select * from  person";
  List<User> lsit=jt.query(sql, new BeanPropertyRowMapper<User>(User.class));
  return lsit;
 }
}