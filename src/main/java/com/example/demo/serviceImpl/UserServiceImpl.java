package com.example.demo.serviceImpl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	List<User> a1=new ArrayList<>();

	@Override
	public User createUser(User user) {
		a1.add(user);
		return user;
	}
	
	@Override
	public List<User> getAllUsers(){
		return a1;
	}

	public User updateUser(String id,User user) {
		
		for(User u:a1)
		{
			if(u.getId().equals(id))
			{
				u.setUserName(user.getName());
				u.setName(user.getUserName());
				return u;
			}
		}
		return null;
	}
	public User deleteUser(String id) {
		
		for(User u:a1)
		{
			if(u.getId().equals(id))
			{
				a1.remove(u);
				return u;
			}
		}
		return null;
	}
}
