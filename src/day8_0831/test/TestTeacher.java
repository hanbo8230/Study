package day8_0831.test;

import day8_0830.test.*;

/**
 * Created by ���� on 2016/8/31.
 */
public class TestTeacher {
    public static void main(String[] args) {
        Teacher teacher= new Teacher();
        teacher.setName("����");
        teacher.setAge(99);
        System.out.print(teacher.getName()+teacher.getAge());
    }
}
