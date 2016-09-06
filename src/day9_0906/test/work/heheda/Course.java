//package day9_0906.test.work;
//
//import java.util.Scanner;
//
//
///**
// * Created by 韩博 on 2016/9/6.
// * 创建一个课程Course类，该类的属性有：
// * 课程名courseName;
// * 一个存储该课程学生的数组 String[] student = new String[100] (假设可以存储100个学生);
// * 学生的个数numberOfStudent ，默认值为0；
// * 方法有：构造方法Course；
// * 返回课程名的方法getCourseName；
// * 返回这门课程的学生的方法getStudent（提示返回值类型为String[]）；
// * 给这门课添加学生的方法addStudent;
// * 给这门课删除学生的方法dropStudent;      //
// * 返回这门课程的学生人数getNumberOfStudent;
// */
//public class Course {
//    private String courseName;
//    private int numberOfStudent = 0;
//    Scanner in = new Scanner(System.in);
//    Student student[] = new Student[numberOfStudent];
//
//    Course() {
//    }
//    //添加学生的方法
//    public void addStudent(int x){
//        numberOfStudent +=x;
//    }
//    //删除学生的方法
//    public void dropStudent(int x){
//        numberOfStudent -=x;
//    }
//    //学生赋值的方法
//    public void setStudent() {
//        for (int x = 0; x < numberOfStudent; x++) {
//            System.out.println("请输入第"+(x+1)+"个学生的姓名");
//            String y = in.next();
//            student[x] = new Student(y);
//        }
//    }
//
//
//
//
//
//    public int getNumberOfStudent() {
//        return numberOfStudent;
//    }
//
//    public void setNumberOfStudent(int numberOfStudent) {
//        this.numberOfStudent = numberOfStudent;
//    }
//
//    public String getCourseName() {
//
//        return courseName;
//    }
//
//    public void setCourseName(String courseName) {
//        this.courseName = courseName;
//    }
//
//
//}
