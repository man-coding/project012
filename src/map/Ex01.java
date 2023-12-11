package map;

import java.util.Collection;
import java.util.HashMap;

public class Ex01 {

	public static void main(String[] args) {

		// int형 키, String value를 저장하는 맵 생성(제네릭형임)
		HashMap<Integer, String> map = new HashMap<>();

		// 데이터 추가
		map.put(1, "사과"); // key, value 쌍으로 값 추가
		map.put(2, "바나나");
		map.put(3, "코코넛");

		System.out.println("hashmap : " + map);

		// 데이터 찾기
		System.out.println("key: 1, value: " + map.get(1)); // 키값은 인덱스와 다르게 문자나 문자열이 될 수도 있다.
		System.out.println("key: 2, value: " + map.get(2));
		System.out.println("key: 3, value: " + map.get(3));

		// 데이터 수정하기
		map.replace(2, "블루베리");
		System.out.println("hashmap : " + map);

		// 데이터 삭제하기
		map.remove(1);
		System.out.println("hashmap : " + map);

		// map 크기 구하기
		int size = map.size();
		System.out.println("map의 크기: " + size);

		// 키 목록 조회
		Collection<Integer> keys = map.keySet();
		System.out.println("키 목록: " + keys);

		// 값 목록 조회
		Collection<String> values = map.values();
		System.out.println("값 목록: " + values);
	}

}
