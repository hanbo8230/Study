package day9_0907.test.work.dian_hua;

/**
 * Created by 韩博 on 2016/9/7.
 */
public class SmartPhone extends Telphone implements Game{
    @Override
    public void daDianHua() {
        System.out.println("通过语音打电话");
    }

    @Override
    public void playGme() {
        System.out.println("玩手机游戏");
    }
}
