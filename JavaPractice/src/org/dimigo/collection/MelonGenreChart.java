package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MelonGenreChart {
	public static void main(String[] args) {
		Map<String, List<Music>> map=new HashMap<>();
		map.put("�߶��", new ArrayList<Music>());
		map.put("��",new ArrayList<Music>());
		map.get("�߶��").add(new Music("�ȷ�Ʈ","������"));
		map.get("��").add(new Music("I LUV IT","PSY"));
		map.get("��").add(new Music("����?","��Ͼ�"));
		System.out.println("--<< ��� �帣�� ��Ʈ >>--");
		print(map);
		System.out.println("--<< �� 2�� �� ���� >>--");
		map.get("��").set(1, new Music("SIGNAL","Ʈ���̽�"));
		print(map);
		System.out.println("--<< �� 1�� �� ���� >>--");
		map.get("��").remove(1);
		print(map);
		System.out.println("--<< ��ü ����Ʈ ���� >>--");
		map.clear();
		print(map);
	}
	private static void print(Map<String,List<Music>> map){
		Set<String> set= map.keySet();
		for(String j : set){
			System.out.println("[" + j+"]");
			for(int i=0,n=map.get(j).size();i<n;i++){
				System.out.println(i+1+". "+map.get(j).get(i));
			}
		}
	}
}
