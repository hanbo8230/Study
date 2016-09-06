package day9_0906.test.school;

/**
 * Created by ∫´≤© on 2016/9/6.
 */
public class School {
    public static void main(String[] args) {
        Dosom dosom=new Dosom();
        dosom.go(new SqlTeacher(),"¿œ’≈");
    }
}
class Dosom{
    public void go(Teacher x, String name){
        x.setName(name);
        x.speek();
    }
}

