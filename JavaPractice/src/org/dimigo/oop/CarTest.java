package org.dimigo.oop;

public class CarTest {
	public static void main(String[] args) {
		Car[] c=new Car[3];
		for(int i=0;i<3;i++){
			c[i]=new Car();
		}
		System.out.println("<< 자동차 목록 >>");
		c[0].setCompany("현대자동차");
		c[0].setModel("제네시스");
		c[0].setColor("검정색");
		c[0].setMaxSpeed(225);
		c[0].setPrice(50000000);
		c[1].setCompany("기아자동차");
		c[1].setModel("K7");
		c[1].setColor("흰색");
		c[1].setMaxSpeed(246);
		c[1].setPrice(40000000);
		c[2].setCompany("삼성자동차");
		c[2].setModel("SM7");
		c[2].setColor("회색");
		c[2].setMaxSpeed(200);
		c[2].setPrice(38000000);
		for(Car k : c){
			System.out.println(k);
		}
	}
}
