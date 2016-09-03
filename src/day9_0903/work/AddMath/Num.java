package day9_0903.work.AddMath;

/**
 * Created by 韩博 on 2016/9/3.
 * 6.使用构造方法与重载编写以下题目
 * 创建一个类，为该类定义三个构造函数，分别执行下列操作：
 * 1、传递两个整数值并找出其中较大的一个值
 * 2、传递三个double值并求出其乘积
 * 3、传递两个字符串值并检查其是否相同
 * 4、在main方法中测试构造函数的调用
 */
public class Num {
    public Num() {
    }

    public Num(String a, String b) {
        String c = a==b?(" 两个字相同"):(" 两个字不同");
        System.out.println(a + " 和 " + b + c);
    }

    //传递三个double值并求出其乘积
    public Num(double a, double b, double c) {
        double d = a * b * c;
        System.out.println(a + " 和 " + b + " 和 " + c + " 的乘积是: " + d);
    }

    //传递两个整数值并找出其中较大的一个值
    public Num(int a, int b) {
        int c = a > b ? a : b;
        System.out.println(a + " 和 " + b + " 中最大值是: " + c);
    }

}
