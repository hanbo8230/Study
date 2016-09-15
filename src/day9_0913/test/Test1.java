package day9_0913.test;
import day9_0910.test.work.Sys;

import java.util.*;

/**
 * Created by 韩博 on 2016/9/13.
 */
public class Test1 {
    public static void main(String[] args) {
        ArrayList<Student> a =new ArrayList<Student>();
        a.add(new Student("张三","20  "));
        a.add(new Student("李四","21  "));
        a.add(new Student("王五","22  "));
        Iterator<Student> it =a.iterator();
        while (it.hasNext()){
            Student x= it.next();
            System.out.print(x);
        }
    }
}


class Student {
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
