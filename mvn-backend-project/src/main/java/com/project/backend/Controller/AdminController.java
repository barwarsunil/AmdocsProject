package com.project.backend.Controller;

import java.util.List;

import com.project.backend.DAO.AdminDAO;
import com.project.backend.DAO_Implementation.AdminDaoImp;
import com.project.backend.models.*;

public class AdminController {

	public static void main(String[] args) {
		
		AdminDAO dao = new AdminDaoImp();
		
		
//      // Insertion		
//      Admin admin = new Admin(10L,"sunil","54321","sunil@gmail.com");
//		
//		if(dao.addAdmin(admin))
//		System.out.println("Row Added Successfully");
//		else
//			System.out.println("Error , Can't Add");
		
		
		
//		//Deletion
//		if(dao.deleteAdmin(10L))
//			System.out.println("Row Deleted successfully");
//		
//		else
//			System.out.println("ERROR, can't Delete");

		
		//Get Admin by Id
//		Admin admin = dao.getAdminById(10L);
//		System.out.println(admin);
//		System.out.println();
//		
//		
//		// Update 
//		admin.setUsername("rahul");
//		if(dao.updateAdmin(admin)) {
//			System.out.println("Row Updated successfully");
//		}
//		else
//			System.out.println("Error , Can't Update");
		
		
		
		// Get All Admins
		List<Admin> res = dao.findAll();
		
		for(Admin u: res) {
			System.out.println(u);
		}
		
		
		

	}

}
