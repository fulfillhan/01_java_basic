package step1_04.input;

import java.util.Scanner;

/*
 * 
 * # 콘솔에 키보드로 데이터 입력받기
 * 
 * [ 순서 중요 ]
 * 
 * 1) import java.util.Scanner;  				// Scanner클래스를 불러온다.
 * 2) Scanner scan = new Scanner(System.in);    // scan 객체를 생성한다.
 * 3) System.out.println("#나이 입력: ");       // 안내문을 작성한다.
 * 4) scan.nextInt();                           // 키보드로 입력받는다.
 * 5) scan.close();								// scan을 다 사용한 코드 뒤에 작성한다.
 * 
 * */

public class InputEx01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);//코드의 시작부분에서 작성한다.
		
		System.out.print("상품 가격을 입력하세요 : ");//ln커서를 밑에다가 둔다
		
		int getProductPrice = scan.nextInt(); //메소드를 사용하여 숫자를 입력받는다.(숫자만!!)
		
		System.out.println("입력하신 상품가격은 : "+ getProductPrice + "원 입니다.");
		System.out.println("부과세는 "+ (getProductPrice * 0.1)+ "원 입니다.");
		System.out.println("총 결제금액은 "+ (getProductPrice + (getProductPrice *0.1))+ "원 입니다.");
		System.out.println();
		System.out.print("월급을 입력하세요 : ");
		int getSalary = scan.nextInt();
		
		System.out.println("입력하신 월급은 : "+ getSalary + "원 입니다.");
		System.out.println("원천 징수 금액은 : "+ getSalary * 0.033 + "원 입니다.");
		System.out.println("월급의 실수령액은 : "+ (getSalary - getSalary * 0.033) + "원 입니다.");
		
		
		
		scan.close();// 코드의 제일 마지막에 작성한다. 반납의 의미
		

	}

}
