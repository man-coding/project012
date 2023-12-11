package collection;

import java.util.ArrayList;

public class quiz05 {

	public static void main(String[] args) {

		MemberArrayList memberList = new MemberArrayList();

		// 객체를 생성해준다
		Member1 member1 = new Member1(1001, "둘리");
		Member1 member2 = new Member1(1002, "또치");
		Member1 member3 = new Member1(1003, "도우너");
		Member1 member4 = new Member1(1004, "고길동");

		// 회원 4명 추가(위에서 만든 객체를 리스트에 넣어준다)
		memberList.addMember(member1);
		memberList.addMember(member2);
		memberList.addMember(member3);
		memberList.addMember(member4);
		memberList.showAllMember();

		System.out.println();
		// 아이디로 4번째 회원 삭제
		memberList.removeMember(1004);
		memberList.showAllMember();

	}

}

class Member1 {
	int memberId;
	String name;

	public Member1(int memberId, String name) {
		super();
		this.memberId = memberId;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member1 [memberId=" + memberId + ", name=" + name + "]";
	}

}

class MemberArrayList {

	// 회원 목록
	ArrayList<Member1> list; // 리스트 선언

	public MemberArrayList() {

		list = new ArrayList<Member1>(); // 리스트 생성
	}

	// 리스트에 회원을 추가하는 메소드
	public void addMember(Member1 member) {
		list.add(member);
	}

	// 아이디로 회원을 삭제하는 메소드
	public boolean removeMember(int memberId) { // 인자로 회원아이디를 받음
		// list.remove() 를 쓰고 싶어도 meberId를 인자로 쓸 수 없어서 밑에 과정이 필요함.(리무브는 인덱스를 넣어야 함)
		// 리스트를 순회하면서 특정회원아이디를 가지는 회원 찾기
		// 해당 회원의 아이디가 인자가 같은지 비교
		// 같으면 삭제
		for (int i = 0; i < list.size(); i++) {
			Member1 member = list.get(i); // 객체를 꺼낸 다음
			int Id = member.memberId; // 또 그 객체에서 아이디만 다시 꺼낸다

			if (Id == memberId) { // 해당 회원의 아이디가 인자가 같은지 비교
				list.remove(i); // 같으면 삭제
				return true;
			}
		}

		return false;

	}

	// 전체 회원을 출력하는 메소드
	public void showAllMember() {
		for (Member1 member : list) {
			System.out.println(member);
		}

	}

}
