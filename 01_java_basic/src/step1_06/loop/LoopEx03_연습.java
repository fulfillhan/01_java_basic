package step1_06.loop;

//문제1) 1~10까지 반복해 3미만 7이상만 출력
		// 정답1) 1 2 7 8 9 10

//문제2) 문제1의 조건에 맞는 수들의 합 출력
		// 정답2) 37

//문제3) 문제1의 조건에 맞는 수들의 개수 출력
		// 정답3) 6

//문제4) 1~5까지의 합 출력mmmm
		// 정답4) 15

public class LoopEx03_연습 {
	
	 public static void main(String[] args) {
		
		 
		 for (int i =1 ; i < 11; i++) {
			if (i < 3 && i >=7) {
				System.out.println(i);
			}
			
		}
		 
		 
	}

}
