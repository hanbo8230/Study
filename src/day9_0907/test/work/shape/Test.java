package day9_0907.test.work.shape;

/**
 * Created by 韩博 on 2016/9/7.
 * 编写一个抽象类Shape，声明计算图形面积的抽象方法。
 * 再分别定义Shape的子类Circle（圆）和Rectangle（矩形），
 * 在两个子类中按照不同图形的面积计算公式，实现Shape类中计算面积的方法
 */
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.go(new Circle(2));
        test.go(new Rectangle(2));
    }

    public void go(Shape x) {
        double y = x.add();
        System.out.println(y);
    }
}
