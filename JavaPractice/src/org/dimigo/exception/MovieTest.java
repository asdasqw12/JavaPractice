package org.dimigo.exception;

public class MovieTest {
	public static void main(String[] args) {
		Movie[] movies={
				new Movie("���ϸ���:Ŀ����Ʈ",15),
				new Movie("������� ���� ������",12),
		};
		int age=13;
		for(Movie m:movies)
			try {
				m.buyTicket(age);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
	}
}
