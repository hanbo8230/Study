package day9_0906.test.work.Student;

/**
 * Created by ���� on 2016/9/6.
 * 2.����̬�����һ��ѧ����Student,����������������name������age��ѧλdegree��
 * ��ѧ������������������Undergraduate���о�����Graduate,
 * �������������������רҵspecialty,
 * �о�����������������о�����studyDrection��
 * ÿ���඼��������ݵ����������
 * ��һ������ѧ�������࣬�����ж�ѧ����Ϣ�����ķ���judge��
 * �����һ���������ж���Ƶ�����в��ԡ�
 * Ҫ����Խ�����£�
 * ����������  ���䣺23  ѧλ������  רҵ��java
 * ����������   ���䣺27  ѧλ��˶ʿ  �о�����C++
 */
public class Student {
    private String name;
    private int age;
    private String degree;
    public void xue(){
        System.out.println("�ҽ�: " + getName() +
                "\n�ҵ�����: " + getAge() +
                "\nѧλ��" + getDegree());
    }
    public void guanLi(Student x){
        x.xue();
    }
    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
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
}
