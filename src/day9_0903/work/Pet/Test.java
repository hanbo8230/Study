package day9_0903.work.Pet;

import java.util.Scanner;

/**
 * Created by  on 2016/9/3.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("欢迎来到宠物店");
        Test test = new Test();
        test.tep();
    }

    //选物种
    public void tep() {
        Scanner in = new Scanner(System.in);
        Pet pet;
        System.out.print("请输入你想要宠物的名字");
        String name = in.next();
        System.out.print("请输入你想要领养的种类: " +
                "\n1:猫 ; 2: 狗");
        int tep = in.nextInt();

        if (tep == 1) {
            pet = new Cat();
            pet.setName(name);
            pet.selectBreed();
            pet.selecHealth();
            pet.speak();

        } else if (tep == 2) {
            pet = new Dog();
            pet.setName(name);
            pet.selectBreed();
            pet.selecHealth();
            pet.speak();
        } else {
            System.out.println("您没有正确的选择,请重输入");
            tep();
        }

    }
}
