package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ HelloWorld
 *
 * 1. ���� :
 * 2. �ۼ��� : 3/6
 * </pre>
 *
 * @author      : �ȹ���
 * @version     : 1.0
 */
public class Operator {
	public static void main(String[] args){
		long a=3L, c=1500L;
		long b=1700000L;
		System.out.println("<<��̺��� ���� �ΰǺ�>>");
		System.out.printf("�� ��� �޿� : " + String.format("%,d",b) + "��\n" );
		System.out.printf("���� �� ������ : %d��\n",a);
		System.out.printf("���� �� : " + String.format("%,d", c) + "��\n\n");
		System.out.printf("���� �ΰǺ� : " + String.format("%,d", b * a * c * 12));
	}

}