package step1_05.condition;

import java.util.Random;
import java.util.Scanner;

/*
 * # 가위바위보 게임
 * 
 *   if - else if , else 등 구문을 활용하여 자율적으로 작성해보자.
 *   
 *   0 : 가위 , 1 : 바위 , 2 : 보
 */

public class IfEx18_연습문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int com = 0;	// 랜덤으로 저장
		int me = 0;		// 키보드로 입력받아 저장
		 
		com = ran.nextInt(3);
		System.out.println("랜덤 번호 : " + com);
		
		System.out.println("가위(0) 바위(1) 보(2) 입력 : ");
		me = scan.nextInt()    ;
		
		if (com ==me) {
			System.out.println("비겼다.");
		} 
		else if(com ==0 && me ==1){
			System.out.println("이겼다");
		}
		else if (com ==1 && me ==2) {
			System.out.println("이겼다.");
		}
		else if (com ==2 && me ==0) {
			System.out.println("이겼다.");
		}
		else {
			System.out.println("졌다.");
		}
		scan.close();
		
		
	}

}
