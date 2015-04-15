package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the USER1 database table.
 * 
 */
 @Entity
 @Table(name="USER1") 
public class User1 implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long userid;
	private String email;
	public String firstname;
	private String lastname;
	
	public String getlastname() {
		
		return lastname;
	}

	public User1() {
	}

 
	public long getUserid() {
		return this.userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

 
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	 
	public String getfirstname() {
		return this.firstname;
	}
	 
	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname; 
	}

}