package day9_0903.work.Vehicles;

/**
 * Created by ���� on 2016/9/3.
 * * A.����һ����ΪVehicles����ͨ���ߣ��ĸ��࣬
 * ������Ӧ����String���͵ĳ�Ա����brand���̱꣩��color����ɫ����
 * ��Ӧ������Ա����run����ʻ���ڿ���̨��ʾ�����Ѿ������ˡ���
 * ��showInfo����ʾ��Ϣ���ڿ���̨��ʾ�̱����ɫ��������д���췽����ʼ�����Ա���ԡ�
 * B.��дCar��С��������̳���Vehicles�࣬����int�ͳ�Ա����seats����λ����
 * ��Ӧ���ӳ�Ա����showCar���ڿ���̨��ʾС��������Ϣ��������д���췽����
 * C.��дTruck����������̳���Vehicles�࣬����float�ͳ�Ա����load�����أ���
 * ��Ӧ���ӳ�Ա����showTruck���ڿ���̨��ʾ��������Ϣ��������д���췽����
 * D.��main�����в������ϸ��ࡣ
 */
public class Car extends Vehicles {
    private int seats;

    Car() {

    }

    public void showCar() {
        super.showInfo();
        System.out.println("����" + seats + "����λ");
    }


    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
