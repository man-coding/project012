package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03 {

	public static void main(String[] args) {
		// HashSet 생성
		HashSet<String> hashSet = new HashSet<>();

		hashSet.add("둘리");
		hashSet.add("또치");
		hashSet.add("도우너");
		hashSet.add("도우너");

		System.out.println("set 목록: " + hashSet);
		System.out.println("크기: " + hashSet.size());

		hashSet.remove("도우너"); // 인덱스가 없기 때문에 값을 넣어줘야 함.
		System.out.println("set 목록: " + hashSet);

		System.out.println();
		
		//Iterator 클래스 불러오기
		Iterator<String> ir = hashSet.iterator();
		while (ir.hasNext()) { //다음 요소가 있으면
			String member = ir.next(); //그 요소를 가져옴

			System.out.println(member + " ");
		}
		System.out.println();
		
		for(String member : hashSet) { //람다식 포문이 편하긴 함.
			System.out.println(member + " ");
		}
	}

}
