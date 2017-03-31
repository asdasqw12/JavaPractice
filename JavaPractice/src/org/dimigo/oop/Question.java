package org.dimigo.oop;

import java.util.Scanner;

public class Question {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] que={"가장 좋아하는 노래는 ?","가장 좋아하는 과목은?","소속 일반 동아리는 ?"};
		String[] ans={"Spectre","프로그래밍","Fregic"};
		for(int i=0;i<que.length;i++){
			System.out.println((i+1)+". "+que[i]);
			System.out.println(((sc.nextLine().equals(ans[i])) ? "정답 " : "오답")+"\n");
		}
		for(int i=0;i<ans.length;i++){
			System.out.println(que[i]+" "+ans[i]);
		}
		
		sc.close();
	}
}
