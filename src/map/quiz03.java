package map;

import java.util.HashMap;
import java.util.Set;

public class quiz03 {

	public static void main(String[] args) {

		HashMap<String, Float> map = new HashMap<>();

		map.put("국어", 80.0f);
		map.put("수학", 90.0f);
		map.put("영어", 100.0f);

		// map 순회하여 출력
		Set<String> keySet = map.keySet();
		for (String key : keySet) {

			System.out.println(key);
		}
		for (String key : keySet) {

			System.out.println(map.get(key));
		}
	}

}
