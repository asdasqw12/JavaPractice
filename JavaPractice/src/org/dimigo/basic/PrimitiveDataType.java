package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ PrimitiveDataType
 * 
 * 1. ���� : ������ ������ ����ϱ�
 * 2. �ۼ��� : 2017. 3. 9.
 * </pre>
 * 
 * @author ������
 * @version : 1.0
 */
public class PrimitiveDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int age = 25;
		String name = "������";
		boolean isMale = true;
		double height = 161.8;
		float weight = 44.3f;
		char bloodtype = 'A';
		System.out.println("<< ������ ������ >>");
		System.out.println("�̸� : " +name);
		System.out.println(isMale ? "���� : ����" : "���� : ����");
		System.out.println("���� : " +age +"��");
		System.out.println("Ű : "+height +"cm");
		System.out.println("������ : " +weight +"kg");
		System.out.println("������ : "+bloodtype + "��");

	}

}