package day8_0831.test.work;

/**
 * Created by ���� on 2016/8/31.
 * Ҫ��:��װ˼�룺����һ��Computer�࣬�����������У��۸�price ��ɫcolour ����weight Ʒ��brand.
 * ���ͨ�����÷��ص�����ֵ��ӡ��һ̨���Ե�������Ϣ
 */
public class TestComputer {
    public static void main(String[] args) {
        Computer computer=new Computer(1024,"ʺ��",250,"��ʺ��");
        double a = computer.getPrice();
        System.out.println("���Լ۸���: "+ a+"��");
        String b= computer.getColour();
        System.out.println("������ɫ��: "+ b);
        double c= computer.getWeight();
        System.out.println("����������: "+ c +"��");
        String d= computer.getBrand();
        System.out.println("����Ʒ����: "+ d);


    }
}
