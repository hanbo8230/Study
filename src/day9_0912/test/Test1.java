package day9_0912.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/**
 * Created by ���� on 2016/9/12.
 */
public class Test1 {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        //���������Ԫ��
        a1.add("java 1");
        a1.add("java 2");
        a1.add("java 3");
        sop(a1);
        //������ɾ������Ԫ��
        //a1.clear();
        //sop(a1);
        //������ɾ��ĳ��Ԫ��
        //a1.remove("java 1");
        //sop(a1);
        //��ȡ������
        Iterator it =a1.iterator();
        //���õ�������ӡԪ��
        while (it.hasNext()){
            sop(it.next());
        }
        //����forѭ����ӡԪ��
        for (Object x: a1){
            sop("for"+x);
        }
    }

    public static void sop(Object obj) {
        System.out.println(obj);
    }

}
