package day8_0831.test.work;

/**
 * Created by ���� on 2016/8/31.
 * Ҫ��:��ʹ�÷�װ��дһ�������࣬
 * ���ԣ��۸�price����ɫcolour��ʱ��speed��Ʒ��brand;ͨ��ĳһ����ʵ�������ļ��ٺͼ��٣�
 * ÿ�μ��ٻ��߼��ٶ���Ҫ��ӡ��ǰ�ĳ���
 * ���������ʱ��Ϊ200km��h�����ʱ��Ϊ0
 * ����ӡ������һ����ɫ�ı�����ÿСʱ100���ﱼ����·�ϡ���
 */
public class Car {
    private double price;
    private String colour;
    private double speed = 0;
    private String brand;

    public void up_Speed(double speed) {
        if (this.speed + speed < 200) {
            this.speed += speed;
                System.out.println("��ǰ����Ϊ: " + speed);
        } else if(this.speed + speed > 200){
            System.out.println("�����ٵ�ԭ��,�ҷ��ﵽÿСʱ"+
                    (this.speed += speed)+"����,����ʱ��ΪÿСʱ200����");
        }
    }

    public void down_Speed(double speed) {
        if (this.speed > 0) {
            this.speed += speed;
            System.out.println("��ǰ����Ϊ: " + speed);
        } else if (this.speed < speed) {
            System.out.println("��ͣ������");
        }
    }

    public void state() {
        if (this.speed > 0 &&this.speed <= 200) {
            System.out.print("һ��" + this.colour + "��" + this.brand + "��ÿСʱ" + this.speed + "���ﱼ����·��");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpeed() {

        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
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
}
