package map;

import java.util.HashMap;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {

		// 회원목록을 저장하는 map 생성
		HashMap<Integer, Member> map = new HashMap<>();
		// 회원 추가
		Member member1 = new Member(1001, "둘리");
		Member member2 = new Member(1002, "또치");
		Member member3 = new Member(1003, "도우너");

		map.put(1001, new Member(1001, "둘리")); // 방법 두 가지.
		map.put(member2.memberId, member2);
		map.put(member3.memberId, member3);

		// 회원 조회
		System.out.println(map.get(1001));
		System.out.println(map.get(1002));
		System.out.println(map.get(1003));

		// 1번째 회원 삭제
		map.remove(1001); // map.remove() 에는 인자로 키값을 받는다(인덱스가 없기 때문에)

		// 전체 회원 수 출력
		System.out.println("전체 회원 수: " + map.size());

		// 전체 회원 목록 출력
		System.out.println(map);

		// 회원 목록 순회하기
		Set<Integer> keySet = map.keySet();

		for (int key : keySet) { //iterator, 람다식포문 둘 다 되지만 key 목록을 알아야 하는 것이 공통점
			System.out.println("[key]: " + key + "[Value]: " + map.get(key));
		}

	}

}

class Member {

	int memberId; // 회원아이디
	String memberName; // 회원이름

	public Member(int memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
	}

}
