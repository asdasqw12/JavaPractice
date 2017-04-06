package org.dimigo.oop;

public class SnackTest {
	public static void main(String[] args) {
		Snack[] snacks={
				new Snack("�����","���",1100,2),
				new Snack("��Ĩ","ũ���",1200,1),
				new Snack("��Ϲ���Ĩ","����",1500,4),
		};
		for(Snack snack: snacks){
			System.out.println(snack);
		}
		System.out.println("�� ���� �ݾ� : " + String.format("%,d", Snack.calcPrice())+"��");
	}
}
