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
public class Undergraduate extends Student {
    private String specialty;

    public Undergraduate(String name, int age,String degree, String specialty) {
        setName(name);
        setAge(age);
        setDegree(degree);
        setSpecialty(specialty);
    }
    public void xue() {
        System.out.println("�ҽ�: " + getName() +
                "\n�ҵ�����: " + getAge() +
                "\nѧλ��" + getDegree() +
                "�о�����: " + getSpecialty());
    }
    public String getSpecialty() {
        return specialty;
    }
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
