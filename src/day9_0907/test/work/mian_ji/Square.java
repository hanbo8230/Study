package day9_0907.test.work.mian_ji;

/**
 * Created by ���� on 2016/9/7.
 * ����һ���ӿ�IShape���ӿ�����һ����ȡ����ĳ��󷽷���public double area()����
 * ����һ����������Square������ʵ����IShape�ӿڡ�
 * Square������һ������a��ʾ�����εı߳����ڹ��췽���г�ʼ���ñ߳���
 * ����һ�����࣬�������У�����Square���ʵ��������������ζ���������
 */
public class Square implements IShape {
    private double a;


    Square() {

    }
    Square(double a) {
        setA(a);
    }
    @Override
    public double area() {
        double x =a*a;
        return x;
    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }


}
