package step1_06.loop;

import java.util.Random;
import java.util.Scanner;


/*
 * # 구구단 게임[3단계]
 * 
 * 1. 구구단 게임을 5회 반복한다.
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 * 
 */

public class LoopEx21_문제 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		Scanner scan =  new Scanner(System.in);
		
		int score = 0;
		int answerCnt = 0;
		for(int i = 0; i < 5; i++) {
			
			int x = ran.nextInt(8)+2;
			int y = ran.nextInt(9)+1;
			int answer = x * y;
			
			System.out.print(x + "x"+ y +" = ");
			int myAnswer = scan.nextInt();
			
			if (answer == myAnswer) {
				answerCnt++;
			}
			
		}
		score = answerCnt * 20;
		System.out.println("점수는 : "+ score);
		
	}
	

}
