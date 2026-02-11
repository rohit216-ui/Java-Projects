package com.aescpl.ims.model;

public class Faculty {

	private int fid; 
	private String fname; 
	private Course course; 
	
	// setter and getters
	
	public void setFid(int fid) {
		this.fid = fid;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public int getFid() {
		return fid;
	}
	
	public String getFname() {
		return fname;
	}

	
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	@Override
	public String toString() {
		return " [fid=" + fid + ", fname=" + fname + ", course=" + course + "]";
	}

}
