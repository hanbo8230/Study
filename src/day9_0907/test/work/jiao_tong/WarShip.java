package day9_0907.test.work.jiao_tong;

/**
 * Created by ���� on 2016/9/7.
 */
public class WarShip extends Ship implements Boom{
    @Override
    public void run() {
        System.out.print("�þ����ķ�ʽ��");
    }

    @Override
    public void fire() {
        System.out.print("�����������");
    }
}
