package com.aescpl.ims.model;

public class Course {
	
	private int cid; 
	private String cname;
	
	//setter and getters
	
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public int getCid() {
		return cid;
	}
	
	public String getCname() {
		return cname;
	}

	@Override
	public String toString() {
		return "[cid=" + cid + ", cname=" + cname + "]";
	}
	
	
	
}
