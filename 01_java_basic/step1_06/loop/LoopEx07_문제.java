package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # Up & Down 게임[2단계]
 * 
 * 1. 1 ~ 100까지의 난수를 생성한다.
 * 2. 스캐너를 이용해 정답을 맞추기를 시도하고 정답을 맞출경우 게임은 종료된다.
 * 3. 점수는 100점부터 시작해서 오답을 입력할 때마다 5점씩 차감된다.
 * 4. 게임 종료 후, 점수를 출력한다.
 * 
 */

public class LoopEx07_문제 {

	public static void main(String[] args) {
		Random ran =  new Random();
		Scanner scan =  new Scanner(System.in);
		
		int com = ran.nextInt(100)+1 ;
		System.out.println("난수 :"+ com);
		
		int score = 100;
		int wrongAswerCnt = 0;
		boolean isRun = true;
		
		while (isRun) {
			if (wrongAswerCnt == 19) {
				isRun = false;
			}
			
			System.out.println("숫자 입력[1~ 100] : ");
			int me = scan.nextInt();
			
			if (com > me) {
				System.out.println("Up!");
			}
			else if (com < me ) {
				System.out.println("Down!");
			} else {
				System.out.println("빙고!");
				isRun = false;

			}
			
		}
		
	    
		
		scan.close();
	}

}
