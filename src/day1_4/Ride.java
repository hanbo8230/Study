package day1_4;

/**
 * Created by ���� on 2016/8/27.
 * Ҫ��:3*4�Ķ�ά�������ÿ�е�Ԫ���۳ˣ�ÿ�е��۳�ֵ���ۼӡ�
 * ˼��:1�ȶ���һ��3*4��ά����
 * 2����Ƕ��forѭ�����������е�Ԫ��
 * 3�ڱ����Ĺ�����ʹ��ÿ��һά������ڲ��������
 * 4����һ������,���ڴ���ÿ��Ԫ�ص���˽�����Ұѳ˻��ĵĽ�����
 */
public class Ride {
    public static void main(String[] args) {
        go();
    }

    public static void go() {
        int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int sum = 0;
        for (int x = 1; x < arr.length + 1; x++) {  //˫forѭ����������Ԫ��
            int ride = 0;
            int ride1 = 1;
            for (int y = 1; y < arr[x - 1].length + 1; y++) {
                ride = arr[x - 1][y - 1];
                ride1 = ride1 * ride;      //���������м���ÿһ��һά����ĳ˻�
            }
            sum += ride1;      //�������������˻��ĺ�
        }
        System.out.println(sum);
    }
}
