package day1_4;

/**
 * !!!!!!注意:本程序不是冒泡排序,冒泡的方原理:相邻两个数比较,把大(小)的数找出来
 * 然后和这个数后边的数字进行交换位置,直到最后
 * 然后从第二个数字开始,继续进行相比较,并交换位置
 * PS:更改过后未被注释的程序是冒泡排序
 * <p>
 * Created by 韩博 on 2016/8/28.
 * 要求:int[] arr = { 3, 2, 9, 4, 6, 8, 7, 5,1 };
 * 将这个数组里面的数按从小到大的顺序在控制台打印输出。（冒泡排序）
 * 思路:1,先创建一个方法,让第一个数字和第二个数字进行位置转换;
 * 2,遍历这个数组依次用元素和后边的作比较,小的置换到前边
 */
public class MaoPao {
    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 3, 19, 11, 12};
        System.out.print("arr的元素排序后为: ");
        for (int m : arr) {
            System.out.print(m + "; ");
        }
        System.out.println();
        for (int x = 0; x < arr.length; x++) {
            for (int y = 1; y < arr.length - x; y++) {
                int c = 0;
                if (arr[y - 1] > arr[y]) {
                    c = arr[y];
                    arr[y] = arr[y - 1];
                    arr[y - 1] = c;
                }
            }
        }
        System.out.print("arr的元素排序后为: ");
        for (int n : arr) {
            System.out.print(n + "; ");
        }
//        int[] arr = {3, 2, 9, 4, 6, 8, 7, 5, 1};
//        System.out.print("arr的元素排序前为: ");
//        for (int n = 0; n < arr.length; n++) {
//            int m = arr[n];
//            System.out.print(arr[n] + "; ");
//        }
//        System.out.println();
//        for (int x = 0; x < arr.length - 1; x++) {
//            for (int y = 1 + x; y < arr.length; y++) {
//                int c = 0;
//                if (arr[x] > arr[y]) {
//                    c = arr[y];
//                    arr[y] = arr[x];
//                    arr[x] = c;
//                }
//            }
//        }
//        System.out.print("arr的元素排序后为: ");
//        for (int n = 0; n < arr.length; n++) {
//            int m = arr[n];
//            System.out.print(arr[n] + "; ");
//        }
    }
}

