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
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.go();
    }

    public void go() {
        Student student = new Student();
        student.guanLi(new Graduate("����", 23, "����","java"));
       student.guanLi(new Undergraduate("����",27,"˶ʿ","C++"));
    }
}
