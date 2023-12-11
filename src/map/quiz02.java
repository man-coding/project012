package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class quiz02 {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();

		map.put("국어", 80);
		map.put("수학", 90);
		map.put("영어", 100);

		map.replace("국어", 50);
		map.replace("수학", 60);
		map.replace("영어", 70);

		map.remove("영어");

		// 람다포문으로 출력
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println(key + " " + map.get(key));
		}
		System.out.println();

		// iterator로 출력
		Iterator<String> keys = map.keySet().iterator();
		while (keys.hasNext()) {
			String key = keys.next();
			System.out.println(key + " " + map.get(key));
		}

	}

}
