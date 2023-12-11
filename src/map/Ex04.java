package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex04 {

	public static void main(String[] args) {

		MemberHashMap memberHashMap = new MemberHashMap();

		Member member1 = new Member(1001, "둘리");
		Member member2 = new Member(1002, "또치");
		Member member3 = new Member(1003, "도우너");
		Member member4 = new Member(1004, "길동");
		memberHashMap.addMember(member1);
		memberHashMap.addMember(member2);
		memberHashMap.addMember(member3);
		memberHashMap.addMember(member4);

		memberHashMap.showAllMember();
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();

	}

}

class MemberHashMap {

	HashMap<Integer, Member> map; // map선언

	public MemberHashMap() {
		map = new HashMap<>(); // map 생성
	}

	// 맵에 회원을 추가하는 메소드
	public void addMember(Member member) {
		map.put(member.memberId, member);
	}

	// 아이디로 회원을 삭제하는 메소드
	public boolean removeMember(int memberId) {
		Set<Integer> keySet = map.keySet();
		for (int key : keySet) {
			if (key == memberId) {
				map.remove(key);
				System.out.println(memberId + "번 회원을 삭제하였습니다.");
				return true;
			}
//			if (map.containsKey('memberId')) {
//			System.out.println(memberId + "번 회원을 삭제하였습니다.");
//		} else {
//			System.out.println(memberId + "번 회원이 존재하지 않습니다.");
//		}

		}
		System.out.println(memberId + "번 회원이 존재하지 않습니다.");
		return false;
	}

	public void showAllMember() {

		Set<Integer> set = map.keySet();

		Iterator<Integer> keys = map.keySet().iterator();

		while (keys.hasNext()) {
			int key = keys.next();
			Member member = map.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}
