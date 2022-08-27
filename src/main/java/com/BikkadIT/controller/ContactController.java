package com.BikkadIT.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.model.Contact;
import com.BikkadIT.service.ContactServiceImpl;

@RestController
public class ContactController {

	@Autowired
	private ContactServiceImpl contactServiceImpl;
	
	@PostMapping(value="/savecontact",consumes="application/json")
	public ResponseEntity<String> savecontact(@RequestBody Contact contact){
		boolean savecontact = contactServiceImpl.savecontact(contact);
		if(savecontact == true) {
			String msg="Contact saved successfully";
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		}else {
			String msg="Contact not saved successfully";
			return new ResponseEntity<String>(msg,HttpStatus.BAD_REQUEST);
		
		}
	}
	
	@GetMapping(value = "/getallcontact",produces="application/json")
	public ResponseEntity<List<Contact>> getallcontact(){
		List<Contact> getallContact = contactServiceImpl.getallContact();
		if(getallContact != null) {
			return new ResponseEntity<List<Contact>>(getallContact,HttpStatus.OK);
		}else {
			String msg="Contact Details not found";
		return new ResponseEntity(msg,HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping(value ="/getcontactbyid/{cid}",produces="application/json" )
	public ResponseEntity<Contact> getcontactbyid(@PathVariable Integer cid){
		Contact getcontactById = contactServiceImpl.getcontactById(cid);
		
		return new ResponseEntity<Contact>(getcontactById,HttpStatus.OK);
		
	}

}
