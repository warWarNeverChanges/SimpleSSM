package com.typicalSSM.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.typicalSSM.dao.UserDao;
import com.typicalSSM.model.User;
import com.typicalSSM.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;
	
	@Override
	public User userLogin(String phoneNum, String password) {
		return userDao.userLogin(phoneNum, password);
	}
}
