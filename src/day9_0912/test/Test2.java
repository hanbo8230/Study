package day9_0912.test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by 韩博 on 2016/9/12.
 */
public class Test2 {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        //添加元素
        a1.add(new Name("名1", "姓1"));
        a1.add(new Name("名2", "姓2"));
        a1.add(new Name("名3", "姓3"));
        a1.add(new Name("名4", "姓4"));
        sop(a1);
        //删除元素
        a1.remove(3);
        sop(a1);
        //返回此列表中的元素数
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
