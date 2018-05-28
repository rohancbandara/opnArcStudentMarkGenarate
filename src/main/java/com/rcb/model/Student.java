package com.rcb.model;

public class Student {

	private int stuId;
	private String stuName;
	private String adNo;
	private String adStree1;
	private String adStree2;
	private String adCity;
	private int clID;
	private String stuGender;
	private double avgMark;
	
	

	public double getAvgMark() {
		return avgMark;
	}

	public void setAvgMark(double avgMark) {
		this.avgMark = avgMark;
	}

	public String getStuGender() {
		return stuGender;
	}

	public void setStuGender(String stuGender) {
		this.stuGender = stuGender;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
	}

	public String getAdNo() {
		return adNo;
	}

	public void setAdNo(String adNo) {
		this.adNo = adNo;
	}

	public String getAdStree1() {
		return adStree1;
	}

	public void setAdStree1(String adStree1) {
		this.adStree1 = adStree1;
	}

	public String getAdStree2() {
		return adStree2;
	}

	public void setAdStree2(String adStree2) {
		this.adStree2 = adStree2;
	}

	public String getAdCity() {
		return adCity;
	}

	public void setAdCity(String adCity) {
		this.adCity = adCity;
	}

	public int getClID() {
		return clID;
	}

	public void setClID(int clID) {
		this.clID = clID;
	}

}
