package day8_0831.test.work;

/**
 * Created by 韩博 on 2016/8/31.
 * 要求:封装思想：创建一个Computer类，这个类的属性有：价格price 颜色colour 重量weight 品牌brand.
 * 通过new 对象给属性赋值，然后将属性的所有值通过创建某些方法来返回！
 * 并在main方法中调用这个方法来获取任意属性的值！
 * 最后通过调用返回的属性值打印出一台电脑的所有信息
 */
public class Computer {
    private double price;
    private String colour;
    private double weight;
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getWeight() {

        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColour() {

        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    Computer(double price, String colour, double weight, String brand) {
        this.price = price;
        this.colour = colour;
        this.weight = weight;
        this.brand = brand;

    }


}
