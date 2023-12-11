package step1_06.loop;

public class LoopEx02 {

	public static void main(String[] args) {
		
		int i =1;
		
		while(i <=10) {
			
			if(i >= 5 && i <9) {
				System.out.println(i);
			}
			i++;
			
		}
		System.out.println();
		
		i = 10;
		while (i >= 1) {
			if (i >= 3 && i < 6) {
				System.out.println(i);
			}
			i--;
		}
		System.out.println();
		
		i =1;
		
		int cnt =0;//카운트의 약어
		
		while (i <= 100000) {
			if(i % 7 == 0) {
				cnt++;
			}
			i++;
		}
		System.out.println(cnt);
		

	}

}
