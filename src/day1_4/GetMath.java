package day1_4;

/**
 * Created by ���� on 2016/8/27.
 */
/*
* Ҫ��:��дһ�����򣬼���һά�����е����ֵ����Сֵ�����ֵ��
* */
public class GetMath {
    public static void main(String[] args) {
        get_go();
    }

    public static void get_go() {
        //��ȡ��Сֵ
        int arr[] = {2, 1, 6, 3, 5, 4};      //����һ������
        int min = arr[0];
        for (int x = 1; x < arr.length; x++) {        //��������
            if (min > arr[x]) {                      //�жϺ�ߵ����Ƿ��0��
                min = arr[x];     //�Ѵ������ֵ��max��ȥ�ͺ�ߵı�
            }
        }
        System.out.println("��������СֵΪ: " + min);

        //��ȡ���ֵ
        int max = 0;
        for (int x = 1; x < arr.length; x++) {        //��������
            if (max < arr[x]) {                      //�жϺ�ߵ����Ƿ��0��
                max = arr[x];     //�Ѵ������ֵ��max��ȥ�ͺ�ߵı�
            } else {                                    //�������һ�����Ļ�
                max = max;
            }
        }
        System.out.println("���������ֵΪ: " + max);

        //��ȡ��ֵ
        int cha = max - min;
        System.out.println("���������ֵ����Сֵ�Ĳ�ֵ��: " + cha);
    }
}
