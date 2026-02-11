package com.aescpl.ims.model;

public class Student {
	
	private int sid; 
	private String sname; 
	private Batch batch;
	
	// setter and getter
	
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	public void setSname(String sname) {
		this.sname = sname;		
	}
	
	public int getSid() {
		return sid;
	}
	
	public String sname() {
		return sname;
	}

	@Override
	public String toString() {
		return " [sid=" + sid + ", sname=" + sname + ", batch=" + batch + "]";
	}

	public Batch getBatch() {
		return batch;
	}

	public void setBatch(Batch batch) {
		this.batch = batch;
	}
}
