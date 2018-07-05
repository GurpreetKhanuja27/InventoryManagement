package com;

public class Item {

	private String name;
	private int id;
	private String emailid;	
	
	public Item(String name, int id, String emailid) {
		super();
		this.name = name;
		this.id = id;
		this.emailid = emailid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	

		
	
}
