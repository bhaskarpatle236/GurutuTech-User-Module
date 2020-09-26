package com.gurutu.gurututechentity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GurutuTechUserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
	private String userName;
	private String userEmail;
	private String userPhone;
	private String userOverallLimit;
	private String userUtilizedLimit;
	private String userAvailableLimit;
	
	
	

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserOverallLimit() {
		return userOverallLimit;
	}

	public void setUserOverallLimit(String userOverallLimit) {
		this.userOverallLimit = userOverallLimit;
	}

	public String getUserUtilizedLimit() {
		return userUtilizedLimit;
	}

	public void setUserUtilizedLimit(String userUtilizedLimit) {
		this.userUtilizedLimit = userUtilizedLimit;
	}

	public String getUserAvailableLimit() {
		return userAvailableLimit;
	}

	public void setUserAvailableLimit(String userAvailableLimit) {
		this.userAvailableLimit = userAvailableLimit;
	}

}
