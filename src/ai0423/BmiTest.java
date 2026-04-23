package ai0423;

import java.util.Scanner;

public class BmiTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("키(cm)를 입력하세요: ");
        double ki = s.nextDouble();

        System.out.print("몸무게(kg)를 입력하세요: ");
        int ahaanro = s.nextInt();

        // 1. cm를 m로 변환 (100으로 나눠야 함)
        double kii = ki / 100.0;

        // 2. BMI 계산
        double result = ahaanro / (kii * kii);
        String res = "";

        // 3. 판정 로직 (범위를 겹치지 않게 수정)
        if (result >= 22.9) {
            res = "과체중";
        } else if (result >= 18.5) {
            res = "정상";
        } else {
            res = "저체중";
        }

        // 결과 출력 (소수점 확인을 위해 BMI 수치도 함께 출력하면 좋아요)
        System.out.printf("당신의 BMI는 %.2f이며, %s입니다.\n", result, res);

        s.close();
    }
}