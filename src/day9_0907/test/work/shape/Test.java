package day9_0907.test.work.shape;

/**
 * Created by ���� on 2016/9/7.
 * ��дһ��������Shape����������ͼ������ĳ��󷽷���
 * �ٷֱ���Shape������Circle��Բ����Rectangle�����Σ���
 * �����������а��ղ�ͬͼ�ε�������㹫ʽ��ʵ��Shape���м�������ķ���
 */
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.go(new Circle(2));
        test.go(new Rectangle(2));
    }

    public void go(Shape x) {
        double y = x.add();
        System.out.println(y);
    }
}
