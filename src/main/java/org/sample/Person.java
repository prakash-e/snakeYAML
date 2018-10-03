package org.sample;

import java.util.List;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private List<Contact> contactDetails;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public List<Contact> getContactDetails() {
		return contactDetails;
	}
	public void setContactDetails(List<Contact> contactDetails) {
		this.contactDetails = contactDetails;
	}
	@Override
	public String toString() {
		return "firstName "+firstName+" lastName "+lastName+" age "+age +" contacts "+contactDetails;
	}
	
}
