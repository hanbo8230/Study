package day2_0829.test.work;

/**
 * Created by 韩博 on 2016/8/29.
 * 要求:根据给定的行数和列数输出一个*组成的长方形。
 */
import java.util.Scanner;
public class Fang {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("请输入一个长度: ");
        int y = in.nextInt();
        System.out.print("请输入一个宽度: ");
        int x = in.nextInt();
        fang(x, y);
    }

    public static void fang(int a, int b) {
        for (int x = 0; x < a; x++) {
            for (int y = 0; y < b; y++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
