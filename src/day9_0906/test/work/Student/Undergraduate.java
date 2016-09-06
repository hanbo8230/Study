package day9_0906.test.work.Student;

/**
 * Created by 韩博 on 2016/9/6.
 * 2.（多态）设计一个学生类Student,包括的属性有姓名name，年龄age，学位degree。
 * 由学生类派生出本科生类Undergraduate和研究生类Graduate,
 * 本科生类包含的属性有专业specialty,
 * 研究生类包括的属性有研究方向studyDrection。
 * 每个类都有相关数据的输出方法。
 * 有一个类是学生管理类，该类有对学生信息评估的方法judge。
 * 最后在一个测试类中对设计的类进行测试。
 * 要求测试结果如下：
 * 姓名：王军  年龄：23  学位：本科  专业：java
 * 姓名：刘君   年龄：27  学位：硕士  研究方向：C++
 */
public class Undergraduate extends Student {
    private String specialty;

    public Undergraduate(String name, int age,String degree, String specialty) {
        setName(name);
        setAge(age);
        setDegree(degree);
        setSpecialty(specialty);
    }
    public void xue() {
        System.out.println("我叫: " + getName() +
                "\n我的年龄: " + getAge() +
                "\n学位：" + getDegree() +
                "研究方向: " + getSpecialty());
    }
    public String getSpecialty() {
        return specialty;
    }
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
