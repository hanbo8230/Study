package day9_0907.test.work.mian_ji;

/**
 * Created by ���� on 2016/9/7.
 * ����һ���ӿ�IShape���ӿ�����һ����ȡ����ĳ��󷽷���public double area()����
 * ����һ����������Square������ʵ����IShape�ӿڡ�
 * Square������һ������a��ʾ�����εı߳����ڹ��췽���г�ʼ���ñ߳���
 * ����һ�����࣬�������У�����Square���ʵ��������������ζ���������
 */
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.go();
    }

    public void go() {
        Square square = new Square(10);
        System.out.println(square.area());
    }
}
