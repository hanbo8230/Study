package day9_0907.test.teacher;

/**
 * Created by ���� on 2016/9/7.
 */
public class JavaTeacher extends  Teacher{

    JavaTeacher(String name){
        setName(name);
    }
    @Override
    public void jiao() {
        System.out.println("java�γ�");
    }

    @Override
    public void jieShao() {
        System.out.print("�ҵ�������: "+getName()+"\n�һ��: ");
        jiao();

    }
}
