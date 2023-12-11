package step1_04.input;

import java.util.Scanner;

public class InputEx02_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	
		// 문제1) 숫자 2개를 입력받아서 합 출력
		System.out.println("숫자 2개를 입력하세요");
		System.out.print("숫자1 :" );
		int getNum1 = scan.nextInt();
		System.out.println("숫자2 : ");
		int getNum2 = scan.nextInt();
	
		
		int total = getNum1 + getNum2;
		System.out.println("두 수의 합 : "+ total);
		
		// 문제2) 숫자 1개를 입력받아서 홀수이면 true 출력
		System.out.println("숫자 입력 : ");
		int getNum3 = scan.nextInt();
		//int num = getNum3 %=3;
		System.out.println(getNum3 % 3 ==0);
		
		// 문제3) 성적을 입력받아 60점 이상이고 100점 이하이면 true 출력
		System.out.println("성적 입력 : ");
	    int getScore = scan.nextInt();
	    
		scan.close();
		
	}
	
}
