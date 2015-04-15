package murach.business;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the USER1 database table.
 * 
 */
 @Entity
 @Table(name="USER1") 
public class User2 implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private long userid;
	private String email;
	private String firstname;
	private String lastname;

	public User2() {
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


	 
	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}