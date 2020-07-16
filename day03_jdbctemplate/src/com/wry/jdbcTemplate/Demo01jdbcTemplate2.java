package com.wry.jdbcTemplate;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.wry.bean.User;

public class Demo01jdbcTemplate2 {
 public static void main(String[] args) {
  JdbcTemplate jt = new JdbcTemplate(jdbcutils.getDataSource());
  String sql= " SELECT *from person";
  List<User> list=jt.query(sql, new BeanPropertyRowMapper<User>(User.class));
  
  for(User user : list){
   System.out.println(user);
  }
 }
}
