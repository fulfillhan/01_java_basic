package step1_06.loop;

import java.util.Scanner;

/*
 * # 소수찾기[2단계]
 * 
 * 정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
 * 예)
 * 입력 : 20
 * 2, 3, 5, 7, 11, 13, 17, 19
 * 
 */

public class LoopEx29_정답예시 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int getPrimeNumber = scan.nextInt();
		int count = 0;
		
		// 소수를 찾을 범위 구하기!
		for (int i = 2; i <= getPrimeNumber; i++) {
			
			count = 0; //i의 약수의 개수
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) count++;
			}
			
			if (count == 2) {
				System.out.print(i +" ");
			}
	
		}
		scan.close();
		
	}
	
}
