package day9_0905.test.father;

/**
 * Created by ���� on 2016/9/5.
 */
public class Test {
    public static void main(String[] args) {
        Father son =new Son();
        son.play();
        Father daughter= new Daughter();
        daughter.play();
        Son s=(Son)son;
        s.eat();
    }
}
