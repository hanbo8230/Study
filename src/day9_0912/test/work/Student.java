package day9_0912.test.work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by ���� on 2016/9/12.
 * ��������ѧ������Student, ���ԣ�����������
 * �������������ѧ��������Ϣ,�����������
 */
public class Student {
    private String name;
    private String age;

    Student() {

    }

    Student(String a, String b) {
        setName(a);
        setAge(b);
    }
    public String toString(){
        return getName()+"  "+getAge();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

class go {
    public static void main(String [] args){
        ArrayList a = new ArrayList();
        a.add(new Student("����","����"));
        a.add(new Student("Mary","28"));
        a.add(new Student("John","26"));
        a.add(new Student("Tom","25"));
        a.add(new Student("Jack","24"));
        a.add(new Student("Lisa","22"));
        a.add(new Student("Linda","21"));


        //���õ�����������List�����еĹ��˵���work����;
        Iterator it =a.iterator();
        while (it.hasNext()){
            sop(it.next());
        }
    }
    public static void sop(Object obj) {
        System.out.println(obj);
    }

}
