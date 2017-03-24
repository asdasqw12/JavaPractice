package org.dimigo.oop;

public class Car2 {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	public Car2(){
			
	}public Car2(String company,String model,String color,int maxSpeed,int price){
		setCompany(company);
		setModel(model);
		setColor(color);
		setMaxSpeed(maxSpeed);
		setPrice(price);
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString(){
		return "제조사명 : "+company+
				"\n모델명 : "+model+
				"\n색상 : "+color+
				"\n최대속도 : "+maxSpeed+"km"+
				"\n가격 : "+String.format("%,d",price)+"원\n";
	}
}
