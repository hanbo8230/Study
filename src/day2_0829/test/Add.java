package day2_0829.test; /**
 * Created by 韩博 on 2016/8/29.
 */

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入第一个人的名字: ");
        String x = in.next();
        System.out.print("请输入第二个人的名字: ");
        String y = in.next();
        System.out.print(fuck(x, y));
    }

    public static String fuck(String a, String b) {
        String fuck = "帅气的 "+a + " 用他的20CM巨根 干死了猥琐的 " + b;
        return fuck;
    }
}
