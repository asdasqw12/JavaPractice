package collection;

import java.util.ArrayList;
import java.util.List;

public class MelonChart {
	public static void main(String[] args) {
		List<Music> list = new ArrayList<Music>();
		list.add(new Music("I LUV IT","PSY"));
		list.add(new Music("맞지?","언니쓰"));
		System.out.println("--<< 멜론 차트 >>--");
		print(list);
		list.add(1, new Music("SIGNAL","트와이스"));
		System.out.println("--<< 2위 곡 추가 >>--");
		print(list);
		list.set(2, new Music("팔레트","아이유"));
		System.out.println("--<< 3위 곡 변경 >>--");
		print(list);
		list.remove(1);
		System.out.println("--<< 2위 곡 삭제 >>--");
		print(list);
		list.removeAll(list);
		System.out.println("--<< 전체 리스트 삭제 >>--");
		print(list);
	}
	private static void print(List<Music> list){
		for(int i=0,n=list.size();i<n;i++){
			System.out.println((i+1) + ". " + list.get(i).toString());
		}
		System.out.println();
	}
}
