package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.User;
@Repository
public class UserDaoImpl implements UserDao {
  @Autowired
  private SessionFactory sessionFactory;
	@Override
	public User createUser(User user) {
		Session session=this.sessionFactory.openSession();
		session.save(user);
		return user;
	}
	@Override
	public List<User> readUser() {
		Session session=this.sessionFactory.openSession();
		//hql
		String readUser="from User";
		List<User> users=session.createQuery(readUser).list();
		
		return users;
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
	Session session=this.sessionFactory.openSession();
	session.saveOrUpdate(user);
		return user;
	}

	@Override
	public User deleteUser(int userId) {
		Session session=this.sessionFactory.openSession();
		//session.load(User.class, new Integer(userId));
		//auto boxing
		User obj=session.load(User.class, userId);
		session.delete(obj);
		return null;
	}

}
