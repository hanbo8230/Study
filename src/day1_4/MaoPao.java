package day1_4;

/**
 * Created by ���� on 2016/8/28.
 * Ҫ��:int[] arr = { 3, 2, 9, 4, 6, 8, 7, 5,1 };
 * ��������������������С�����˳���ڿ���̨��ӡ�������ð������
 * ˼·:1,�ȴ���һ������,�õ�һ�����ֺ͵ڶ������ֽ���λ��ת��;
 * 2,�����������������Ԫ�غͺ�ߵ����Ƚ�,С���û���ǰ��
 */
public class MaoPao {
    public static void main(String[] args) {
        int[] arr = {3, 2, 9, 4, 6, 8, 7, 5, 1};
        System.out.print("arr��Ԫ������ǰΪ: ");
        for (int n = 0; n < arr.length; n++) {
            int m = arr[n];
            System.out.print(arr[n] + "; ");
        }
        System.out.println();
        for (int x = 0; x < arr.length - 1; x++) {
            for (int y = 1 + x; y < arr.length; y++) {
                int c = 0;
                if (arr[x] > arr[y]) {
                    c = arr[y];
                    arr[y] = arr[x];
                    arr[x] = c;
                }
            }
        }
        System.out.print("arr��Ԫ�������Ϊ: ");
        for (int n = 0; n < arr.length; n++) {
            int m = arr[n];
            System.out.print(arr[n] + "; ");
        }
    }
}
