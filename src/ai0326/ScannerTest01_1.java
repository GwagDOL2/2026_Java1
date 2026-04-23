package ai0326;

import java.util.Calendar;
import java.util.Scanner;

public class ScannerTest01_1 {
    public static void main(String[] args) {
        System.out.println("========= 나이 계산 =========");
        Scanner s = new Scanner(System.in);
        System.out.print("출생년도를 입력하시오.:");
        int birthYear = s.nextInt();

        Calendar calender = Calendar.getInstance();

        int nowYear = calender.get(Calendar.YEAR);

        int age = nowYear - birthYear + 1;

        System.out.println("나이는 "+ age +"살 입니다");
        s.close();
    }
}
