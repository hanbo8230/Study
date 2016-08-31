package day2_0829.test.work;

/**
 * Created by 韩博 on 2016/8/29.
 * 要求:请写一个功能，实现求两个int数中的最大值，并把最大值返回，并在main方法中进行调用。
 */
public class Get {
    public static void main(String[] args) {
        System.out.print(get_max(39,32));
    }

    //获取最大值
    public static int get_max(int a, int b) {
        int num = 0;
        if (a < b) {
            num =b;
        }else{
            num =a;
        }
        return num;
    }
}
