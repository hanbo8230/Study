package day9_0907.test.teacher;

/**
 * Created by º«²© on 2016/9/7.
 */
public abstract class Teacher {
    private String name;
    private int age;

    public abstract void jiao();
    public abstract void jieShao();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
