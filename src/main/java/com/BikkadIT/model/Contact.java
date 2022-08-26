package com.BikkadIT.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="CONTACT_DETAILS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CONTACT_ID")
	private Integer contactid;
	
	@Column(name="CONTACT_NAME")
	private String contactname;
	
	@Column(name="CONTACT_NUMBER")
	private String contactnumber;
	
	@Column(name="CONTACT_EMAIL")
	private String contactemail;
	
	@Column(name="ACTIVE_SWITCH")
	private Character activeswitch;
	
	@Column(name="CREATED_DATE",updatable =  false)
	@CreationTimestamp
	private LocalDate createddate;
	
	@Column(name="UPADTED_DATE",insertable =    false)
	@UpdateTimestamp
	private LocalDate updateddate;

	public Integer getContactid() {
		return contactid;
	}

	public void setContactid(Integer contactid) {
		this.contactid = contactid;
	}

	public String getContactname() {
		return contactname;
	}

	public void setContactname(String contactname) {
		this.contactname = contactname;
	}

	public String getContactnumber() {
		return contactnumber;
	}

	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}

	public String getContactemail() {
		return contactemail;
	}

	public void setContactemail(String contactemail) {
		this.contactemail = contactemail;
	}

	public Character getActiveswitch() {
		return activeswitch;
	}

	public void setActiveswitch(Character activeswitch) {
		this.activeswitch = activeswitch;
	}

	public LocalDate getCreateddate() {
		return createddate;
	}

	public void setCreateddate(LocalDate createddate) {
		this.createddate = createddate;
	}

	public LocalDate getUpdateddate() {
		return updateddate;
	}

	public void setUpdateddate(LocalDate updateddate) {
		this.updateddate = updateddate;
	}

	@Override
	public String toString() {
		return "Contact [contactid=" + contactid + ", contactname=" + contactname + ", contactnumber=" + contactnumber
				+ ", contactemail=" + contactemail + ", activeswitch=" + activeswitch + ", createddate=" + createddate
				+ ", updateddate=" + updateddate + "]";
	}

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contact(Integer contactid, String contactname, String contactnumber, String contactemail,
			Character activeswitch, LocalDate createddate, LocalDate updateddate) {
		super();
		this.contactid = contactid;
		this.contactname = contactname;
		this.contactnumber = contactnumber;
		this.contactemail = contactemail;
		this.activeswitch = activeswitch;
		this.createddate = createddate;
		this.updateddate = updateddate;
	}
	
}
