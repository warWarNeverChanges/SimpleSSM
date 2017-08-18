package com.typicalSSM.service;

import com.typicalSSM.model.User;

public interface UserService {
	public User userLogin(String phoneNum,String password);
}
