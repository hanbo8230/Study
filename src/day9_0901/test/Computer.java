package day9_0901.test;

import java.util.DoubleSummaryStatistics;

/**
 * Created by ���� on 2016/9/1.
 */
public class Computer {
    String colour;
    String brand;
    double price;

    Computer(String colour) {
        this.colour = colour;
    }

    Computer(String colour, Double price) {
        this.colour = colour;
        this.price = price;
    }

    Computer(String colour, String brand, double price) {
        this.colour = colour;
        this.brand = brand;
        this.price = price;
    }

    public void and(int a, int b) {
        if (a > b) {
            System.out.println(a + "����" + b);
        } else if (a == b) {
            System.out.println(a + "����" + b);
        } else {
            System.out.println(a + "С��" + b);
        }
    }


    public void and(double a, double b) {
        if (a != b) {
            String s = a > b ? (a + "����" + b) : (a + "С��" + b);
            System.out.print(s);
        } else {
            System.out.println(a + "����" + b);
        }
    }

    public void add(int a, int b) {
        System.out.println(a + "����" + b + "�Ľ��Ϊ" + (a + b));
    }

    public void add(double a, double b, double c) {
        double x = a + b + c;
        System.out.println(a + "����" + b + "����" + c + "�Ľ��Ϊ" + x);
    }

    public void add(int a, double b) {
        System.out.println(a + "����" + b + "�Ľ��Ϊ" + (a + b));

    }
}
