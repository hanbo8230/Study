package day9_0903.work.Pet;

import java.util.Scanner;

/**
 * Created by 韩博 on 2016/9/3.
 */
public class Dog extends Pet {
    Scanner in = new Scanner(System.in);

//选择品种
    public void selectBreed() {
        System.out.print("请选择你想狗的品种" +
                "\n1: 聪明的拉的不多" +
                "\n2: 犯二哈士奇");
        int x = in.nextInt();


            switch (x) {
                case 1:
                    super.setBreed("聪明的拉的不多");
                    System.out.println("您选择了: 聪明的拉的不多");
                    break;
                case 2:
                    super.setBreed("犯二哈士奇");
                    System.out.println("您选择了: 犯二哈士奇");
                    break;
                default:
                    System.out.print("您没有正正确的选择,请重新选择");
                    selectBreed();
            }

    }

}