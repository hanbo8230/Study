package day9_0903.work.Person;

/**
 * Created by ���� on 2016/9/4.
 * ����һ�����࣬�������ԣ�����name���Ա�sex������gae������ nationality��
 *               �����������Է�eat��˯��sleep������work��
 * ��1��һ��������̳������࣬�������������ԣ���λunit������workAge����д�������������˵Ĺ����ǡ����Լ���ɣ���
 * ��2��һ�����˸ɲ�cadre��̳��Թ����࣬�������������ԣ�ְ�����ӷ��������ᡣ
 * ��3����д�������ֱ������3�����������в��ԡ�
 */
public class Worker extends Person{
    private String unit;
    private int workAge;

    public void work() {
        System.out.println("���ǹ���~~��ȥ��ש��ש");
    }
    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    public String getUnit() {

        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }



}
