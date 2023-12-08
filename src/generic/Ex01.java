package generic;

class Powder {
	public void doPrinting() {
		System.out.println("Powder 재료로 출력합니다.");
	}

	public String toString() {
		return "자료는 Powder 입니다.";
	}
}

class Plastic {

	public void doPrinting() {
		System.out.println("Plastic 재료로 출력합니다.");
	}

	public String toString() {
		return "자료는 Plastic 입니다.";
	}
}

//파우더를 재료로 사용하는 프린터 만들기
class ThreeDPrinter1 {

	// 재료가 파우더인 경우
	private Powder material; // 재료 변수의 자료형을 Powder로 선언

	public void setMaterial(Powder material) {
		this.material = material;
	}

	public Powder getMaterial() {
		return material;
	}

}

//파우더를 재료로 모형을 출력하는 프린터 정의하기
class ThreeDPrinter2 {

	// 재료가 플라스틱인 경우
	private Plastic material; // 재료 변수의 자료형을 Plastic로 선언

	public void setMaterial(Plastic material) {
		this.material = material;
	}

	public Plastic getMaterial() {
		return material;
	}

}