package day9_0913.test.work;

import java.util.*;

/**
 * Created by ���� on 2016/9/13.
 * 1��ʹ��һ��Map������ʦ��������Ϊ��������ʦ���ڵĿγ�����Ϊֵ����ʾ����
 * �γ̰��š�
 * 2�� ������һλ����ʦAllen ��JDBC
 * 3�� Lucy ��Ϊ��CoreJava
 * 4�� ����Map��������е���ʦ����ʦ���ڵĿγ�(
 * ���ַ���ʹ�ñȽϣ�
 */
public class TestMap1 {
    public static void main(String[] args) {
        TestMap1 t = new TestMap1();
        t.go();
    }

    public void go() {
        Map<String, String> mp = new HashMap<String, String>();
        mp.put("tom", "CoreJava");
        mp.put("John", "Oracle");
        mp.put("Susan", "Oracle");
        mp.put("Jerry", "JDBC");
        mp.put("Jim", "Unix");
        mp.put("Kevin", "JSP");
        mp.put("Lucy", "JSP");
        // mp.values();
        //sop(mp.entrySet());
        mp.put("Allen", "JDBC");
//    ����Map��������е���ʦ����ʦ���ڵĿγ�
//      ��������String���͵Ľ��ļ���
//        Set<String> keys=mp.keySet();
//        for(String x: keys){
//            sop(x+" "+mp.get(x));
//        }
////   ����Map��������е���ʦ����ʦ���ڵĿγ�
////       sop( mp.entrySet());
//        Set<String> keys1 = mp.keySet();
//        for (String x:keys1){
//            sop("��ʦ����: "+x+"\t���ڵĿγ�: "+mp.get(x));
//        }
        //���õ�����
        Set keys2 = mp.entrySet();
        Iterator it=keys2.iterator();
        while (it.hasNext()){
            sop(it.next());
        }


    }

    public static void sop(Object obj) {
        System.out.println(obj);
    }
}
