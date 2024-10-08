package step1_06.loop;


/*
 * # 369게임[2단계]
 * 
 * 1. 1~50까지 반복을 한다.
 * 2. 그 안에서 해당 숫자의 369게임의 결과를 출력한다.
 * 예) 1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 ...
 * 
 */

public class LoopEx12_정답예시 {

	public static void main(String[] args) {
		//while 반복문 사용
		int i = 1;
		
		while (i <= 50) {
			
			int location10 = i / 10;
			int location1 = i % 10;
			
			int count369 = 0;
			
			if (location10 != 0 && location10 % 3 == 0) count369++;
			if (location1 != 0  && location1 % 3 == 0)  count369++;
			
			
			if		(count369 == 2) System.out.print("짝짝 ");
			else if (count369 == 1) System.out.print("짝 ");
			else 					   System.out.print(i+ " ");
			
			i++;
			
		}

	}

}
