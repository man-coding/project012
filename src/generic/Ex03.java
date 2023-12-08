package generic;

public class Ex03 {

	public static void main(String[] args) {
		// 1. 파우더를 사용하는 프린터기 생성
		// 객체를 생성할 때 타입을 파우더로 지정
		ThreeDPrinter<Powder> printer1 = new ThreeDPrinter<>();

		printer1.setMaterial(new Powder());

		
		//재료를 꺼낼 때 Powder가 반환됨
		Powder powder = printer1.getMaterial();

		powder.doPrinting();
		
		//2.플라스틱을 사용하는 프린터기 생성
		ThreeDPrinter<Plastic> printer2 = new ThreeDPrinter<>();
		
		printer2.setMaterial(new Plastic());
		
		Plastic plastic = printer2.getMaterial();
		
		plastic.doPrinting();

	}

}

//제네릭 클래스 만들기
class ThreeDPrinter<T> { // 통상적으로 T나 E를 사용

	private T material; // Object 대신 문자 T 작성

	public void setMaterial(T material) {
		this.material = material;
	}

	public T getMaterial() {
		return material;
	}
}