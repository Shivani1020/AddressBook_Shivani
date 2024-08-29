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
				System.out.println("Name: " + contact.firstName + " " + contact.lastName +
	                    "\nAddress: " + contact.address + "\n" + contact.city + " " +
	                    contact.state + " " + contact.zip + "\nPhone Number: " + contact.phoneNum +
	                    "\nEmail: " + contact.email);
				System.out.println();
	    		  System.out.println("------------------------------------------------");
			}		
	}
	
	public Contact findcontact(String firstName, String lastName)
	  {
		  for(Contact contact: contacts)
		  {
			  if(contact.getFirstName().equalsIgnoreCase(firstName) && contact.getLastName().equalsIgnoreCase(lastName))
			  {
				  return contact;
			  }
		  }
		return null;
	  }


	public void editContact(String firstName, String lastName, Scanner sc)
	{
		Contact contact = findcontact(firstName, lastName);
		if(contact != null)
		{
			System.out.println("Edit Contact details for: "+firstName+ " "+lastName);
			
			System.out.println("New First Name: ");
			contact.setFirstName(sc.nextLine());
			
			System.out.println("New Last Name: ");
			contact.setLastName(sc.nextLine());
			
			System.out.println("New Address: ");
			contact.setAddress(sc.nextLine());
			
			System.out.println("New City: ");
			contact.setCity(sc.nextLine());
			
			System.out.println("New State: ");
			contact.setState(sc.nextLine());
			
			System.out.println("New Zip Code: ");
			contact.setZip(sc.nextLong());
			
			System.out.println("New Phone Number: ");
			contact.setPhoneNum(sc.nextLong());
			sc.nextLine();
			
			System.out.println("New Email: ");
			contact.setEmail(sc.nextLine());
			
			
		}
		else
		{
			System.out.println("Contact not found");
		}
				
	 }
	
	public void delete(String firstName, String lastName)
	{
		Contact contact = findcontact(firstName, lastName);
		if(contact != null)
		{
			contacts.remove(contact);
			System.out.println("------------------------------------------------");
			System.out.println(firstName+ " "+lastName+" got deleted from Address Book.");
			System.out.println("------------------------------------------------");
		}
		else
		{
			System.out.println("------------------------------------------------");
			System.out.println("Contact not found");
			System.out.println("------------------------------------------------");
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
		
		 while (true) {
	    	  System.out.println("Choose the option");
	    	  System.out.println("1. Add Contact");
	    	  System.out.println("2. Edit Contact");
	    	  System.out.println("3. Display Contacts");
	    	  System.out.println("4. Delete Contact");
	    	  System.out.println("5. Exit");
	    	  System.out.println("Enter your choice: ");
	    	  
	    	  int choice = sc.nextInt();
	    	  sc.nextLine();
	    	  
	    	  switch(choice) {
	    	  
	    	  case 1: System.out.println("Enter the Contact Details: \n");

	          System.out.print("FirstName: ");
	          String firstName = sc.nextLine();

	          System.out.print("LastName: ");
	          String lastName = sc.nextLine();

	          System.out.print("Address: ");
	          String address = sc.nextLine();

	          System.out.print("City: ");
	          String city = sc.nextLine();

	          System.out.print("State: ");
	          String state = sc.nextLine();

	          System.out.print("Email: ");
	          String email = sc.nextLine();

	          System.out.print("Zip Code: ");
	          long zip = sc.nextLong();

	          System.out.print("Phone Number: ");
	          long phoneNum = sc.nextLong();

	          // Consume the leftover newline
	          sc.nextLine();

	          Contact contact = new Contact(firstName, lastName, address, city, state, email, zip, phoneNum);
	          addressbook.addContact(contact);
	          
    		  System.out.println("------------------------------------------------");
    		  System.out.println("Contact Updated");
    		  System.out.println("------------------------------------------------");
    		  
	          break;
	          
	    	  case 2:
	    		  System.out.println("Enter the name to edit");
	    		  System.out.println("First Name: ");
	    		  String editFirstName = sc.nextLine();
	    		  
	    		  System.out.println("Last Name: ");
	    		  String editLastName = sc.nextLine();
	    		  
	    		  addressbook.editContact(editFirstName, editLastName, sc);
	    		  break;
	    		  
	    	  case 3:
	    		  System.out.println("------------------------------------------------");
	    		  System.out.println("~~~~~~~Contact Details~~~~~~~ ");
	    		  System.out.println();
	    		  
	    		  if(addressbook.contacts.isEmpty())
	    		  {
	    			  System.out.println("------------------------------------------------");
	    			  System.out.println("Address Book is Empty.");
	    			  System.out.println("------------------------------------------------");
	    			  System.out.println();
	    		  }
	    		  else
	    		  {
	    			  System.out.println("\nAll Contact Details");
	    			  addressbook.display();
	    		  }
	    		  break;
	    		  
	    	  case 4:
	    		  if(addressbook.contacts.isEmpty())
	    		  {
	    			  System.out.println("------------------------------------------------");
	    			  System.out.println("Address Book is Empty. There is nothing to delete.");
	    			  System.out.println("------------------------------------------------");
	    			  System.out.println();
	    			  
	    		  }
	    		  else
	    		  {
	    			  System.out.println("Enter name to delete.");
		    		  System.out.println("First Name: ");
		    		  String deletefirstName = sc.nextLine();
		    		  
		    		  System.out.print("Last Name: ");
		    		  String deletelastName = sc.nextLine();
		    		  
		    		  addressbook.delete(deletefirstName, deletelastName);
	    		  }
	    		  
	    		  break;
	    		  
	    		  
	    	  case 5:
	    		  System.out.println("------------------------------------------------");
	    		  System.out.println("Thanks for using Address Book.");
	    		  System.out.println("Clossing...............");
	    		  System.out.println("------------------------------------------------");
	    		  sc.close();
	    		  return;
	    		  
	    		  default :
	    			  System.out.println("------------------------------------------------");
	    			  System.out.println("Invalid choice entered.");
	    			  System.out.println("------------------------------------------------");
	    		  
	    	  }
	      }	
        
	}

}
