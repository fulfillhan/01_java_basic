package step1_05.condition;

import java.util.Scanner;

//2023-11-27 
//느낀점 : 60점 이상, 미만 과 같은 범위의 조건을 구할 때 조건의 true의 사황을 잘 따져봐야한다.

/*
 * # 성적 유효성 검사
 * 
 * 1. 성적을 입력받는다.
 * 2. 성적이 60점 이상이면 합격, 60점 미만이면 불합격이다.
 * 3. 단, 입력받은 성적이
 *    음수이거나 100점을 초과하면, 예외 메세지를 출력한다.
 *    예) 성적을 잘못 입력했습니다.
 */


public class IfEx07_연습 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("성적 입력 : ");
		int myScore = scanner.nextInt();
		
		if (myScore >= 60 && myScore <= 100) {
			System.out.println("합격!");
		}
		else if (myScore < 60 && myScore >= 0) {
			System.out.println("불합격");
		}
		
		if (myScore < 0 || myScore > 100) {
			System.out.println("성적을 잘못 입력하셨습니다.");
		}
		scanner.close();
	}

}
