package map;

import java.util.HashMap;
import java.util.Set;

public class quiz04 {

	public static void main(String[] args) {

		HashMap<Integer, Student> map = new HashMap<>();

		Student student1 = new Student(1001, "둘리", 90, 80, 70);
		Student student2 = new Student(1002, "도우너", 55, 65, 75);
		Student student3 = new Student(1003, "또치", 80, 50, 50);

		map.put(student1.studentId, student1);
		map.put(student2.studentId, student2);
		map.put(student3.studentId, student3);

		Set<Integer> keySet = map.keySet();

		// 학생별 통계
		for (Integer key : keySet) {
			Student student = map.get(key); // 변수를 꼭 저장해줘야 쓸 수 있다.(필요값을 꺼낼 수 있다.)
			float studentTotal = (student.koreanScore + student.mathScore + student.engScore);
			float studentAverage = (studentTotal) / 3;
			// 학생의 통계변수는 for문 안에 선언해야함(한꺼번에 더하고 다음 학생으로 순회해야 하기 때문.)
			System.out.println(studentTotal + " " + studentAverage);
		}
		System.out.println();

		// 과목별 통계
		float korTotal = 0; // 과목별 통계변수는 for문 밖에서 선언해야 함.(순회하면서 더해야 하기 때문에)
		float mathTotal = 0;
		float engTotal = 0;
		float korAverage = 0;
		float mathAverage = 0;
		float engAverage = 0;
		for (Integer key : keySet) {
			Student student = map.get(key);
			korTotal += student.koreanScore;
			korAverage += student.koreanScore / 3;
			mathTotal += student.mathScore;
			mathAverage += student.mathScore / 3;
			engTotal += student.engScore;
			engAverage += student.engScore / 3;

		}
		System.out.println(korTotal + " " + korAverage);
		System.out.println(mathTotal + " " + mathAverage);
		System.out.println(engTotal + " " + engAverage);
	}

}

class Student {
	int studentId;
	String studentName;
	int koreanScore;
	int mathScore;
	int engScore;

	public Student(int studentId, String studentName, int koreanScore, int mathScore, int engScore) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.koreanScore = koreanScore;
		this.mathScore = mathScore;
		this.engScore = engScore;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", koreanScore=" + koreanScore
				+ ", mathScore=" + mathScore + ", engScore=" + engScore + "]";
	}

}