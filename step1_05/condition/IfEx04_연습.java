package step1_05.condition;
//2023-12-01 11:32 ~ 11:36
import java.util.Scanner;

/*
 * # 로그인[1단계]
 * 
 * 1. id와 pw를 입력받는다.
 * 2. 입력받은 데이터와 db데이터를 비교해 로그인 처리를 진행한다.
 *    (db > database > 저장되어있는 데이터) 
 * 예) 로그인 성공 or 로그인 실패
 * 
 */


public class IfEx04_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	    int dbId = 1234;
		int dbPw = 1111;
		
		
		System.out.print("id 입력 : ");
		int myId = scan.nextInt();
		
		System.out.print("pw 입력 : ");
		int myPw = scan.nextInt();
		
		if (myId == dbId && myPw == dbPw) {
			System.out.println("로그인 성공.");
		}
		else if (myId != dbId || myPw != dbPw) {
			System.out.println("로그인 실패");
		}
		/*
		 * else { System.out.println("로그인 실패"); }
		 */


	}

}
