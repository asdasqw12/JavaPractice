package org.dimigo.oop;

public class CarTest2 {
	public static void main(String[] args) {
		Car2[] c=new Car2[3];
		c[0]=new Car2("�����ڵ���","���׽ý�","������",225,50000000);
		c[1]=new Car2("����ڵ���","K7","���",246,40000000);
		c[2]=new Car2("�Ｚ�ڵ���","SM7","ȸ��",200,38000000);
//		for(int i=0;i<3;i++){
//			c[i]=new Car2();
//		}
		System.out.println("<< �ڵ��� ��� >>");
//		c[0].setCompany("�����ڵ���");
//		c[0].setModel("���׽ý�");
//		c[0].setColor("������");
//		c[0].setMaxSpeed(225);
//		c[0].setPrice(50000000);
//		c[1].setCompany("����ڵ���");
//		c[1].setModel("K7");
//		c[1].setColor("���");
//		c[1].setMaxSpeed(246);
//		c[1].setPrice(40000000);
//		c[2].setCompany("�Ｚ�ڵ���");
//		c[2].setModel("SM7");
//		c[2].setColor("ȸ��");
//		c[2].setMaxSpeed(200);
//		c[2].setPrice(38000000);
		for(Car2 k : c){
			System.out.println(k)
		}
	}
}
