package day2_0829.test;

/**
 * Created by ���� on 2016/8/29.
 */
public class Out {
    public static void main(String[] args) {
        daYin(1, 100);
    }

    //��ӡ���������� a �� b ֮�����������
    public static void daYin(int a, int b) {
        System.out.println(a + "��" + b + "֮�������Ϊ: ");
        for (int x = a; x <= b; x++) {
            System.out.print(x + ";\t");
            if (x % 10 == 0) {
                System.out.println();
            }
        }
    }
}
