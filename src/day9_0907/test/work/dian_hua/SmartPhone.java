package day9_0907.test.work.dian_hua;

/**
 * Created by ���� on 2016/9/7.
 */
public class SmartPhone extends Telphone implements Game{
    @Override
    public void daDianHua() {
        System.out.println("ͨ��������绰");
    }

    @Override
    public void playGme() {
        System.out.println("���ֻ���Ϸ");
    }
}
