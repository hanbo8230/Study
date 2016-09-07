package day9_0907.test.work.jiao_tong;

/**
 * Created by 韩博 on 2016/9/7.
 * 定义一组交通工具类，包括汽车类（AutoMobile）、飞机类(Plane)、船类(Ship)，
 * 其中汽车类有坦克(Tank)、卡车(Truck)、小汽车(Car)，
 * 飞机子类有客机(AirLiner)、战斗机(FighterPlane)，
 * 船类有子类游艇 (Yacht)、军舰(WarShip)，
 * 坦克战斗机和军舰都具有攻击的功能，抽象并定义这些类，
 * 通过抽象类和接口以及对应的实现类实现多态和这些类的测试
 */
public abstract class Vehicle {
    //发动的方式
    public abstract void atart();
    //跑的方式
    public abstract void run();
}
