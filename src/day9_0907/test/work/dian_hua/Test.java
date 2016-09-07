package day9_0907.test.work.dian_hua;

/**
 * Created by º«²© on 2016/9/7.
 */
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.show(new CellPhone());
        Telphone phone =new SmartPhone();
        test.show(phone);
        SmartPhone p=( SmartPhone)phone;
        p.playGme();
        Psp psp =new Psp();
        psp.playGme();

    }

    public void show(Telphone x) {
        x.duanXin();
        x.daDianHua();

    }
}
