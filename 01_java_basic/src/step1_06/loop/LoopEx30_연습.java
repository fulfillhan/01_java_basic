package step1_06.loop;

//2023-12-18

/*
 * # 2차원 반복문
 * 
 * 1 2 3 4 5
 * 10 9 8 7 6
 * 11 12 13 14 15
 * 20 19 18 17 16
 * 21 22 23 24 25
 * 
 * 
 * 1) 오른쪽방향으로 순서대로 출력
 * 2) 왼쪽방향대로 순서대로 출력
 * 
 * 1)2) 5번 반복
 * 
 */


public class LoopEx30_연습 {
	
	public static void main(String[] args) {
		
		int start = 1;
		int end = 5;
		
		// 총 5번 반복
		for (int i = 0; i < 5; i++) {
			
			if(i % 2 == 0) {//반복되는 변수 i(인덱스)행의 값이 짝수이면
				for (int j = start; j <= end ; j++) {//1,2,3,4,5
					System.out.println(j + " ");
				}
			}
			else {// i의 값이 홀수이면(행) 왼쪽방향대로 출력
				for (int j = end; j <= start ; j--) {
					System.out.println(j + " ");
				}
			}
			end = end + 5;
			start = end + 1;
		}
		
	}

}
