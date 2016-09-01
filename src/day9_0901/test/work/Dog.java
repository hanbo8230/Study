package day9_0901.test.work;

/**
 * Created by 韩博 on 2016/9/1.
 */

public class Dog {          //pet: 宠物
    private String name;      //姓名
    private int health;     //健康值
    private int cohesion;   //亲密度
    private String breed;  //品种


    //选品种
    public void breed(int x) {
        switch (x) {
            case 1:
                setBreed("聪明的拉布拉多");
                break;
            case 2:
                setBreed("犯二的哈士奇");
                break;
            default:
                System.out.println("您的输入有误");
        }
    }

    //选健康值
    public void health(int x) {
        if (x > 1 && x <= 100) {
            this.health = x;
        } else {
            this.health = 60;
        }

    }

    //宠物自白
    public void speak(String name) {
        System.out.println("我叫" + name + ", 我的健康值为: " +
                this.health + "我的类型是: " + this.breed);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getCohesion() {

        return cohesion;
    }

    public void setCohesion(int cohesion) {
        this.cohesion = cohesion;
    }

    public int getHealth() {

        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
