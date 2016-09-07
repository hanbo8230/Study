package day9_0907.test.animal;

/**
 * Created by º«²© on 2016/9/7.
 */
public abstract class Animal {
    private String name;
    private String wuZhong;
    public abstract void eat();
    public abstract void bark();
    public  void sleep(){
        System.out.println("ÌÉ×ÅË¯");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWuZhong() {
        return wuZhong;
    }

    public void setWuZhong(String wuZhong) {
        this.wuZhong = wuZhong;
    }
}
