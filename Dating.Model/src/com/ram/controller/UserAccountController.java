package com.ram.controller;

import java.util.List;

import com.ram.dating.model.Interest;
import com.ram.dating.model.UserAccount;
import com.ram.dating.model.dao.UserAccountDAO;
import com.ram.dating.model.dao.UserAccountDAOImpl;

public class UserAccountController {

	public static void main(String[] args) {
		UserAccountController controller =new UserAccountController();
		controller.registerUser();
		

	}
	public void registerUser() {
	UserAccountDAO dao=new UserAccountDAOImpl();
		UserAccount userAccount = new UserAccount();
		userAccount.setId(1);
		userAccount.setUserName("Ramakrishna");
		userAccount.setAge(30);
		userAccount.setCity("AP");
		userAccount.setCountry("Indian");
		userAccount.setEmail("ramak34889@gmail.com");
		userAccount.setPassWord("password");
		userAccount.setGender("M");
		userAccount.setPhoneNumber("9949920819");
		Interest interest = new Interest();
		interest.setId(1);
		interest.setLikes("Watching tv");
		interest.setDislikes("playing chess");
		
		userAccount.setInterest(interest);
		dao.save(userAccount);	
		
			System.out.println(dao.findById(1));
			
			
			
			
			UserAccount userAccount1 = new UserAccount();
			userAccount1.setId(2);
			userAccount1.setUserName("krishna");
			userAccount1.setAge(40);
			userAccount1.setCity("MH");
			userAccount1.setCountry("America");
			userAccount1.setEmail("ramak34889@gmail.com");
			userAccount1.setPassWord("password");
			userAccount1.setGender("M");
			userAccount1.setPhoneNumber("9949920819");
			Interest interest1 = new Interest();
			interest.setId(1);
			interest.setLikes("Watching tv");
			interest.setDislikes(" chess");
			userAccount.setInterest(interest1);
			dao.save(userAccount);	
			
				System.out.println(dao.findById(1));
				
		
	}

}
