package step1_06.loop;

import java.util.Scanner;

/*
 * # ATM[2단계]
 * 
 * 1. 로그인
 * . 로그인 후 재 로그인 불가
 * . 로그아웃 상태에서만 이용 가능
 * 2. 로그아웃
 * . 로그인 후 이용가능
 * 3. 입금
 * . 로그인 후 이용가능
 * 4. 출금
 * . 로그인 후 이용가능
 * 5. 이체
 * . 로그인 후 이용가능
 * 6. 조회
 * . 로그인 후 이용가능
 * 7. 종료
 * 
 */

public class LoopEx10_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;	
		
		int identifier = -1;						// -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		
		boolean isRun = true;
		while(isRun) {
			
			System.out.println("dbMoney1 = "+ dbMoney1+ "원");
			System.out.println("dbMoney2 = "+ dbMoney2+ "원");
			
			System.out.println("*상태 : ");
			if (identifier == -1) {
				System.out.println("로그아웃");
			}
			else if (identifier ==1) {
				System.out.println(dbAcc1 + "로그인");
			}
			else if (identifier == 2) {
				System.out.println(dbAcc2 + "로그인");
			}
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
			System.out.println("3.입금");
			System.out.println("4.출금");
			System.out.println("5.이체");
			System.out.println("6.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {// 로그인 접근
				if (identifier == -1) {//로그아웃 상태일때
					System.out.println("계좌 번호 입력하세요 : ");
					int myAcc = scan.nextInt();
					
					System.out.println("비밀 번호 입력하세요 : ");
					int myPw = scan.nextInt();
					
					//로그인 한 경우
					if (dbAcc1 ==myAcc && dbPw1 == myPw) {
						identifier =1;
						System.out.println(dbAcc1 + "님 환영합니다.");
					}
					else if (dbAcc2 == myAcc && dbPw2 == myPw) {
						identifier = 2;
						System.out.println(dbAcc2 + "님 환영합니다.");
					}
					else {
						System.out.println("계좌번호와 비밀번호 확인해주세요.");
					}
				}
				//로그아웃이 아닌 상태일 때
				else {
					System.out.println("로그인 중... ");
				}
			}//로그아웃 접근
			else if (selectMenu == 2) {
				if (identifier == -1) {//로그아웃 상태
					System.out.println("로그아웃 되었습니다.");
				}
				else {
					//로그인 상태가 아니면,,,, 로그인 후 가능
					System.out.println("로그인 후 이용가능합니다.");
				}
			}
			//입금 상태 접근
			else if (selectMenu  == 3) {
				if (identifier != -1) {//로그인 상태로
					System.out.print("이체할 금액 입력 : ");
					int transferMoney = scan.nextInt();
					
					if (identifier == 1) {
						dbMoney1 = dbMoney1 + transferMoney;
					}
					else if (identifier == 2) {
						dbMoney2 = dbMoney2 + transferMoney;
					}
					System.out.println("입금을 완료했습니다.");
				
				}
				else {//-> 로그아웃 상태
					System.out.println("로그인 후 이용 가능합니다.");
				}
				
			}
			//출금 접근
			else if (selectMenu == 4) {
				if (identifier != -1) {//로그인 상태
					System.out.println("출금할 금액 입력 : ");
					int transOutMoeny = scan.nextInt();
					
					if (identifier ==1) {
						if (transOutMoeny <= dbMoney1) {
							dbMoney1 = dbMoney1 - transOutMoeny;
						System.out.println("출금을 완료했습니다.");
						}
						else {
							System.out.println("잔액이 부족합니다.");
						}
					}
					else if (identifier == 2) {
						if (transOutMoeny <= dbMoney2) {
							dbMoney2 = dbMoney2 - transOutMoeny;
							System.out.println("출금을 완료했습니다.");
						}
						else {
							System.out.println("잔액이 부족합니다.");
						}
					}
				}
			}
			else if (selectMenu == 5) {
				
			}
			else if (selectMenu == 6) {
				
			}
			else if (selectMenu == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}
	
		scan.close();
		
	}

}
