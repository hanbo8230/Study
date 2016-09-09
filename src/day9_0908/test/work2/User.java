package day9_0908.test.work2;

/**
 * Created by º«²© on 2016/9/8.
 */
public class User {
    private String name;
    private double miMa;
    private int money;

    User() {

    }

    User(String name, double miMa, int money) {
        setName(name);
        setMiMa(miMa);
        setMoney(money);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMiMa() {
        return miMa;
    }

    public void setMiMa(double miMa) {
        this.miMa = miMa;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
