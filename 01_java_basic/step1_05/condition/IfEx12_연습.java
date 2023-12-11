package step1_05.condition;
//2023-11-29

import java.util.Scanner;

/*
 * # 최대값 구하기[1단계]
 * 
 * 1. 숫자 3개를 입력받는다.
 * 2. 입력받은 3개의 수를 비교하여,
 * 3. 가장 큰 수(MAX)를 출력한다.
 */


public class IfEx12_연습 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			
			System.out.print("정수1 입력 : ");
			int a = scanner.nextInt();
			
			System.out.print("정수2 입력 : ");
			int b = scanner.nextInt();
			
			System.out.print("정수3 입력 : ");
			int c = scanner.nextInt();
			
			int maxNum = a;
			
		    if (maxNum < b) {
				maxNum = b;
			}
		    if (maxNum < c) {
			   maxNum = c;
		   	}
		   System.out.println("최대값 : "+ maxNum);
		   
		}
	}


