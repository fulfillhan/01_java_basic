package step1_03.operator;

/*
 * 
 *  # 증감 연산자 
 *  
 *  1) 좌변에 우변의 값을 더한 후 저장			+=
 *  2) 좌변에 우변의 값을 뺀 후 저장 	   		-=
 *  3) 좌변에 우변의 값을 곱한 후 저장 	   		*=
 *  4) 좌변에 우변의 값을 나눈 후 저장 	   		/=
 *  5) 좌변에 우변의 값을 나눈 나머지를 저장   	%=
 *  6) 변수의 값에 1을 더한 후 저장	       	 	++
 *  7) 변수의 값에 1을 뺀 후 저장	        	--
 *  
 * */

public class OperatorEx08 {

	public static void main(String[] args) {

		int orderCnt = 10;
		orderCnt += 3;//orderCnt = orderCnt +3;
		
		System.out.println(orderCnt);
		
		int balance = 10000;
		balance -= 3000;//balance = balance - 3000;
		System.out.println(balance);
		
		int totalPrice = 10000;
		totalPrice *= 7;//totalPrice = totalPrice * 7;
		System.out.println(totalPrice);
		/*
		 * [참고]
		 * 변수++,++변수
		 * 변수--,--변수
		 * 차이점 : 명령어 실행 순서의 차이
		 * */
		
		int x = 0;
		x++;//명령어 실행 순서의 영향이 없음
		System.out.println(x);
		++x;//명령어 실행 순서의 영향이 없음
		System.out.println(x);
		System.out.println();
	
		int y = 0;
		System.out.println(y++);//0 출력후 y증가
		System.out.println(y);//1
		System.out.println();
		
		int z = 0;
		System.out.println(++z);//1 z를 증가한후에 출력
		System.out.println(z);//1
	}

}




