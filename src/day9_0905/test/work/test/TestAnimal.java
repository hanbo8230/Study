package day9_0905.test.work.test;

import day9_0901.test.work.*;
import day9_0905.test.work.run.*;
import day9_0905.test.work.run.Dog;


/**
 * Created by ���� on 2016/9/5.
 * �����ʵ�ֶ�������ļ̳й�ϵ��
 * ���Animal��������Ϊ���ԣ�eat����˯����sleep��
 * ������������ӣ�Rabbit�����ϻ���Tiger��������Dog��
 * ��Щ����Ե���Ϊ������ͬ�����ӳԲݣ��ϻ�����, ���Թ���������˯������Ϊ��һ�µġ�
 * 1����ͨ���̳�ʵ���������󣬲���д������AnimalTest���в��ԡ�
 * 2����������ת�Ͷ��������д�ķ���
 */
public class TestAnimal {
    public static void main(String[] args) {
        //����ת��
        Animal dog = new Dog();
        dog.eat();
        dog.sleep();
        Animal rabbit = new Rabbit();
        rabbit.eat();
        rabbit.sleep();
        Animal tiger = new Tiger();
        tiger.eat();
        tiger.sleep();

        Dog d =(Dog) dog;
        d.kanJia();

        int y=1;
        double x = 1;
        System.out.print((int)(x+y));

    }

}
