package org.dimigo.oop;

public class IdolGroup {
	public static void main(String[] args) {
		String[] gpName={"���","2NE1","�ɽ�����"};	
		String[][] memName={
			{"GD","�¾�","�뼺","ž","�¸�"},
			{"CL","��ٶ��","�ں�","����"},
			{"����","����","����","�ξ�"}
		};
		for(int i=0;i<gpName.length;i++){
			System.out.println("<< "+gpName[i]+" >>");
			for(int j=0;j<memName[i].length;j++){
				System.out.println(memName[i][j]);
			}
			System.out.println();
		}
	}
}
