package com.itp.jpa.Student_Mgt_System.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	private Long sId;
	private String sName;
	private String sAddress;
	public Long getsId() {
		return sId;
	}
	public void setsId(Long sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public Student(Long sId, String sName, String sAddress) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sAddress = sAddress;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sAddress=" + sAddress + "]";
	}
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
