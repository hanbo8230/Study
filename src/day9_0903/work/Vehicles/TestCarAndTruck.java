package day9_0903.work.Vehicles;

/**
 * Created by 韩博 on 2016/9/3.
 *  *  * A.定义一个名为Vehicles（交通工具）的父类，
 *      该类中应包含String类型的成员属性brand（商标）和color（颜色），
 *      还应包含成员方法run（行驶，在控制台显示“我已经开动了”）
 *      和showInfo（显示信息，在控制台显示商标和颜色），并编写构造方法初始化其成员属性。
 * B.编写Car（小汽车）类继承于Vehicles类，增加int型成员属性seats（座位），
 *      还应增加成员方法showCar（在控制台显示小汽车的信息），并编写构造方法。
 * C.编写Truck（卡车）类继承于Vehicles类，增加float型成员属性load（载重），
 *      还应增加成员方法showTruck（在控制台显示卡车的信息），并编写构造方法。
 * D.在main方法中测试以上各类。
 */
public class TestCarAndTruck {
    public static void main(String[] args) {
        Car car=new Car();
        car.setBrand("大奔");
        car.setColor("屎黄");
        car.setSeats(1024);
        car.showCar();
        Truck truck =new Truck();
        truck.setBrand("大卡");
        truck.setColor("帽绿");
        truck.setLoad(2048L);
        truck.showTruck();

    }
}
