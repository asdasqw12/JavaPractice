package org.dimigo.oop;

import java.util.Scanner;

public class Question {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] que={"���� �����ϴ� �뷡�� ?","���� �����ϴ� ������?","�Ҽ� �Ϲ� ���Ƹ��� ?"};
		String[] ans={"Spectre","���α׷���","Fregic"};
		for(int i=0;i<que.length;i++){
			System.out.println((i+1)+". "+que[i]);
			System.out.println(((sc.nextLine().equals(ans[i])) ? "���� " : "����")+"\n");
		}
		for(int i=0;i<ans.length;i++){
			System.out.println(que[i]+" "+ans[i]);
		}
		
		sc.close();
	}
}
