package step1_06.loop;

import java.util.Iterator;

// # 삼각형 그리기

public class LoopEx28_연습 {
	
	public static void main(String[] args) {
		
		/*
		 * 예)
		 * ###
		 * ###
		 * ###
		 */
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
		
		/*
		 * 문제 1)
		 * #
		 * ##
		 * ###
		 */
		
		for(int i = 0 ; i < 3; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		
	

		
		/*
		 * 문제 2)
		 *   #
		 *  ##
		 * ###
		 */
		
		for (int i = 0; i < 3; i++) { // 행의 갯수 3
			for (int j = 0; j < 2-i; j++) { // 행의 반복하면서 2회 ""출력한다.
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {// "#"의 갯수 :  j=0 i=0 1개/ j=1 i=1 2개/ j=2 i=2 3개
				System.out.print("#");
			}
			System.out.println();
		}
	
		System.out.println();

		
		
		/*
		 * 문제 3)
		 * ###
		 * ##
		 * #
		 */
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3-i; j++) { // 00,11,22
				System.out.print("#");
			}
			for (int j = 0; j< i; j++) {//0,1,2,
				System.out.print(" ");
			}
			System.out.println();
			
		}

		
		/*
		 * 문제 4)
		 * ###
		 *  ##
		 *   #
		 */

		
		/*
		 * 문제 5)
		 * @##
		 * @@#
		 * @@@
		 */

		
		/*
		 * 문제 6)
		 *   #
		 *  ###
		 * #####
		 */

		/*
		 * 문제 7)
		 *  #####
		 *   ###
		 *    #
		 */

		
		
	}
}
