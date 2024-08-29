package com;

import java.util.ArrayList;
import java.util.Scanner;

class Contact
{
	String firstName, lastName, address, city, state, email;
	long zip, phoneNum;
	
	Contact(String firstName, String lastName, String address, String city, String state, String email, long zip, long phoneNum)
	{
		this.firstName =firstName;
		this.lastName = lastName;
		this.address =address;
		this.city = city;
		this.state =state;
		this.email = email;
		this.zip = zip;
		this.phoneNum = phoneNum;
	}

    public void setFirstName(String firstName) 
    {
    	this.firstName = firstName; 
    }
    public String getFirstName() 
    { 
    	return firstName; 
    }
    
    public void setLastName(String lastName)
    {
    	this.lastName = lastName;
    }
    public String getLastName()
    {
    	return lastName;
    }
    
    public void setAddress(String address) 
    {
    	this.address = address; 
    }
    public String getAddress() 
    { 
    	return address; 
    }
    
    public void setCity(String city) 
    {
    	this.city = city; 
    }
    public String getCity() 
    { 
    	return city; 
    }
    
    public void setState(String state) 
    {
    	this.state = state; 
    }
    public String getState() 
    { 
    	return state; 
    }
    
    public void setEmail(String email) 
    {
    	this.email = email; 
    }
    public String getEmail() 
    { 
    	return email; 
    }
    
    public void setZip(long zip) 
    {
    	this.zip = zip; 
    }
    public long getZip() 
    { 
    	return zip; 
    }
    
    public void setPhoneNum(long phoneNum) 
    {
    	this.phoneNum = phoneNum; 
    }
    public long getPhoneNum() 
    { 
    	return phoneNum; 
    }
    
	
}

class AddressBook
{
	ArrayList<Contact> contacts = new ArrayList<>();
	
	public void addContact(Contact c)
	{
		contacts.add(c);
	}
	
	public void display()
	{
		for(Contact contact: contacts)
		{
			System.out.println("Name: "+contact.firstName+" "+contact.lastName+ "\nAddress: "+contact.address+"\n"+contact.city+" "+contact.state+" "+contact.zip+"\nPhone Number: "+contact.phoneNum+"\nEmail: "+contact.email);
			System.out.println();
			System.out.println();
		}
	}
}



public class UserCase1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AddressBook addressbook = new AddressBook();
		System.out.println();
		System.out.println("------------------------------------------------");
		System.out.println("~~~~~~~~~~~~Welcome to Address Book~~~~~~~~~~~~");
		System.out.println("------------------------------------------------");
		System.out.println();
			System.out.println("Enter the Contact Details: \n");
			
			System.out.println("FirstName: ");
			String firstName = sc.nextLine();
			
			System.out.println("LastName: ");
			String lastName = sc.nextLine();
			
			System.out.println("Address: ");
			String address = sc.nextLine();
			
			System.out.println("City: ");
			String city = sc.nextLine();
			
			System.out.println("State: ");
			String state = sc.nextLine();
			
			System.out.println("Email: ");
			String email = sc.nextLine();
			
			System.out.println("Zip Code: ");
			long zip = sc.nextLong();
			
			System.out.println("Phone Number: ");
			long phoneNum = sc.nextLong();
			
			sc.nextLine();
			
			Contact contact = new Contact(firstName, lastName, address, city, state, email, zip, phoneNum);
            addressbook.addContact(contact);
            
            System.out.println("------------------------------------------------");
		
		System.out.println("\n~~~~~~~Contact Details~~~~~~~ ");
		addressbook.display();
		
		sc.close();
	}

}
