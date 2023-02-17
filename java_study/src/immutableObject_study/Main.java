package immutableObject_study;

public class Main {

	public static void main(String[] args) {

		String abc = "";
		StringBuilder sb = new StringBuilder();
		StringBuffer sb1;

		System.out.println("-----------------------------<String 객체와 StringBuilder 비교 시작>-----------------------------");
		for (int i = 0; i < 10; i++) {
			sb.append(i);
			abc += i;

			System.out.println("String 객체 : " + abc.hashCode());
			System.out.println("StringBuilder 객체 : " + sb.hashCode());
			System.out.println("String : " + abc);
			System.out.println("StringBuilder : " + sb.toString());
			System.out.println();
		}
		System.out.println("-----------------------------<String 객체와 StringBuilder 비교 끝>-----------------------------");

	}	// main method

}	// Main class
