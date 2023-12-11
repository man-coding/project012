package map;

import java.util.HashMap;
import java.util.Set;

public class quiz01 {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();

		map.put("국어", 80);
		map.put("수학", 90);
		map.put("영어", 100);

		// 각 키값으로 출력하기
		int value1 = map.get("국어");
		int value2 = map.get("수학");
		int value3 = map.get("영어");
		System.out.println(value1 + " " + value2 + " " + value3);
		System.out.println();

		// 순회하여 출력하기 람다포문
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println(map.get(key));
		}
		System.out.println(map.size());
	}

}
