package step1_05.condition;

import java.util.Random;
import java.util.Scanner;

/*
	==== 가위 바위 보 (하나빼기) ====
	
	1) 가위바위보 2개씩 저장
	meLeft 에 가위바위보 입력
	meRight 에 가위바위보 입력
	
	comLeft에 가위바위보 입력  (랜덤)
	comRight에 가위바위보 입력 (랜덤)
	
	2) 둘중 하나만 저장 
	meFinal에  meLeft 또는 meRight 저장   (직접)
	comFinal에 comLeft 또는 comRight 저장 (랜덤)
	
	3) 최종판정
*/
public class IfEx28_테스트문제 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random r = new Random();
		//가위[0] 바위[1] 보[2]
		
		System.out.println("<가위, 바위, 보 게임을 시작합니다>");
		
		System.out.print("왼손 가위[1] 바위[2] 보[3] 입력 : ");
		int meLeft = scanner.nextInt();
		
		System.out.print("오른손 가위[1] 바위[2] 보[3] 입력 : ");
		int meRight = scanner.nextInt();
		
		int comLeft = r.nextInt(3)+1;
		int comRight = r.nextInt(3)+1;
		
		// 둘중에 하나만 저장한다면
		System.out.println("하나 빼기요!( 어느 손 : 왼손[1] , 오른손[2]");
		int meFinal = scanner.nextInt();
		int comFinal = r.nextInt(1)+1;		
		
		if (meFinal == 1) {
			meFinal = meLeft;
		}else {
			meFinal = meRight;
		}
		if (comFinal == 1) {
			comFinal = comLeft;
		}else {
			comFinal = comRight;
		}
		System.out.println("나의 최종 손은 : "+ meFinal);
		System.out.println("AI의 초종 손은 : "+ comFinal);
		 
		if (meFinal == comFinal) {
			System.out.println("비겼다.");
		}else if (meFinal == 1 && comFinal == 3) {
			System.out.println("이겼다.");
		}else if (meFinal == 2 && comFinal == 1) {
			System.out.println("이겼다.");
		}else if (meFinal == 3 && comFinal == 2) {
			System.out.println("이겼다.");
		}else {
			System.out.println("졌다.");
		}
		scanner.close();

	}

}
