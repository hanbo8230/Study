package day9_0903.work.Person;

/**
 * Created by ���� on 2016/9/4.
 * ����һ�����࣬�������ԣ�����name���Ա�sex������gae������ nationality��
 *               �����������Է�eat��˯��sleep������work��
 * ��1��һ��������̳������࣬�������������ԣ���λunit������workAge����д�������������˵Ĺ����ǡ����Լ���ɣ���
 * ��2��һ�����˸ɲ�cadre��̳��Թ����࣬�������������ԣ�ְ��duty �����ӷ���������meeting��
 * ��3����д�������ֱ������3�����������в��ԡ�
 */
public class Cadre extends Worker{
    private String duty;

    public void meeting(){
        System.out.println("���Ǹɲ�~~�һῪ��!!");
    }


    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }
}
