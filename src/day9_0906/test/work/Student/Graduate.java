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
public class Graduate extends Student {
    private String studyDrection;

    public Graduate(String name, int age, String degree,String studyDrection) {
        setName(name);
        setAge(age);
        setDegree(degree);
        setStudyDrection(studyDrection);
    }
    public void xue() {
        System.out.println("�ҽ�: " + getName() +
                "\n�ҵ�����: " + getAge() +
                "\nѧλ��" + getDegree() +
                "\nרҵ: " + getStudyDrection());
    }

    public String getStudyDrection() {
        return studyDrection;
    }

    public void setStudyDrection(String studyDrection) {
        this.studyDrection = studyDrection;
    }
}
