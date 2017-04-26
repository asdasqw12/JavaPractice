package org.dimigo.inheritance;

public class Japanese extends Person{

	@Override
	public String toString() {
		return "저는 일본사람"+getName()+"입니다.";
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("오하이요");
	}

	@Override
	public void sayBye() {
		// TODO Auto-generated method stub
		System.out.println("사요나라");
	}

	public Japanese(String name) {
		super(name);
	}
	
}
