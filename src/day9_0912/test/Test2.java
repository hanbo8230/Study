package day9_0912.test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by ���� on 2016/9/12.
 */
public class Test2 {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        //���Ԫ��
        a1.add(new Name("��1", "��1"));
        a1.add(new Name("��2", "��2"));
        a1.add(new Name("��3", "��3"));
        a1.add(new Name("��4", "��4"));
        sop(a1);
        //ɾ��Ԫ��
        a1.remove(3);
        sop(a1);
        //���ش��б��е�Ԫ����
        sop(a1.size());
        Iterator it =a1.iterator();
        while (it.hasNext()) {
            Object n= (Name)it.next();
            sop(n+"  1");
        }
    }

    public static void sop(Object obj) {
        System.out.println(obj);
    }
}

class Name {
    private String firstName;
    private String lastName;

    Name() {

    }

    Name(String a, String b) {
        setFirstName(a);
        setLastName(b);
    }

    public String toString() {
        return this.getFirstName() + this.getLastName();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
