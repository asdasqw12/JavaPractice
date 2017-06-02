package org.dimigo.exception;

public class Movie {
	private String title;
	private int limitAge;
	public String getTitle() {
		return title;
	}
	public Movie(String title, int limitAge) {
		super();
		this.title = title;
		this.limitAge = limitAge;
	}
	public int getLimitAge() {
		return limitAge;
	}
	void buyTicket(int age) throws Exception{
		if(age<limitAge)
			throw new Exception(title +"��/�� "+limitAge+"�� �̻� �������Դϴ�.");
		else
			System.out.println(title+" ���ϼ���.");
	}
}
