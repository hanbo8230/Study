package day9_0903.work.Person;

/**
 * Created by ���� on 2016/9/4.
 * ����һ�����࣬�������ԣ�����name���Ա�sex������gae������ nationality��
 * �����������Է�eat��˯��sleep������work��
 * ��1��һ��������̳������࣬�������������ԣ���λunit������workAge����д�������������˵Ĺ����ǡ����Լ���ɣ���
 * ��2��һ�����˸ɲ�cadre��̳��Թ����࣬�������������ԣ�ְ��duty �����ӷ���������meeting��
 * ��3����д�������ֱ������3�����������в��ԡ�
 */
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.test_Person();
        test.test_Work();
    }

    //���Թ���
    public void test_Work() {
        Worker worker = new Worker();
        worker.setName("���ֹ���");
        worker.setSex("�Ա���");
        worker.setAge(2048);
        worker.setNationality("�й�");
        worker.setUnit("����");
        worker.setWorkAge(1);
        worker.eat();
        worker.sleep();
        worker.work();
        System.out.println("����: " + worker.getName() +
                "\n�Ա�: " + worker.getSex() +
                "\n����: " + worker.getAge() +
                "\n����: " + worker.getNationality() +
                "\n��λ: " + worker.getUnit() +
                "\n����: " + worker.getWorkAge());

    }

    //��������
    public void test_Person() {
        Person person = new Person();
        person.setName("����");
        person.setSex("��Ů����");
        person.setAge(1024);
        person.setNationality("ȫ��");
        person.eat();
        person.sleep();
        person.work();
        System.out.println("����: " + person.getName() +
                "\n�Ա�: " + person.getSex() +
                "\n����: " + person.getAge() +
                "\n����: " + person.getNationality());
    }
}
