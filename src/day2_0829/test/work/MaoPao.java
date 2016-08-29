package day2_0829.test.work;

/**
 * Created by 韩博 on 2016/8/29.
 * 要求:写一个一维数组int a = {9,5,3,4,2,6}冒泡排序的方法。
 */
public class MaoPao {
    public static void main(String[] args){
        int[] arr = {9,5,3,4,2,6};
        maoPao(arr);
    }
    public static void maoPao(int arr[]) {
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
    }
}