package org.dimigo.oop;

public class PiggyBankTest {
	public static void main(String[] args) {
		FamilyMember[] famArr={
				new FamilyMember("�ƺ�"),
				new FamilyMember("����"),
				new FamilyMember("��"),
				new FamilyMember("������"),
		};
		int k=10;
		FamilyMember.printMemberCnt();
		for(FamilyMember temp :famArr){
			PiggyBank.putMoney(temp,k*1000);
			k/=2;
		}
		PiggyBank.printBalance();
		PiggyBank.putMoney(famArr[2], 1000);
		PiggyBank.printBalance();
	}
}
