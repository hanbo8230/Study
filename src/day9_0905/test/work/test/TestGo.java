package day9_0905.test.work.test;

import java.util.Scanner;

import day9_0905.test.work.run.Go;

/**
 * Created by ���� on 2016/9/5.
 * 1    ����һ�������û��࣬Ҫ�������Ϣ���û�ID���û����롢email��ַ���ڽ������ʵ��ʱ��
 * ������������Ϣ����Ϊ���캯���Ĳ������룬�����û�ID���û�����ʱ����ģ�
 * email��ַ���û�ID�����ַ���"@gameschool.com"
 * 2�����û������飬��������û�ID�����룬email��ַ��ͨ�����������û�ID�������ж��ܵ�¼�ɹ����硣
 */
public class TestGo {
    Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        TestGo t = new TestGo();
        t.test();
    }


    public void test() {
        Go p1 = new Go("����", 000000);
        Go p2 = new Go("����", 888888);
        Go p3 = new Go("��������", 666666);
        Go arr[] = {p1, p2, p3};

        System.out.println("�������˻���: ");
        String id = in.next();
        System.out.println("����������: ");
        int miMa = in.nextInt();
//        Go go = new Go(id, miMa);
        for (int x = 0; x <arr.length; x++) {
            if (arr[x].id.equals(id) && arr[x].miMa == miMa) {
                System.out.println("�ɹ���¼����");
                break;
            } else if (x == arr.length-1) {
                System.out.println("�����˺ŵ���������,����������");
                test();
            }
        }
    }
}
