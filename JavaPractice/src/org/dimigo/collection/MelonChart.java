package collection;

import java.util.ArrayList;
import java.util.List;

public class MelonChart {
	public static void main(String[] args) {
		List<Music> list = new ArrayList<Music>();
		list.add(new Music("I LUV IT","PSY"));
		list.add(new Music("����?","��Ͼ�"));
		System.out.println("--<< ��� ��Ʈ >>--");
		print(list);
		list.add(1, new Music("SIGNAL","Ʈ���̽�"));
		System.out.println("--<< 2�� �� �߰� >>--");
		print(list);
		list.set(2, new Music("�ȷ�Ʈ","������"));
		System.out.println("--<< 3�� �� ���� >>--");
		print(list);
		list.remove(1);
		System.out.println("--<< 2�� �� ���� >>--");
		print(list);
		list.removeAll(list);
		System.out.println("--<< ��ü ����Ʈ ���� >>--");
		print(list);
	}
	private static void print(List<Music> list){
		for(int i=0,n=list.size();i<n;i++){
			System.out.println((i+1) + ". " + list.get(i).toString());
		}
		System.out.println();
	}
}
