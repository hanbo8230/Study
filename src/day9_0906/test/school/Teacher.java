package day9_0906.test.school;

/**
 * Created by ���� on 2016/9/6.
 */
public class Teacher {
    private String name;

    public Teacher() {
    }

    public Teacher(String name) {
        setName(name);
    }

    public void jiaoKe() {
        System.out.println("�һ�̿�");
    }
    public void speek(){
        System.out.println("����: "+name);
        jiaoKe();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
