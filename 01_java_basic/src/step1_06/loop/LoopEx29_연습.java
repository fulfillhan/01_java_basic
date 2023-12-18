package step1_06.loop;

import java.util.Arrays;
import java.util.Scanner;
//2023-12-16
/*
 * # 소수찾기[2단계]
 *
 * 정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
 * 예)
 * 입력 : 20
 * 2, 3, 5, 7, 11, 13, 17, 19
 *
 */

public class LoopEx29_연습 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("정수 입력 : ");
        int getNumber = scan.nextInt();
        int count;

        for (int i = 2; i <= getNumber; i++) {
                //i = 2,3,4,5,6,7,8,9,10
            count = 0; // 약수의 갯수를 사용하는데 필요한 변수
            for (int j = 1; j <= i; j++) { // 현재 검사중인 i가 소수인지 판별하는 역할
                if (i % j == 0)
                    count++;
            }
            if (count == 2) //1과 자기 자신만을 약수로 갖는 경우이니깐
                System.out.print(i + "");
        }

        scan.close();
    }

}
