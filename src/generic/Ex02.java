package generic;

public class Ex02 {

	public static void main(String[] args) {

		ThreeDPrinter3 printer = new ThreeDPrinter3();
		
		Powder p1 = new Powder(); // Powder를 재료로 선택
		
		Object material = new Powder(); //부모타입 변수 = 자식 인스턴스
		printer.setMaterial(p1);
		
		
		Powder p2 = (Powder) printer.getMaterial(); //instanceof 안 쓰면 잘못된 건 아니지만 불안정함
		p2.doPrinting();
	}

}
//파우더와 플라스틱을 재료로 사용하는 프린터 만들기
class ThreeDPrinter3 {

	
	private Object material; // 재료 변수의 자료형을 Object로 선언

	public void setMaterial(Object material) {//자료형을 Object로 선언하면 파우더와 플라스틱을 모두 저장할 수 있음.
		this.material = material;
	}

	public Object getMaterial() { //Object형 리턴타입
		return material;
	}

}
