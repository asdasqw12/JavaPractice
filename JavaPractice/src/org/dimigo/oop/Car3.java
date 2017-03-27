package org.dimigo.oop;

public class Car3 {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	public Car3(){
			
	}public Car3(String company,String model,String color){
		this();
		setCompany(company);
		setModel(model);
		setColor(color);
	}public Car3(String company,String model,String color,int maxSpeed){
		this(company,model,color);
		setMaxSpeed(maxSpeed);
	}public Car3(String company,String model,String color,int maxSpeed,int price){
		this(company,model,color,maxSpeed);
		setPrice(price);
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
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
		return    "������� : "+company+
				"\n�𵨸� : "+model+
				"\n���� : "+color+
				"\n�ִ�ӵ� : "+maxSpeed+"km"+
				"\n���� : "+String.format("%,d",price)+"��\n";
	}
}
