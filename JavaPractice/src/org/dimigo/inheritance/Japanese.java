package org.dimigo.inheritance;

public class Japanese extends Person{

	@Override
	public String toString() {
		return "���� �Ϻ����"+getName()+"�Դϴ�.";
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("�����̿�");
	}

	@Override
	public void sayBye() {
		// TODO Auto-generated method stub
		System.out.println("��䳪��");
	}

	public Japanese(String name) {
		super(name);
	}
	
}
