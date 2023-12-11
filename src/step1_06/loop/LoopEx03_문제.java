package step1_06.loop;

//# 반복문 기본문제[2단계]

public class LoopEx03_문제 {

	public static void main(String[] args) {
		
		// 문제1) 1~10까지 반복해 3미만 7이상만 출력
		// 정답1) 1 2 7 8 9 10
		
		//while 1~10 3 > // 7 <=
		int i =1;
		while (i <= 10) {
			if (i < 3 || i >= 7) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.println();
		System.out.println();
		// 문제2) 문제1의 조건에 맞는 수들의 합 출력
		// 정답2) 37
		int total = 0;//합의 변수 선언
		i = 1;
		
		while (i <= 10) {
			if (i < 3 || i >= 7) {
				total += i;
			}
			i++;
		}
		System.out.println("조건의 합은 : "+ total);
		
        System.out.println();
		
	    // 문제3) 문제1의 조건에 맞는 수들의 개수 출력
		// 정답3) 6
        int cnt = 0;
        i =1;
        while (i <= 10) {
        	if (i < 3 || i >= 7) {
				cnt++;//cnt = cnt +1 갯수가 하나씩 늘어난다.
			}
			i++;
		}
        System.out.println("개수는 : "+ cnt);
		System.out.println();
		// 문제4) 1~5까지의 합 출력
		// 정답4) 15
        total = 0;
        i = 1;
        
        while (i <= 5) {
        	
        	total = total + i; // 1,2,3,4,5 
        	i++;//i = i+1
        	
//        	i++;
//			total = total + i; // 2,3,4,5,6 
		}
        System.out.println("1~5까지의 합 : "+ total);

	}

}
