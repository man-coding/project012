package collection;

import java.util.ArrayList;

public class quiz01 {

	public static void main(String[] args) {

		ArrayList<Character> list = new ArrayList<>();

		Character character1 = new Character('A');
		Character character2 = 'A'; //오토박싱   안 해도 상관은 없음.
		
		list.add(character2);
		list.add('B');
		list.add('C');

		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
//			list.get(i);
			System.out.println(list.get(i));
		}
		System.out.println();

		for (char ch : list) {
			System.out.println(ch);
		}
		System.out.println();
		list.remove(1);
		System.out.println(list.size());
	}

}
