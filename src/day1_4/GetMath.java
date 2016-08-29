package day1_4;

/**
 * Created by 韩博 on 2016/8/27.
 */
/*
* 要求:编写一个程序，计算一维数组中的最大值、最小值及其差值。
* */
public class GetMath {
    public static void main(String[] args) {
        get_go();
    }

    public static void get_go() {
        //获取最小值
        int arr[] = {2, 1, 6, 3, 5, 4};      //定义一个数组
        int min = arr[0];
        for (int x = 1; x < arr.length; x++) {        //遍历数组
            if (min > arr[x]) {                      //判断后边的数是否比0大
                min = arr[x];     //把大的数赋值给max再去和后边的比
            }
        }
        System.out.println("数组中最小值为: " + min);

        //获取最大值
        int max = 0;
        for (int x = 1; x < arr.length; x++) {        //遍历数组
            if (max < arr[x]) {                      //判断后边的数是否比0大
                max = arr[x];     //把大的数赋值给max再去和后边的比
            } else {                                    //如如果第一个最大的话
                max = max;
            }
        }
        System.out.println("数组中最大值为: " + max);

        //获取差值
        int cha = max - min;
        System.out.println("数组中最大值和最小值的差值是: " + cha);
    }
}
