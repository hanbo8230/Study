package day9_0907.test.work.jiao_tong;

/**
 * Created by ���� on 2016/9/7.
 * ����һ�齻ͨ�����࣬���������ࣨAutoMobile�����ɻ���(Plane)������(Ship)��
 * ������������̹��(Tank)������(Truck)��С����(Car)��
 * �ɻ������пͻ�(AirLiner)��ս����(FighterPlane)��
 * ������������ͧ (Yacht)������(WarShip)��
 * ̹��ս�����;��������й����Ĺ��ܣ����󲢶�����Щ�࣬
 * ͨ��������ͽӿ��Լ���Ӧ��ʵ����ʵ�ֶ�̬����Щ��Ĳ���
 */
public class FighterPlane extends Plane implements Boom{
    @Override
    public void run() {
        System.out.print("��ս�����ķ�ʽ��");
    }

    @Override
    public void fire() {
        System.out.print("�ɻ�����žžž");
    }
}
