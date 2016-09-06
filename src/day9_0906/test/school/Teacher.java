package day9_0906.test.school;

/**
 * Created by 韩博 on 2016/9/6.
 */
public class Teacher {
    private String name;

    public Teacher() {
    }

    public Teacher(String name) {
        setName(name);
    }

    public void jiaoKe() {
        System.out.println("我会教课");
    }
    public void speek(){
        System.out.println("名字: "+name);
        jiaoKe();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
