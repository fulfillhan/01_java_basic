package step1_06.loop;

import java.util.Random;
import java.util.Scanner;

/*
 * # 구구단 게임[3단계]
 * 
 * 1. 구구단 게임을 5회 반복한다. hile 
 * 2. 정답을 맞추면 20점이다.
 * 3. 게임 종료 후, 성적을 출력한다.
 * 
 * 2 * 1/ 2*2~~ 9*1 9*9
 * 
 */

public class LoopEx04_연습 {
	
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int score = 0;
		int answerCnt = 0;
		int i = 1;
		
		while (i <= 5) {
			int x = ran.nextInt(8)+2;
			int y = ran.nextInt(9)+1;
			int answer = x * y ;
			
			System.out.print(x + " x "+ y + " = ");
			int myAnswer=scan.nextInt();
			
			if (answer == myAnswer) {
				answerCnt++;// 내가 말한 정답과 while내의 answer true여야지만 answerCnt 증가
			}
			i++;
		}
		score = answerCnt * 20;
		System.out.println("점수는 : "+ score);
		
		scan.close();

	}

}
