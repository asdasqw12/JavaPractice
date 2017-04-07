package org.dimigo.oop;

public class IdolGroup {
	public static void main(String[] args) {
		String[] gpName={"빅뱅","2NE1","걸스데이"};	
		String[][] memName={
			{"GD","태양","대성","탑","승리"},
			{"CL","산다라박","박봄","민지"},
			{"유라","혜리","소진","민아"}
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
