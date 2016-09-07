package day9_0907.test.work.shape;

/**
 * Created by ���� on 2016/9/7.
 * ��дһ��������Shape����������ͼ������ĳ��󷽷���
 * �ٷֱ���Shape������Circle��Բ����Rectangle�����Σ���
 * �����������а��ղ�ͬͼ�ε�������㹫ʽ��ʵ��Shape���м�������ķ�����
 */
//Բ�ļ��㷽ʽ
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
