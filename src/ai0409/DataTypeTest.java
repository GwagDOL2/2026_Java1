package ai0409;

//기본자료형
public class DataTypeTest {
    public static void main(String[] args) {
        //1.숫자형
        byte bt = -128; // -128 ~ 127
        short st = 300;
        st = bt;
        int it = st;
        System.out.printf("%d",it);
        long lg = 70000000;
        float f1 = 1000;
        f1 = lg;
        f1 = 10000.0f;
        f1 = (float)1000.0;

        double d1 = 200000;
        d1 = f1;
        d1 = bt;

        char c = 'a';
        System.out.println(c);
        System.out.println((int)c);
        System.out.println((char)(c+3));

        boolean b  =true;
        System.out.println(b);
        System.out.println(!b);
        System.out.println(bt == st);



    }
}
