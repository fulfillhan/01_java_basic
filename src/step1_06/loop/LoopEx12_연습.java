package step1_06.loop;
//2023-11-26
/*
 * # 369게임[2단계]
 * 
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 * 
 */

public class LoopEx12_연습 {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 50 ; i++) {//반복 횟수 1~50
			//for 반복문 사용
			int location10 = i / 10 ;
			int location1 = i % 10;
			int cnt = 0;
			//박수를 치는 조건정하기
			if (location10 % 3 == 0 && location10 != 0 ) {//3의 배수이거나, 0이 아니거나
				cnt++;
			}
			if (location1 % 3 == 0 && location1 != 0) {
				cnt++;
			}
			// 출력하기
			if (cnt == 2) {
				System.out.print("짝짝 ");
			}else if (cnt == 1) {
				System.out.print("짝 ");
			}else {
				System.out.print(i + " ");
			}
		
		}
	}

}
