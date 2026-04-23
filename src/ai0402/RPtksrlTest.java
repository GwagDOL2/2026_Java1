package ai0402;

import java.util.Scanner;

public class RPtksrlTest {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        System.out.print("정수1:");
        int dlf = s.nextInt();

        System.out.print("정수2:");
        int dl = s.nextInt();


        System.out.printf("%d + %d = %d\n",dlf, dl, dlf+dl );
        System.out.printf("%d - %d = %d\n",dlf, dl, dlf-dl);
        System.out.printf("%d x %d = %d\n",dlf, dl, dlf*dl );
        System.out.printf("%d ÷ %d = %.2f\n",dlf, dl, (double)dlf/dl );
        System.out.printf("%d %% %d = %d\n",dlf, dl, dlf % dl );

        System.out.print("파운드 (lb)를 입력하세요:");
        int num1 = s.nextInt();
        System.out.print("킬로그램(kg)을 입력하세요:");
        int num2 = s.nextInt();

        System.out.printf("%d파운드(lb)는 %.4f 킬로그램(kg)입니다.\n",num1, num1 * 0.4535);

        System.out.printf("%d킬로그램(kg)은 %.4f파운드(lb)입니다.\n",num1, num1 * 2.2046);


        double lb = 0.453592;
        double kg = 2.204623;
        double result = 0;
        System.out.print("파운드 값 입력:");
        int input1= s.nextInt();
        System.out.print("킬로그램값입력:");
        int input2= s.nextInt();
        result = input1 * lb;
        System.out.printf("%d 파운드lb는 %.3f킬로그램(kg)입니다.\n", input1, result);

        result = input2 * kg;
        System.out.printf("%d 파운드lb는 %.3f킬로그램(kg)입니다.\n", input1, result);
        int n1=1;
        int n2=2;
        result = ++n1 + n2*3;
        System.out.print(result);


        s.close();
    }
}
