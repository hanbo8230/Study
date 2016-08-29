package day2_0829.test.work;

/**
 * Created by 韩博 on 2016/8/29.
 * 要求:写一个猜数字的游戏，方法名为guessNumber()。
 * 如果猜对了，恭喜猜对了。否则要求重新猜，直到猜对为止。
 */

import java.util.Scanner;
import java.util.Random;

public class RanDom {
    public static void main(String[] args) {
        guessNumber();
    }

    public static void guessNumber() {
        Random r = new Random();
        int num = r.nextInt(10) + 1;
        Scanner in = new Scanner(System.in);
        System.out.print("请输入一个数字");
        int n = in.nextInt();
        while (n != num) {
            System.out.print("对不起,你没有猜中,请重新输入一个数字: ");
            n = in.nextInt();
        }
        System.out.print("恭喜您猜对了,中奖数字为: " + num +"您猜的数字为: "+ n);
    }


}
