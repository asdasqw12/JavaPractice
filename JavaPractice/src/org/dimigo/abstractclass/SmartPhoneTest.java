/**
 * 
 */
package org.dimigo.abstractclass;

public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone[] a = {
		new IPhone("iPhone 7", "애플", 900000) , new Galaxy("갤럭시 S8", "삼성", 800000)
		};
		for(int i = 0; i < 2; i++){
			func(a[i]);
		}
		
	}
	private static void func(SmartPhone a){
		System.out.println(a);
		a.TurnOn();
		a.pay();
		a.useSpecialFunction();
		a.TurnOff();
	}
}	
