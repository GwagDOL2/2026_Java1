package ai0326;

import java.util.Calendar;
import java.util.Scanner;

public class ParseTest_1{
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        Scanner s = new Scanner(System.in);


        System.out.print("무게(g):");
        int anro = s.nextInt();
        int rkrur = anro * 5;

        System.out.print("이름:");
        String name = s1.nextLine();
        System.out.print("주소:");
        String address = s1.nextLine();


        System.out.println("이름==>"+ name);
        System.out.println("주소==>"+ address);
        System.out.println("배송비==>"+ rkrur);
        System.out.println("배송비==>"+ (anro*5));
        s.close();
    }
}

