package com.aescpl.ims.model;

public class Batch {
	
	private int bid; 
	private String bname; 
	private Faculty faculty;
	
	// setter and getters
	
	public void setBid(int bid) {
		this.bid = bid;
	}
	
	public void setBname(String bname) {
		this.bname = bname;
	}
	
	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public int getBid() {
		return bid;
	}
	
	public String getBname() {
		return bname;
	}

	@Override
	public String toString() {
		return "[bid=" + bid + ", bname=" + bname + ", faculty=" + faculty + "]";
	}
}
