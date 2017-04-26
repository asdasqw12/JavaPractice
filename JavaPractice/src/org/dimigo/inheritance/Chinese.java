package org.dimigo.inheritance;

public class Chinese extends Person{
	@Override
	public String toString() {
		return "저는 중국사람 "+getName()+"입니다.";
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("니하오");
	}

	@Override
	public void sayBye() {
		// TODO Auto-generated method stub
		System.out.println("짜이찌엔");
	}

	public Chinese(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
}
