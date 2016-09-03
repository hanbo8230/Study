package day9_0903.work.Pet;

/**
 * Created by 韩博 on 2016/9/3.
 * 思路:创建一个宠物父类,类中包括属性有   1类型 breed 2 健康值 health 3亲密度 conhesion 4 名字 name
 * 都会吃东西
 */
public class Pet {
    private String name;
    private String breed;
    private String type;
    private int health;
    private int conhesion;

    public Pet() {

    }

    public void speak() {
        System.out.println("我的名字叫: " + name +
                ",我的健康值是 " + health +
                ",我何主人亲密度是: " + conhesion +
                ",我的类型是: " + breed);
    }




    public int getConhesion() {
        return conhesion;
    }

    public void setConhesion(int conhesion) {
        this.conhesion = conhesion;
    }

    public int getHealth() {

        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getBreed() {

        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
