package day9_0907.test.dayinji;

/**
 * Created by 韩博 on 2016/9/7.
 */
public class CaiSe extends DaYinJi {
    CaiSe() {
        setYanSe("彩色");
    }


    @Override
    public void print() {
        System.out.println("我抽象打印" + getYanSe());
    }
}
