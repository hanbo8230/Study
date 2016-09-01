package day8_0831.test.work;

/**
 * Created by 韩博 on 2016/8/31.
 * 要求:请使用封装来写一个汽车类，
 * 属性：价格price，颜色colour，时速speed，品牌brand;通过某一方法实现汽车的加速和减速，
 * 每次加速或者减速都需要打印当前的车速
 * 汽车的最高时速为200km／h，最低时速为0
 * 最后打印出：“一辆黑色的奔驰以每小时100公里奔跑在路上”。
 */
public class Car {
    private double price;
    private String colour;
    private double speed = 0;
    private String brand;

    public void up_Speed(double speed) {
        if (this.speed + speed < 200) {
            this.speed += speed;
                System.out.println("当前车速为: " + speed);
        } else if(this.speed + speed > 200){
            System.out.println("因限速的原因,我发达到每小时"+
                    (this.speed += speed)+"公里,现在时速为每小时200公里");
        }
    }

    public void down_Speed(double speed) {
        if (this.speed > 0) {
            this.speed += speed;
            System.out.println("当前车速为: " + speed);
        } else if (this.speed < speed) {
            System.out.println("车停下来了");
        }
    }

    public void state() {
        if (this.speed > 0 &&this.speed <= 200) {
            System.out.print("一辆" + this.colour + "的" + this.brand + "以每小时" + this.speed + "公里奔跑在路上");
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
