package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		int atk=100;
		String[] characters={"������","����","���","���"};
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.print("-----------\n"+
							   "<<���� �޴�>>\n"+
							   "1.���ݷ� ����\n"+
							   "2.���ݷ� ����\n"+
							   "3.�ɸ��� ����\n"+
							   "9.����\n"+
							   "-----------\n"+
							   "�޴� �Է� => ");
			switch(Integer.parseInt(sc.nextLine())){
			case 1:
				System.out.println("���ݷ��� �����Ǿ����ϴ�. ���� ���ݷ� : "+(atk+=10));
				break;
			case 2:
				System.out.println("���ݷ��� ���ҵǾ����ϴ�. ���� ���ݷ� : "+(atk-=10));
				break;
			case 3:
				System.out.println((characters[r.nextInt(4)])+"(��)�� �����Ǿ����ϴ�.");
				break;
			case 9:
				sc.close();
				return
			}
		}
	}
}
