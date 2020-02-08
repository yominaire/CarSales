package com.entity;

public class Car {
	private String make;
	private String year;
	private String mileage;
	private String price;
	private String BodyType;
	private String InvDate;
	public Car() {}
	public Car(String make, String year, String mileage, String price, String bodyType, String invDate) {
		super();
		this.make = make;
		this.year = year;
		this.mileage = mileage;
		this.price = price;
		BodyType = bodyType;
		InvDate = invDate;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMileage() {
		return mileage;
	}
	public void setMileage(String mileage) {
		this.mileage = mileage;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getBodyType() {
		return BodyType;
	}
	public void setBodyType(String bodyType) {
		BodyType = bodyType;
	}
	public String getInvDate() {
		return InvDate;
	}
	public void setInvDate(String invDate) {
		InvDate = invDate;
	}
	@Override
	public String toString() {
		return "Car [make=" + make + ", year=" + year + ", mileage=" + mileage + ", price=" + price + ", BodyType="
				+ BodyType + ", InvDate=" + InvDate + "]";
	}
	
	

}
