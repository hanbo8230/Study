package day9_0907.test.work.shape;

/**
 * Created by 韩博 on 2016/9/7.
 * 编写一个抽象类Shape，声明计算图形面积的抽象方法。
 * 再分别定义Shape的子类Circle（圆）和Rectangle（矩形），
 * 在两个子类中按照不同图形的面积计算公式，实现Shape类中计算面积的方法。
 */
public class Rectangle extends Shape{
    private double l;
    public Rectangle(){

    }
    public Rectangle(double l){
        setL(l);
    }

    @Override
    public double add() {
        double x = l*l;
        return x;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }
}
