package day9_0914.test;


import java.util.InputMismatchException;

/**
 * Created by ���� on 2016/9/14.
 */
public class Test3_Main {
    public static void main(String[] args) {
        Test3_Main test = new Test3_Main();
        try {
            test.go(3, 0);
        }catch (ArithmeticException e){
                e.printStackTrace();
            sop("��1");
        }catch (Exception e1){
            sop(("��2"));
        }finally {
            sop("����");
        }
        sop("123");

    }
    //�������쳣,ֻ�����쳣,�ɵ������� tey...catch �����쳣
    public void go(int a, int b) throws ArithmeticException {
        sop(a / b);
    }

    public static void sop(Object obj) {
        System.out.println(obj);
    }
}
