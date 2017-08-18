package com.typicalSSM.dao;


import org.springframework.stereotype.Repository;

import com.typicalSSM.model.User;

@Repository
public interface UserDao {
	public User userLogin(String phoneNum , String password);
}
