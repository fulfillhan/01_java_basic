package step1_06.loop;
//2023-11-27
//-> 느낀점 : 출력문은 반복문을 빠져나온 후 입력!! 반복문내에 입력하는 실수하지 말자!!
import java.util.Random;

/*
 * # 랜덤학생
 * 
 * 1. 10회 반복을 한다.
 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적) 
 * 3. 성적이 60점 이상이면 합격생이다.
 * ---------------------------------------
 * . 전교생(10명)의 총점과 평균을 출력한다.
 * . 합격자 수를 출력한다.
 * . 1등 학생의 번호와 성적을 출력한다.
 * 
 */

public class LoopEx15_연습 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int totalScore = 0;
		double aver = 0;
		int passStudentCnt = 0;
		int firstStudenNum = 0;
		int firstStudentScore = 0;
		
		int i = 0;
		
		while (i < 10) {
			
			int randomScore = ran.nextInt(100)+1;
			System.out.print(randomScore + " ");
				
			//전교생의 총점과 평균 구하기
			totalScore += randomScore;
			
			//합격자 수를 출력한다(60점 이상)
			if (randomScore >= 60) {
				passStudentCnt++;
			}
				
			//1등 학생의 번호와 성적 출력
			if (firstStudentScore < randomScore) {
				firstStudentScore = randomScore;
						firstStudenNum = i;
			}
			i++;
		}
		
		System.out.println();
		
		aver = totalScore / 10.0;// totalScore점수가 총점이 되어서 평균으로 나눠져야하니 반복문 밖에서 작성
		
		System.out.println("전교생의 총점 : "+ totalScore);
		System.out.println("전교생의 평균 : "+ aver);
		System.out.println("합격자 수 : "+ passStudentCnt);
		System.out.println("1등 학생의 번호 : "+ firstStudenNum);
		System.out.println("1등 학생의 성적 : "+ firstStudentScore);
		
		}
	}


