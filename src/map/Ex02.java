package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {

		HashMap<Character, String> map = new HashMap<>();

		map.put('a', "사과");
		map.put('b', "바나나");
		map.put('c', "코코넛");
		System.out.println("hashmap : " + map);

		// 키로 데이터 조회
		String value = map.get('b'); // 키값 b로 값을 조회
		System.out.println("b = " + value);

		// 데이터 수정 **키값, 수정할 밸류
		map.replace('b', "블루베리");
		System.out.println("hashmap : " + map);

		// 데이터 삭제 ***키값을 넣어줘야 함
		map.remove('a');
		System.out.println("hashmap : " + map);

		// map 순회하기

		Set<Character> set = map.keySet(); // keySet()은 함수이다.

		Iterator<Character> keys = map.keySet().iterator();

		while (keys.hasNext()) { // 다음 key가 있으면
			Character key = keys.next(); // key를 꺼내서
			System.out.println("[key]:" + key + " [Value]:" + map.get(key));
		}

		// 특정 키값이 존재하는지 확인하기
		if (map.containsKey('b')) {
			System.out.println("map에 b라는 키가 있습니다.");
		} else {
			System.out.println("map에 b라는 키가 없습니다.");
		}

	}
}
