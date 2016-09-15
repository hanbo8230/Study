package day9_0914.test;


import java.util.InputMismatchException;

/**
 * Created by 韩博 on 2016/9/14.
 */
public class Test3_Main {
    public static void main(String[] args) {
        Test3_Main test = new Test3_Main();
        try {
            test.go(3, 0);
        }catch (ArithmeticException e){
                e.printStackTrace();
            sop("错1");
        }catch (Exception e1){
            sop(("错2"));
        }finally {
            sop("继续");
        }
        sop("123");

    }
    //不捕获异常,只声明异常,由调用者用 tey...catch 捕获异常
    public void go(int a, int b) throws ArithmeticException {
        sop(a / b);
    }

    public static void sop(Object obj) {
        System.out.println(obj);
    }
}
