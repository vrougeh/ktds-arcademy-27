package com.ktdsuniversity.edu.app.v1;

public class Company {
	
	/**
	 * 회사의 이름
	 */
	private String companyName;
	
	/*
	 * 직급(사원,대리,과장,차장,부장,이사,대표)
	 */
	private String job;
	
	/**
	 * 회사의 주소
	 */
	private String address;
	
	/*private*/ Company(String companyName, String job, String address) {
		this.companyName = companyName;
		this.job = job;
		this.address = address;
	}

	public String getCompayName() {
		return this.companyName;
	}
	public void setCompayName(String compayName) {
		this.companyName = compayName;
	}

	public String getJob() {
		return this.job;
	}
	public void setJob(String job) {
		this.job = job;
	}

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
	return String.format("회사명: %s, 직급: %s, 주소: %s", 
			this.companyName, this.job, this.address);
	}
}
