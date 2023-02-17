package polymorphism_study;

public class Main {

	public static void main(String[] args) {

		System.out.println("==========예시1(다운캐스팅)==========");
		
		Person p1 = new Dancer();
		p1.name = "홍길동";
		p1.speak();
//		p1.dance();	-> 사용불가.
		
		System.out.println("====================");
		
		Dancer d1 = (Dancer)p1;	// 다운캐스팅
		d1.name = "이순신";
		d1.speak();
		d1.dance();
		
		System.out.println("==========예시2(업캐스팅)==========");
		
		Dancer d2 = new Dancer();
		d2.name = "세종대왕";
		d2.speak();
		d2.dance();
		
		System.out.println("====================");
		
		Person p2 = (Dancer)d2;
		p2.name = "신사임당";
		p2.speak();
//		p2.dance(); -> 사용불가.
		
		
	}	// main method

}	// Main class
