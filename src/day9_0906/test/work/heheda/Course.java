//package day9_0906.test.work;
//
//import java.util.Scanner;
//
//
///**
// * Created by ���� on 2016/9/6.
// * ����һ���γ�Course�࣬����������У�
// * �γ���courseName;
// * һ���洢�ÿγ�ѧ�������� String[] student = new String[100] (������Դ洢100��ѧ��);
// * ѧ���ĸ���numberOfStudent ��Ĭ��ֵΪ0��
// * �����У����췽��Course��
// * ���ؿγ����ķ���getCourseName��
// * �������ſγ̵�ѧ���ķ���getStudent����ʾ����ֵ����ΪString[]����
// * �����ſ����ѧ���ķ���addStudent;
// * �����ſ�ɾ��ѧ���ķ���dropStudent;      //
// * �������ſγ̵�ѧ������getNumberOfStudent;
// */
//public class Course {
//    private String courseName;
//    private int numberOfStudent = 0;
//    Scanner in = new Scanner(System.in);
//    Student student[] = new Student[numberOfStudent];
//
//    Course() {
//    }
//    //���ѧ���ķ���
//    public void addStudent(int x){
//        numberOfStudent +=x;
//    }
//    //ɾ��ѧ���ķ���
//    public void dropStudent(int x){
//        numberOfStudent -=x;
//    }
//    //ѧ����ֵ�ķ���
//    public void setStudent() {
//        for (int x = 0; x < numberOfStudent; x++) {
//            System.out.println("�������"+(x+1)+"��ѧ��������");
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
