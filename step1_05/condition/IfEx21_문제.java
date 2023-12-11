package step1_05.condition;

import java.util.Random;

/*
 * # 369게임[1단계]
 * 
 * 1. 1~50 사이의 랜덤 숫자를 저장한다.
 * 2. 위 수에 369의 개수가
 * 	1) 2개이면, 짝짝을 출력
 *  2) 1개이면, 짝을 출력
 *  3) 0개이면, 해당 숫자를 출력
 * 예)
 * 		33	 : 짝짝
 * 		16	 : 짝
 * 		 7	 : 7
 */
//3, 6,9,13,16,19,23,26,29,33,
public class IfEx21_문제 {

	public static void main(String[] args) {
		 Random ran =  new Random();
		 
		 int ranNum = ran.nextInt(50)+1;
		 System.out.println("문제 = "+ ranNum);
		 
		 int location2 = ranNum /10;
		 int location1 = ranNum % 10;
		 
		 int count369 = 0;//3,6,9 의 갯수
		 
		 if (location2 ==3 || location2 ==6 || location2 ==9) {
			count369 =  count369+1;
		}
		 if (location1 ==3 || location1 ==6 || location1 ==9) {
			count369++;
		}
		 
		 if (count369 ==2) {
			System.out.println("짝짝");
		}
		 if (count369 ==1) {
			System.out.println("짝");
		}
		 if (count369 ==0) {
			System.out.println(ranNum);
		}
		
		
	}

}
