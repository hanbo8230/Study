package day8_0831.test.work;

/**
 * Created by ���� on 2016/8/31.
 * Ҫ��:��װ˼�룺����һ��Computer�࣬�����������У��۸�price ��ɫcolour ����weight Ʒ��brand.
 * ͨ��new ��������Ը�ֵ��Ȼ�����Ե�����ֵͨ������ĳЩ���������أ�
 * ����main�����е��������������ȡ�������Ե�ֵ��
 * ���ͨ�����÷��ص�����ֵ��ӡ��һ̨���Ե�������Ϣ
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
