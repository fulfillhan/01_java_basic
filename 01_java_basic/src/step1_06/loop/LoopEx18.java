package step1_06.loop;

/*
 * # do while문
 * 
 * [ 형식 ]
 * 
 * do {// 한번은 무조건 통과
 * 	   반복할 명령어;
 * } while ( 조건식 );
 * 
 * 
 * 1. while문과 do~while문의 차이점은 반복 조건의 '검사시점'이다.
 * 		( while    : 반복 조건식을 먼저 검사 )
 * 		( do~while : 일단 한번 실행한 후 반복조건을 검사 )
 * 
 * 2. while문 조건식 뒤에 ;을 잊지 않고 반드시 써주어야 한다.
 *  
 * */

public class LoopEx18 {

	public static void main(String[] args) {

		int num = 0;
		
		while (num > 0 && num < 4) {
			System.out.println("명령어");
			num++;//1~3사이이면 명령어 출력 반복하면서 증가하며 반복
		}
		System.out.println("=== do while ===");
		
		
		do {//일단 한번 한다.
			System.out.println("명령어");
			num++;
		} 
		while (num > 0 && num < 4);
			
			
		
	}

}
