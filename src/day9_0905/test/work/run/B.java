package day9_0905.test.work.run;

/**
 * Created by 韩博 on 2016/9/5.
 * 试编写三个具有继承关系的类，A、B、C（B继承A，C继承B）。要求
 * A中包含方法a1()、a2()，
 * B类中的方法b1()访问了a1()和a2()，
 * C类中的方法c1()访问了a1()、a2()、b1()。
 * （a1(),a2(),b1(),c1()这些方法体除了实现题目要求之外，其余内容可以任意编写。）
 */
public class B extends A{
    public void b1(){
        super.a1();
        super.a2();
        System.out.println("b1");
    }
}
