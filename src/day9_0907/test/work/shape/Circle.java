package day9_0907.test.work.shape;

/**
 * Created by 韩博 on 2016/9/7.
 * 编写一个抽象类Shape，声明计算图形面积的抽象方法。
 * 再分别定义Shape的子类Circle（圆）和Rectangle（矩形），
 * 在两个子类中按照不同图形的面积计算公式，实现Shape类中计算面积的方法。
 */
//圆的计算方式
public class Circle extends Shape {
    private double r;
    private final double PI = 3.14;
    public Circle() {

    }
    public Circle(double r) {
        setR(r);
    }
    @Override
    public double add() {
        double x = PI * r * r;
        return x;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
