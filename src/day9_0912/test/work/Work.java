package day9_0912.test.work;


import java.util.ArrayList;

import java.util.Iterator;

/**
 * Created by ���� on 2016/9/12.
 * 1) ����һ��List����List �������������ˣ�������Ϣ���£�
 * ���� ���� ����
 * zhang3 18 3000
 * li4 25 3500
 * wang5 22 3200
 * 2) ��li4֮ǰ����һ�����ˣ���ϢΪ��������zhao6�����䣺24������3300;
 * 3) ɾ��wang5����Ϣ;
 * 4) ����for ѭ����������ӡList �����й��˵���Ϣ;
 * 5) ���õ�����������List�����еĹ��˵���work����;
 */
class Go {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add(new Worker("zhang3",+18, 3000));
        a1.add(new Worker("li4",25,3500));
        a1.add(new Worker("wang5",22,3200));
        //��li4ǰ����һ������
        a1.add(1,new Worker("zhao6",24,3300));

        //ɾ��wang5
        a1.remove(3);
        sop(a1);
        //����for ѭ����������ӡList �����й��˵���Ϣ;
        for(Object y:a1){
            sop(y);
        }
        //���õ�����������List�����еĹ��˵���work����;
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

