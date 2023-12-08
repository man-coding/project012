package collection;

import java.util.ArrayList;

public class Ex02 {

	public static void main(String[] args) {

		// 회원리스트 생성
		ArrayList<Member> list = new ArrayList<>();

		Member member1 = new Member(1001, "둘리");
		Member member2 = new Member(1002, "또치");
		Member member3 = new Member(1003, "도우너");

		list.add(member1); // 회원 추가
		list.add(member2);
		list.add(member3);
		list.add(member3); // 리스트는 같은 회원 중복 추가 가능

		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3)); // 오버라이드 된 투스트링 메소드가 호출되어 값을 출력할 수 있음
		System.out.println();
		//for문을 이용해서 전체 회원 정보 출력하기
		for(int i = 0; i<list.size(); i++) {
			Member member = list.get(i);
			System.out.println(member.toString());
		}
		System.out.println();
		for(Member member : list) {
			System.out.println(member.toString()); //toString() 생략 가능
		}
		System.out.println();
		list.remove(0);
		System.out.println("전체 회원수 : " + list.size());
		// 리스트 출력하기
		System.out.println(list);

	}

}

//쇼핑몰 회원
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