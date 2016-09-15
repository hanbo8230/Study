package day9_0912.test.work;


import java.util.ArrayList;

import java.util.Iterator;

/**
 * Created by 韩博 on 2016/9/12.
 * 1) 创建一个List，在List 中增加三个工人，基本信息如下：
 * 姓名 年龄 工资
 * zhang3 18 3000
 * li4 25 3500
 * wang5 22 3200
 * 2) 在li4之前插入一个工人，信息为：姓名：zhao6，年龄：24，工资3300;
 * 3) 删除wang5的信息;
 * 4) 利用for 循环遍历，打印List 中所有工人的信息;
 * 5) 利用迭代遍历，对List中所有的工人调用work方法;
 */
class Go {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add(new Worker("zhang3",+18, 3000));
        a1.add(new Worker("li4",25,3500));
        a1.add(new Worker("wang5",22,3200));
        //在li4前插入一个工人
        a1.add(1,new Worker("zhao6",24,3300));

        //删除wang5
        a1.remove(3);
        sop(a1);
        //利用for 循环遍历，打印List 中所有工人的信息;
        for(Object y:a1){
            sop(y);
        }
        //利用迭代遍历，对List中所有的工人调用work方法;
        Iterator it =a1.iterator();
        while (it.hasNext()){
            ((Worker)it.next()).work();
        }

    }


    public static void sop(Object obj) {
        System.out.println(obj);
    }



}
class Worker {
    private int age;
    private String name;
    private double salary;



    public Worker() {
    }

    public Worker(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String toString(){
        return getName()+"\t"+getAge()+"\t"+getSalary()+"\n";
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + "work");
    }
}

