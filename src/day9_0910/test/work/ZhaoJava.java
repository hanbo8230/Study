package day9_0910.test.work;

/**
 * Created by ���� on 2016/9/10.
 * �ҳ��ַ������м���java��
 * String s="hijavahehejavahejava";
 */
public class ZhaoJava {
    public static void main(String[] args) {
        String s = "hijavahehejavahejava";
        int y = 0;
        int x = s.indexOf("java");
        for (; x != -1; x = s.indexOf("java", x + 1)) {
            y++;
        }
        sop(y);


    }

    public static void sop(Object obj) {
        System.out.println(obj);
    }
}
