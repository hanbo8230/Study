package day9_0903.work.Pet;

import java.util.Scanner;

/**
 * Created by  on 2016/9/3.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("��ӭ���������");
        Test test = new Test();
        test.tep();
    }

    //ѡ����
    public void tep() {
        Scanner in = new Scanner(System.in);
        Pet pet;
        System.out.print("����������Ҫ���������");
        String name = in.next();
        System.out.print("����������Ҫ����������: " +
                "\n1:è ; 2: ��");
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
            System.out.println("��û����ȷ��ѡ��,��������");
            tep();
        }

    }
}
