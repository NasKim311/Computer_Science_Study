package polymorphism_study;

public class Exercise {

	public static void main(String[] args) {

		Buyer b = new Buyer();
		b.buy(new TvProduct());
		
		System.out.println("현재 남은 돈 : " + b.money);		// 900
		System.out.println("현재 적립금 : " + b.bonusPoint);	// 10
		System.out.println();
		
		b.buy(new ComputerProduct());
		System.out.println("현재 남은 돈 : " + b.money);		// 700
		System.out.println("현재 적립금 : " + b.bonusPoint);	// 30
		
//		System.out.println("------------------ 정답 --------------------");
//		System.out.println("현재 남은 돈 : 900 ");
//		System.out.println("현재 적립금 : 10 ");
//		System.out.println("TvProduct을/를 구매하였습니다.");
//		System.out.println("현재 남은 돈 : 700 ");
//		System.out.println("현재 적립금 : 30 ");
//		System.out.println("ComputerProduct을/를 구매하였습니다.");

	} // main method

} // Exercise class

//---------------------------------------<class>---------------------------

class Product {
	int price; // 제품의 가격
	int bonusPoint; // 제품 당 적립금

	public Product(int price) {
		this.price = price;
		this.bonusPoint = price / 10;
	}

} // Product class

class TvProduct extends Product {
	public TvProduct() {
		super(100);
	}

	
	@Override
	public String toString() {
		return "TvProduct";
	}

} // TvProduct class

class ComputerProduct extends Product {
	public ComputerProduct() {
		super(200);
	}

	@Override
	public String toString() {
		return "ComputerProduct";
	}

} // ComputerProduct class

class Buyer { 	// 고객, 물건을 사는 사람
	
	int money = 1000; 		// 보유 금액
	int bonusPoint = 0; 	// 적립 금액
	
	// Tv를 구매하기 위한 buy() 메소드
	void buy(TvProduct tv) {
		if (money < tv.price) {
			System.out.println("보유 금액이 부족합니다.");
			return;
		}
		money -= tv.price;
		bonusPoint += tv.bonusPoint;
		System.out.println(tv + "을/를 구매하였습니다.");
	
	}	// buy method

	// Computer를 구매하기 위한 buy() 메소드
	void buy(ComputerProduct cp) {
		if (money < cp.price) {
			System.out.println("보유 금액이 부족합니다.");
			return;
		}
		money -= cp.price;
		bonusPoint += cp.bonusPoint;
		System.out.println(cp + "을/를 구매하였습니다.");
		
	}	// buy method
	
}	// Buyer class
