package org.dimigo.inheritance;

public class Chinese extends Person{
	@Override
	public String toString() {
		return "���� �߱���� "+getName()+"�Դϴ�.";
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("���Ͽ�");
	}

	@Override
	public void sayBye() {
		// TODO Auto-generated method stub
		System.out.println("¥���");
	}

	public Chinese(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}
