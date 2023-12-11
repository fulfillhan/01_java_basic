package step1_05.condition;
//2023-11-27 
import java.util.Scanner;

//2023-11-27 
/*
* # 로그인[2단계]
* 
* 1. id와 pw를 입력받아 회원가입을 진행한다.
* 2. 이후 로그인을 위해 다시 id와 pw를 입력받는다.
* 3. 가입 후 저장된 데이터와 로그인 시 입력받은 데이터를 비교한다.
* 예) 로그인 성공 or 로그인 실패
*/
public class IfEx05_연습 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int dbId = 0;
		int dbPw = 0;
		
		System.out.println("=== 회원가입 ===");
		//id와 pw 입력받기
		System.out.print("가입할 ID 입력하세요 : ");
		 dbId = scanner.nextInt();
		
		System.out.print("가입할 PW 입력하세요 : ");
		dbPw = scanner.nextInt();
		
		System.out.println("\n 회원가입이 완료되었습니다! \n");
		
		//로그인 하기
		System.out.println("===로그인 하기 ===");
		System.out.print("ID로그인 하기 : ");
		int myId = scanner.nextInt();
		System.out.print("pw로그인 하기 : ");
		int myPw = scanner.nextInt();
			
		
		if (dbId == myId && myPw == dbPw) {
			System.out.println("로그인 되었습니다.");
		}else if ( dbId != myId || myPw != dbPw) {//아이디가 안맞거나 혹은 비번 하나라도 안맞아도 로그인 실패
			System.out.println("다시 로그인 해주세요.");
		}
	
		scanner.close();
	}
	

}
