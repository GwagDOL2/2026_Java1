package ai0409;

import java.util.Scanner;

public class OneTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print( "3학점 짜리 시험점수를 입력하세요 : ");
        double sOn = s.nextDouble();
        System.out.print( "3학점 짜리 시험점수를 입력하세요 : ");
        double sTw = s.nextDouble();
        System.out.print( "2학점 짜리 시험점수를 입력하세요 : ");
        double sTh = s.nextDouble();

        double result = (sOn * 3 + sTw * 3 + sTh * 2)/(3 + 3 + 2);

        if (result >= 3.85)
            System.out.printf("학점은 %.2f이고 합격이다\n",result);
        else
            System.out.printf("학점은 %.2f이고 불합격이다\n",result);




    }
}
