package ai0430;

import java.util.Scanner;

public class LAB_Switch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("* 출생 년도 입력:");
        int year = s.nextInt();
        String result = "";

        switch (year % 12) {
            case 0:
                result = "원숭이";
                break;
            case 1:
                result = "닭";
                break;
            case 2:
                result = "개";
                break;
            case 3:
                result = "돼지";
                break;
            case 4:
                result = "쥐";
                break;
            case 5:
                result = "소";
                break;
            case 6:
                result = "호랑이";
                break;
            case 7:
                result = "토끼";
                break;
            case 8:
                result = "용";
                break;
            case 9:
                result = "뱀";
                break;
            case 10:
                result = "말";
                break;
            case 11:
                result = "양";
                break;
            default:
                result = "잘못된 출생년도";
        }
        System.out.printf("%s띠 입니다.\n", result);

        s.close();
    }
}