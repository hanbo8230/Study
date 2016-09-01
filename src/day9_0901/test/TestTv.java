package day9_0901.test;

/**
 * Created by 韩博 on 2016/9/1.
 */
public class TestTv {
    public static void main(String[] args){
        Tv tv=new Tv();
        tv.on("开机");
        tv.volume_Up(90);
        System.out.println();
        tv.on("关机");
        tv.volume_Up(20);
        System.out.println();
    }
}
