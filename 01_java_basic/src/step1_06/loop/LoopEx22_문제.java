package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # Up & Down 게임[2단계]
 * 
 * 1. 정답을 맞추면 게임은 종료된다.
 * 2. 100점부터 시작해 오답을 입력할 때마다 5점씩 차감된다.
 * 3. 게임 종료 후, 점수를 출력한다.
 * 
 */

public class LoopEx22_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random  ran = new Random();
		
		int com = ran.nextInt(100)+1;
		System.out.println("랜덤 숫자 : "+ com);
		
		int score = 100;
		int wrongAnswerCnt = 0;
		
		for (int i = 0; i < 20; i++) {
			System.out.print("숫자 입력[1~100] : ");
			int me = scan.nextInt();
			
			if (com > me ) {
				System.out.println("up!");
				wrongAnswerCnt++;
			}
			else if (com < me) {
				System.out.println("down!");
				wrongAnswerCnt++;
			}
			else {
				System.out.println("bingo!");
				break;
			}
		}
		
		score = score - (wrongAnswerCnt * 5);
		System.out.println("점수는 : "+ score);
		scan.close();
	}

}
