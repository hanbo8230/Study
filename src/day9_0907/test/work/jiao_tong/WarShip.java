package day9_0907.test.work.jiao_tong;

/**
 * Created by 韩博 on 2016/9/7.
 */
public class WarShip extends Ship implements Boom{
    @Override
    public void run() {
        System.out.print("用军舰的方式游");
    }

    @Override
    public void fire() {
        System.out.print("军舰开火嗖嗖嗖");
    }
}
