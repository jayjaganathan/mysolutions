package com.jj.beans;

import javax.ejb.Local;
import model.User1;

@Local
public interface UserBeanLocal {
	public User1 selectUser(String email);
	public void insert(User1 user);
}
