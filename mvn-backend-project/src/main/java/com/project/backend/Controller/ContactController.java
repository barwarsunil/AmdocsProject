package com.project.backend.Controller;

import java.util.*;

import com.project.backend.DAO.ContactDAO;
import com.project.backend.DAO_Implementation.ContactDaoImp;
import com.project.backend.models.Contact;

public class ContactController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ContactDAO dao = new ContactDaoImp();
		
		
//      // Insertion		
//      Contact contact = new Contact(6L,109L,"sunil","sunil@gmail.com","54321","Message");
//		
//		if(dao.addContact(contact))
//		System.out.println("Row Added Successfully");
//		else
//			System.out.println("Error , Can't Add");

		
		
//		//Deletion
//		if(dao.deleteContact(6L))
//			System.out.println("Row Deleted successfully");
//		
//		else
//			System.out.println("ERROR, can't Delete");
		
		
		//Get Course by Id
		Contact contact = dao.getContactById(6L);
		System.out.println(contact);
		System.out.println();
		
		
		// Update 
//		contact.setName("rahul");
//		if(dao.updateContact(contact)) {
//			System.out.println("Row Updated successfully");
//		}
//		else
//			System.out.println("Error , Can't Update");
		
		
		
		//Get All Contacts
		List<Contact> contacts = new ArrayList<>();
		contacts = dao.findAll();
		
		for(Contact c:contacts) {
			System.out.println(c);
		}
		
		
		
	}

}
