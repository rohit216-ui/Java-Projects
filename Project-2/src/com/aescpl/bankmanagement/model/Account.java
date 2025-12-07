package com.aescpl.bankmanagement.model;

public class Account {
	private int accNo;
	private String name;
	private String mobNo;
	private String adharNo;
	private short age;
	private String gender;
	private double balance;
	private int upin;
	
	//setter and getters
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	
	public void setAge(short age) {
		this.age = age;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setUpin(int upin) {
		this.upin = upin;	}
	
	public int getAccNo() {
		return accNo;
	}
	
	public String getName() {
		return name;
	}
	
	public String getMobNo() {
		return mobNo;
	}
	
	public short getAge() {
		return age;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getAdharNo() {
		return adharNo;
	}
	
	public String getGender() {
		return gender;
	}
	
	public int getUpin() {
		return upin;
	}
}
