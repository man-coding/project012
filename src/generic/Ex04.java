package generic;

import java.util.ArrayList;

//제네릭을 사용하는 ArrayList 클래스 사용
public class Ex04 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();  //어레이리스트도 제네릭 클래스이다.
		
		list1.add(10); // int타입의 값만 저장 가능
		
		Integer i = list1.get(0);  //int로 해도 상관없다. 언박싱되기 때문에
		
		System.out.println(i);
		
		
		//불리언을 사용하는 리스트 생성
		ArrayList<Boolean> list2 = new ArrayList<Boolean>();
		
		list2.add(true);
		
		Boolean bool = list2.get(0);
		
		System.out.println(bool);
	}

}
