package day1_4;

/**
 * Created by 韩博 on 2016/8/27.
 * 要求:3*4的二维数组里的每行的元素累乘，每行的累乘值再累加。
 * 思想:1先定义一个3*4二维数组
 * 2利用嵌套for循环遍历数组中的元素
 * 3在遍历的过程中使其每个一维数组的内部数据相乘
 * 4定义一个变量,用于储存每行元素的相乘结果并且把乘积的的结果相加
 */
public class Ride {
    public static void main(String[] args) {
        go();
    }

    public static void go() {
        int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int sum = 0;
        for (int x = 1; x < arr.length + 1; x++) {  //双for循环遍历所有元素
            int ride = 0;
            int ride1 = 1;
            for (int y = 1; y < arr[x - 1].length + 1; y++) {
                ride = arr[x - 1][y - 1];
                ride1 = ride1 * ride;      //遍历过程中计算每一个一维数组的乘积
            }
            sum += ride1;      //计算出所有数组乘积的和
        }
        System.out.println(sum);
    }
}
