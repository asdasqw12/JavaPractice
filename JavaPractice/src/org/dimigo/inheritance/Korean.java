package org.dimigo.inheritance;

public class Korean extends Person{

	
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("�ȳ��ϼ���");
	}

	@Override
	public void sayBye() {
		// TODO Auto-generated method stub
		System.out.println("�ȳ��� �輼��");
	}

	@Override
	public String toString() {
		return "���� �ѱ���� "+getName()+"�Դϴ�.";
	}

	public Korean(String name) {
		super(name);
	}
	
}
