package com.androjava.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.androjava.model.UserModel;

 
public interface UserService {

public UserModel saveUser(UserModel model);
	
}
