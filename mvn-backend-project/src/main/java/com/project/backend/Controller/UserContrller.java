package com.project.backend.Controller;

import java.util.*;

import com.project.backend.DAO.UserDAO;
import com.project.backend.DAO_Implementation.UserDaoImp;
import com.project.backend.models.User;

public class UserContrller {

	public static void main(String[] args){

		UserDAO dao = new UserDaoImp();
		
		
//        // Insertion		
//        User user = new User(109L,"sunil","56789","sunil@gmail.com","alipurduar","5th july 2021","hellopass","img6.png");
//		
//		if(dao.addUser(user))
//		System.out.println("Row Added Successfully");
//		else
//			System.out.println("Error , Can't Add");
		
		
		
//		//Deletion
//		if(dao.deleteUser(109L))
//			System.out.println("Row Deleted successfully");
//		
//		else
//			System.out.println("ERROR, can't Delete");

		
//		//Get User by Id
//		User user = dao.getUserById(109L);
//		System.out.println(user);
//		System.out.println();
		
		
//		// Update 
//		user.setUsername("sunil");
//		if(dao.updateUser(user)) {
//			System.out.println("Row Updated successfully");
//		}
//		else
//			System.out.println("Error , Can't Update");
		
		
		
		// Get All Users
		List<User> res = dao.findAll();
		
		for(User u: res) {
			System.out.println(u);
		}
		
		
		
	}

}
