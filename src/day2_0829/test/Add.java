package day2_0829.test; /**
 * Created by ���� on 2016/8/29.
 */

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("�������һ���˵�����: ");
        String x = in.next();
        System.out.print("������ڶ����˵�����: ");
        String y = in.next();
        System.out.print(fuck(x, y));
    }

    public static String fuck(String a, String b) {
        String fuck = "˧���� "+a + " ������20CM�޸� ����������� " + b;
        return fuck;
    }
}
