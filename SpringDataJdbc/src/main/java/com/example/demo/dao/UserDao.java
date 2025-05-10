package com.example.demo.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public class UserDao {

	private JdbcTemplate jdbcTemplate;
	
	public UserDao(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}
	
	public void saveUser(User user)
	{
		String query="insert into user(username,password, email) values(?,?,?)";
		int rowsEffected=jdbcTemplate.update(query,user.getUsername(),user.getPassword(),user.getEmail());
		
		System.out.println("User added"+rowsEffected);
		
	}
	
	public void deleteUser(long id)
	{
		String query="delete *from user where userId=?";
		
		int rowsEffected=jdbcTemplate.update(query,id);
		System.out.println("User deleted"+rowsEffected);

	}
	
	public void updateUser(long id, User user)
	{
		String query="update user set username=?,password=?,email=? where userId=?";
		int rowsEffected=jdbcTemplate.update(query,user.getUsername(),user.getPassword(),user.getEmail(),id);
		
		System.out.println("User updated"+rowsEffected);
	
	}
	
	public User getUser(long id)
	{
		String query="select *from user where userId=?";
		User user=jdbcTemplate.queryForObject(query, new UserRowMapper(),id);
		return user;
	}
	
	public List<User> getAllUsers()
	{
		String query="select *from user";
		List<User> users=jdbcTemplate.query(query,new UserRowMapper());
		
		return users;
	}
}
