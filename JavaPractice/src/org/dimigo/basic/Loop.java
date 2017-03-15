package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

public class Loop {
	public static void main(String[] args) {
		int atk=100;
		String[] characters={"마법사","영주","기사","농민"};
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.print("-----------\n"+
							   "<<게임 메뉴>>\n"+
							   "1.공격력 증가\n"+
							   "2.공격력 감소\n"+
							   "3.케릭터 설정\n"+
							   "9.종료\n"+
							   "-----------\n"+
							   "메뉴 입력 => ");
			switch(Integer.parseInt(sc.nextLine())){
			case 1:
				System.out.println("공격력이 증가되었습니다. 현재 공격력 : "+(atk+=10));
				break;
			case 2:
				System.out.println("공격력이 감소되었습니다. 현재 공격력 : "+(atk-=10));
				break;
			case 3:
				System.out.println((characters[r.nextInt(4)])+"(으)로 설정되었습니다.");
				break;
			case 9:
				sc.close()
				return;
			}
		}
	}
}
