package com.thbs.app.UserManagement.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "registration")
public class Registration {

	@Id
	private int id;

	private String emailId;

	private String password;

	private String roles;

	public int getId() {

		return id;
	}

	public void setId(int id) {

		this.id = id;
	}

	public String getEmailId() {

		return emailId;
	}

	public void setEmailId(String emailId) {

		this.emailId = emailId;
	}

	public String getPassword() {

		return password;
	}

	public void setPassword(String password) {

		this.password = password;
	}

	public String getRoles() {

		return roles;
	}

	public void setRoles(String roles) {

		this.roles = roles;
	}

	public Registration() {

		System.out.println("created " + this.getClass().getSimpleName());
	}

	public Registration(int id, String emailId, String password, String roles) {

		this.id = id;
		this.emailId = emailId;
		this.password = password;
		this.roles = roles;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		return "Registration [id=" + id + ", emailId=" + emailId + ", password=" + password + ", roles=" + roles + "]";
	}
	
}
