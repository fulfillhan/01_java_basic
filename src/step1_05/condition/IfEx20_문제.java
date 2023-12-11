package step1_05.condition;
//2023-12-02
// scanner import 할 시, scanner.close() 꼭 닫아주는거 잊지말기!!

import java.util.Random;
import java.util.Scanner;

/*
 * # 가운데 숫자 맞추기 게임
 * 
 * 1. 150~250 사이의 랜덤 숫자 저장
 * 2. 랜덤 숫자의 가운데 숫자를 맞추는 게임이다.
 * 예)
 * 		249	: 4
 * 	    123 : 2
 * 		771 : 7
 */

public class IfEx20_문제 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner scanner = new Scanner(System.in);
		//랜덤 숫자 저장
		System.out.print("랜덤 숫자 : ");
		int rNum = r.nextInt(101)+150;  //150-250 : 100
		System.out.println(rNum);
		
		System.out.print("가운데 숫자 입력 : ");
		int myNum = scanner.nextInt();
		
		int number10 = (rNum % 100) / 10;
		
		if ( number10 == myNum) {
			System.out.println("정답!");
		}else {
			System.out.println("땡!");
		}
		scanner.close();
	}

}
