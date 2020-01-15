package com.wanchopi.spring.model;

/**
 * Entity
 * @author Wanchopi
 *
 */
public class Student {
	
	private String userName;
	private String email;
	private String password;
	private String gender;
	private String country;
	private boolean receivePaper;
	private String[] favoriteFrameworks;
	
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the receivePaper
	 */
	public boolean isReceivePaper() {
		return receivePaper;
	}
	/**
	 * @param receivePaper the receivePaper to set
	 */
	public void setReceivePaper(boolean receivePaper) {
		this.receivePaper = receivePaper;
	}
	/**
	 * @return the favoriteFrameworks
	 */
	public String[] getFavoriteFrameworks() {
		return favoriteFrameworks;
	}
	/**
	 * @param favoriteFrameworks the favoriteFrameworks to set
	 */
	public void setFavoriteFrameworks(String[] favoriteFrameworks) {
		this.favoriteFrameworks = favoriteFrameworks;
	}
	
}
