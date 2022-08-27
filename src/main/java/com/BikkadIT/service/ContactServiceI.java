package com.BikkadIT.service;

import java.util.List;

import com.BikkadIT.model.Contact;

public interface ContactServiceI{

	boolean savecontact(Contact contact);
	
	List<Contact> getallContact();
	
	Contact getcontactById(Integer cid);
}
