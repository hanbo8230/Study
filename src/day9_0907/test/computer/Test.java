package day9_0907.test.computer;

/**
 * Created by º«²© on 2016/9/7.
 */
public class Test {
    public static void main(String[] args) {
        Test test =new Test();
        test.show(new ShengKa());
    }
    public void show(Computer x){
        x.start();
        x.stop();
    }
}
