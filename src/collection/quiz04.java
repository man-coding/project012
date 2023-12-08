package collection;

import java.util.HashSet;
import java.util.Iterator;

public class quiz04 {

	public static void main(String[] args) {

		HashSet<Integer> hashSet = new HashSet<>();

		hashSet.add(1);
		hashSet.add(3);
		hashSet.add(7);
		System.out.println(hashSet.size());

		Iterator<Integer> ir = hashSet.iterator();
		while (ir.hasNext()) {
			Integer i = ir.next();
			System.out.println(i);
		}
		System.out.println();

		for (int i : hashSet) {
			System.out.println(i);
		}
	}

}
