package day9_0907.test.work.shape;

/**
 * Created by ���� on 2016/9/7.
 * ��дһ��������Shape����������ͼ������ĳ��󷽷���
 * �ٷֱ���Shape������Circle��Բ����Rectangle�����Σ���
 * �����������а��ղ�ͬͼ�ε�������㹫ʽ��ʵ��Shape���м�������ķ�����
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
