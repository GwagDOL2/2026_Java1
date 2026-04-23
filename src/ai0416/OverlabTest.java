package ai0416;

import java.util.Scanner;

public class OverlabTest {
    public static void main(String[] args) {
        System.out.println("특정 번위 숫자 판별 프로그램");
        Scanner s = new Scanner (System.in);
        System.out.print( "* 정수를 입력 : ");
        int num = s.nextInt();

        if (num > 100){
            if (num < 1000)
                System.out.printf("입력된 숫자 %d는 100보다 크고 100 보다 작은 숫자\n", num);
            else
                System.out.printf("입력된 숫자 %d는 1000보다 큰 숫자\n", num);
        }

        else
            System.out.printf("입력된 숫자 %d는 100보다 작은 숫자\n",num);
    }
}