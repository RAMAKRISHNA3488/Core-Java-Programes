package com.ram.dating.model.dao;

import java.util.List;

import com.ram.dating.model.UserAccount;

public interface UserAccountDAO {
	 void save(UserAccount userAccount);
	 UserAccount findById(int id);
	 List<UserAccount> findAll();
	 List<UserAccount> findMatches(int age,String city);
     void delete(int id);
}
