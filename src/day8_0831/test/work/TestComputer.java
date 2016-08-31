package day8_0831.test.work;

/**
 * Created by 韩博 on 2016/8/31.
 * 要求:封装思想：创建一个Computer类，这个类的属性有：价格price 颜色colour 重量weight 品牌brand.
 * 最后通过调用返回的属性值打印出一台电脑的所有信息
 */
public class TestComputer {
    public static void main(String[] args) {
        Computer computer=new Computer(1024,"屎黄",250,"添屎牌");
        double a = computer.getPrice();
        System.out.println("电脑价格是: "+ a+"万");
        String b= computer.getColour();
        System.out.println("电脑颜色是: "+ b);
        double c= computer.getWeight();
        System.out.println("电脑重量是: "+ c +"吨");
        String d= computer.getBrand();
        System.out.println("电脑品牌是: "+ d);


    }
}
