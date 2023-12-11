package step1_06.loop;
// 11.24 연습1
/*
* # 영수증 출력[2단계]
* 1. 5번 주문을 받는다.
* 2. 주문이 끝난 후, 돈을 입력받는다.
* 3. 각 메뉴별 주문수량과 총금액을 출력한다.
* 
* 예)
* 메뉴 선택 : 1
* 메뉴 선택 : 1
* 메뉴 선택 : 2
* 메뉴 선택 : 2
* 메뉴 선택 : 3
* 총 금액 = 31300원
* 현금 입력 : 32000
* === 롯데리아 영수증 ===
* 1. 불고기 버거 : 2개
* 2. 새우    버거 : 2개
* 3. 콜         라 : 1개
* 4. 총   금   액 : 31300원
* 5. 잔         돈 : 700원
*/

import java.util.Scanner;

public class LoopEx05_연습 {
	
public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		
		int bulgogiBurgerPrice = 8700;
		int shrimpBurgerPrice  = 6200;
		int colaPrice = 1500;
		
		int bulgogiBurgerCnt = 0;
		int shrimpBurgerCnt = 0;
		int colaCnt = 0;
		int i = 0;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + bulgogiBurgerPrice + "원");
		System.out.println("2.새우    버거 : " + shrimpBurgerPrice + "원");
		System.out.println("3.콜         라 : " + colaPrice + "원");
		
		while (i < 5) {
			
			System.out.print("메뉴 선텍 : ");
			int myMenu = scanner.nextInt();
			
			if (myMenu == 1) {
				bulgogiBurgerCnt++;
			}else if (myMenu == 2) {
				shrimpBurgerCnt++;
			}else if (myMenu == 3) {
				colaCnt++;
			}i++;
		}
		//총 금액 = 31300원
		//현금 입력 : 
		int totBulgogiPrice = bulgogiBurgerCnt * bulgogiBurgerPrice;
		int totShrimpBurgerPrice = shrimpBurgerCnt * shrimpBurgerPrice;
		int totCocaPrice = colaCnt * colaPrice;
		
		int totalPrice = totBulgogiPrice + totShrimpBurgerPrice + totCocaPrice;
		
		System.out.println("총 금액 = "+ totalPrice+ "원");
		System.out.print("현금 입력 : ");
		int myMoney = scanner.nextInt();
		
		//현금이 있는 경우
		int charge = myMoney - totalPrice;
		if (myMoney >=  totalPrice) {
			
			System.out.println("=== 롯데리아 ===");
			System.out.println("1.불고기 버거 : " + bulgogiBurgerCnt  + "개");
			System.out.println("2.새우    버거 : " + shrimpBurgerCnt+ "개");
			System.out.println("3.콜         라 : " + colaCnt+ "개");
			System.out.println("4.총   금   액 : "+ totalPrice+ "원");
			System.out.println("잔         돈 : "+ charge+ "원");
			
		}
		//현금이 부족한 경우
		//총 금액 = 31300원
		//현금 입력 : 32
		//현금이 부족합니다.
		else  {
			System.out.println("현금이 부족합니다.");
		}
		
		scanner.close();
	}

}
