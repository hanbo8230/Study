package day9_0903.work.AddMath;

/**
 * Created by ���� on 2016/9/3.
 * 6.ʹ�ù��췽�������ر�д������Ŀ
 * ����һ���࣬Ϊ���ඨ���������캯�����ֱ�ִ�����в�����
 * 1��������������ֵ���ҳ����нϴ��һ��ֵ
 * 2����������doubleֵ�������˻�
 * 3�����������ַ���ֵ��������Ƿ���ͬ
 * 4����main�����в��Թ��캯���ĵ���
 */
public class Num {
    public Num() {
    }

    public Num(String a, String b) {
        String c = a==b?(" ��������ͬ"):(" �����ֲ�ͬ");
        System.out.println(a + " �� " + b + c);
    }

    //��������doubleֵ�������˻�
    public Num(double a, double b, double c) {
        double d = a * b * c;
        System.out.println(a + " �� " + b + " �� " + c + " �ĳ˻���: " + d);
    }

    //������������ֵ���ҳ����нϴ��һ��ֵ
    public Num(int a, int b) {
        int c = a > b ? a : b;
        System.out.println(a + " �� " + b + " �����ֵ��: " + c);
    }

}
