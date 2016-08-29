package day2_0829.test;

/**
 * Created by 韩博 on 2016/8/29.
 */
public class Out {
    public static void main(String[] args) {
        daYin(1, 100);
    }

    //打印出整数数字 a 到 b 之间的整数数字
    public static void daYin(int a, int b) {
        System.out.println(a + "到" + b + "之间的数字为: ");
        for (int x = a; x <= b; x++) {
            System.out.print(x + ";\t");
            if (x % 10 == 0) {
                System.out.println();
            }
        }
    }
}
