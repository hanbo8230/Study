package day9_0905.test.work.run;

/**
 * Created by ���� on 2016/9/5.
 * �Ա�д�������м̳й�ϵ���࣬A��B��C��B�̳�A��C�̳�B����Ҫ��
 * A�а�������a1()��a2()��
 * B���еķ���b1()������a1()��a2()��
 * C���еķ���c1()������a1()��a2()��b1()��
 * ��a1(),a2(),b1(),c1()��Щ���������ʵ����ĿҪ��֮�⣬�������ݿ��������д����
 */
public class C extends B{
    public void c1(){
        super.a1();
        super.a2();
        super.b1();
        System.out.println("c1");
    }
}
