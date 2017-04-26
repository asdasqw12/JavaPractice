package org.dimigo.inheritance;

public class Korean extends Person{

	
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("안녕하세요");
	}

	@Override
	public void sayBye() {
		// TODO Auto-generated method stub
		System.out.println("안녕히 계세요");
	}

	@Override
	public String toString() {
		return "저는 한국사람 "+getName()+"입니다.";
	}

	public Korean(String name) {
		super(name);
	}
	
}
