package day9_0901.test.work;

import java.util.Scanner;


/**
 * Created by ���� on 2016/9/1.
 */
public class Pet {          //pet: ����


    private String name;      //����
//    private int health;     //����ֵ
//    private int cohesion;   //���ܶ�
//    private String breed;  //Ʒ��

    public void go() {
        Dog dog = new Dog();
        Cat cat = new Cat();
        System.out.println("��ӭ���������");
        System.out.print("����������Ҫ�������������: ");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        this.name =name;
        System.out.println("��ѡ������Ҫ�������������" +
                "1: ����" +
                "2: èè");
        int x = in.nextInt();
        if (x == 1) {
            System.out.println("��ѡ����Ҫ�Ĺ���" +
                    "1: ��������������" +
                    "2: �����Ĺ�ʿ��");
            int a = in.nextInt();
            dog.breed(a);
            System.out.println("��ѡ����Ҫ�Ľ���ֵ(1-100֮��,Ĭ����60)");
            int b = in.nextInt();
            dog.health(b);
            dog.speak(this.name);
        } else if (x == 2) {
            System.out.println("��ѡ����Ҫ��èè" +
                    "1: �ʷʵĲ�˹è" +
                    "2: �����ӷ�è");
            int c = in.nextInt();
            cat.breed(c);
            System.out.println("��ѡ����Ҫ�Ľ���ֵ(1-100֮��,Ĭ����60)");
            int d = in.nextInt();
            cat.health(d);
            cat.speak(this.name);
        } else {
            System.out.println("����ѡ������");
        }


    }


}
