package day8_0831.test.work;

/**
 * Created by ���� on 2016/8/31.
 * ���ԣ��۸�price����ɫcolour��ʱ��speed��Ʒ��brand;ͨ��ĳһ����ʵ�������ļ��ٺͼ��٣�
 * ÿ�μ��ٻ��߼��ٶ���Ҫ��ӡ��ǰ�ĳ���
 * ���������ʱ��Ϊ200km��h�����ʱ��Ϊ0
 * ����ӡ������һ����ɫ�ı�����ÿСʱ100���ﱼ����·�ϡ���
 */
public class TestCar {
    public static void main(String[] args) {
    Car car=new Car();
        car.setColour("��ɫ");
        car.setBrand("����");
        car.up_Speed(100);
        car.state();
    }
}
