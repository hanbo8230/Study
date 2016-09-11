package day9_0910.test.work;

import java.util.Scanner;

/**
 * Created by 韩博 on 2016/9/10.
 * 输入一行字符，分别统计出其中英文字母、空格、数字和其他字符的个数
 */
public class Scan {


    public static void main(String[] args) {
        Scan.go();
    }

    public static void go() {
        Scanner in = new Scanner(System.in);
        int a = 0;    //字母个数
        int b = 0;    //数字个数
        int c = 0;    //空格个数
        int d = 0;    //其他个数
        System.out.println("请输入一个乱的字符串");
        String num = in.nextLine();
        char[] arr = num.toCharArray();
        //开始进行判断循环
        for (int x = 0; x < arr.length; x++) {
            if (Character.isLetter(arr[x])) {
                a++;        //字母个数
            } else if (Character.isDigit(arr[x])) {
                b++;        //数字个数
            } else if (Character.isWhitespace(arr[x])) {
                c++;        //空格个数
            } else {
                d++;        //其他个数
            }
        }
        System.out.println("字母个数: " + a + "\n数字个数: " + b + "\n空格个数: " + c + "\n其他个数: " + d);
    }
}
