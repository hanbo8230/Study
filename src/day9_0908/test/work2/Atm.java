package day9_0908.test.work2;
import java.util.Scanner;

/**
 * Created by ���� on 2016/9/8.
 */
public class Atm extends User implements day9_0908.test.work.Int{

    Scanner in = new Scanner(System.in);
    User p1 = new User("����", 111,1000);
    User p2 = new User("����", 222, 2000);
    User p3 = new User("��������", 333, 3000);

    @Override
    public boolean dengLu() {
        return false;
    }

    @Override
    public void quKuan() {

    }

    @Override
    public void cunKuan() {

    }

    @Override
    public void zhuanZhang() {

    }

    @Override
    public void zhuanzhang() {

    }
}
