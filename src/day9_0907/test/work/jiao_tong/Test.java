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
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.go(new Car());
        Tank tank =new Tank();
        test.go(tank);
        tank.fire();

    }

    public void go(AutoMobile x) {
        x.atart();
        x.run();
    }

    public void go(Plane x) {
        x.atart();
        x.run();
    }

    public void go(Ship x) {
        x.atart();
        x.run();
    }
}
