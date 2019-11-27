package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserDao;
import com.model.User;
@Service
public class UserServiveImpl implements UserService {
	@Autowired
	private UserDao userDao;
   @Transactional
	@Override
	public User createUser(User user) {
		User user2=null;
		if (user.getPassword().length() >3)
		{
			user2=this.userDao.createUser(user);
		}
		return user2;
	}

	@Override
	public List<User> readUser() {
	    
		return this.userDao.readUser();
	}

	@Override
	public User readUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User readUserByName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteUser(int userId) {
	return	this.userDao.deleteUser(userId);
		
	}

}
