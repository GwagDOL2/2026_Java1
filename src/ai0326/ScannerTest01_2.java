package ai0326;

import java.util.Scanner;

public class ScannerTest01_2 {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        Scanner s = new Scanner(System.in);


        System.out.print("체중:");
        double aha = s.nextDouble();

        System.out.print("키:");
        double zl = s.nextDouble();

        double k = aha / Math.pow(zl/100, 2);

        System.out.print("이름:");
        String name = s1.nextLine();


        System.out.printf("* %s1님의 BMI 수치는 %.2f㎏/㎡입니다",name, k);
        s.close();
    }
}
