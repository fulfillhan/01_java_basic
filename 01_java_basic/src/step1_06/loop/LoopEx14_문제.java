package step1_06.loop;
//2023-11-27
//-> 깨달은 점 :  while 문에서는 i++;증감식을 꼭 넣어줘야함. 그렇지 않으면 i=0으로 계속 무한 반복
/*
 * # 최대값 구하기[2단계]
 * 
 * 1. 3회 반복을 하면서 정수를 입력받는다.
 * 2. 입력받은 3개의 숫자 중 가장 큰 값을 출력한다.
 * 
 */

import java.util.Scanner;

public class LoopEx14_문제 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	/* 3회 반복
	 * 정수 입력
	 * 이중에서 가장 큰값은
    */
		int i = 0;
		int max = 0;
		
		while (i < 3) {
			
			System.out.print("정수" + (i+1)+ " 입력 : ");
			int num = scanner.nextInt();
			
			if (max < num ) {
				max = num;
			}
			i++;
		}
		System.out.println("최대값 : "+ max);
		scanner.close();

	}

}

