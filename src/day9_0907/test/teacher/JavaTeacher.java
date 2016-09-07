package day9_0907.test.teacher;

/**
 * Created by 韩博 on 2016/9/7.
 */
public class JavaTeacher extends  Teacher{

    JavaTeacher(String name){
        setName(name);
    }
    @Override
    public void jiao() {
        System.out.println("java课程");
    }

    @Override
    public void jieShao() {
        System.out.print("我的名字是: "+getName()+"\n我会教: ");
        jiao();

    }
}
