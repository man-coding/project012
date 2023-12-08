package collection;

import java.util.ArrayList;

public class quiz05 {

	public static void main(String[] args) {

		MemberArrayList memberList = new MemberArrayList();
	}

}

class Member1 {
	String memberId;
	String name;

	public Member1(String memberId, String name) {
		super();
		this.memberId = memberId;
		this.name = name;
	}

}

class MemberArrayList {

	ArrayList<Member> list;

	

	public MemberArrayList(ArrayList<Member> list) {
		super();
		this.list = list;
	}

	public void addMember(Member member) {
		list.add(member);
	}

	public boolean removeMember(int memberId) {
		list.remove(memberId);
		return true;
	}

	@Override
	public String toString() {
		return "MemberArrayList [list=" + list + "]";
	}

}
