package day2_0829.test.work;

/**
 * Created by ���� on 2016/8/29.
 * Ҫ��:���ݸ������������������һ��*��ɵĳ����Ρ�
 */
import java.util.Scanner;
public class Fang {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("������һ������: ");
        int y = in.nextInt();
        System.out.print("������һ�����: ");
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
