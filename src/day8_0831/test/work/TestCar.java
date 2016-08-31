package day8_0831.test.work;

/**
 * Created by 韩博 on 2016/8/31.
 * 属性：价格price，颜色colour，时速speed，品牌brand;通过某一方法实现汽车的加速和减速，
 * 每次加速或者减速都需要打印当前的车速
 * 汽车的最高时速为200km／h，最低时速为0
 * 最后打印出：“一辆黑色的奔驰以每小时100公里奔跑在路上”。
 */
public class TestCar {
    public static void main(String[] args) {
    Car car=new Car();
        car.setColour("黑色");
        car.setBrand("奔驰");
        car.up_Speed(100);
        car.state();
    }
}
