package day9_0903.work.Person;

/**
 * Created by 韩博 on 2016/9/4.
 * 定义一个人类，包括属性：姓名name、性别sex、年龄gae、国籍 nationality；
 * 包括方法：吃饭eat、睡觉sleep，工作work。
 * （1）一个工人类继承自人类，派生，增加属性：单位unit、工龄workAge；重写工作方法（工人的工作是……自己想吧）。
 * （2）一个工人干部cadre类继承自工人类，派生，增加属性：职务duty ；增加方法：开会meeting。
 * （3）编写主函数分别对上述3类具体人物进行测试。
 */
public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        test.test_Person();
        test.test_Work();
    }

    //测试工人
    public void test_Work() {
        Worker worker = new Worker();
        worker.setName("名字工人");
        worker.setSex("性别男");
        worker.setAge(2048);
        worker.setNationality("中国");
        worker.setUnit("青麦");
        worker.setWorkAge(1);
        worker.eat();
        worker.sleep();
        worker.work();
        System.out.println("名字: " + worker.getName() +
                "\n性别: " + worker.getSex() +
                "\n年龄: " + worker.getAge() +
                "\n国籍: " + worker.getNationality() +
                "\n单位: " + worker.getUnit() +
                "\n工龄: " + worker.getWorkAge());

    }

    //测试人类
    public void test_Person() {
        Person person = new Person();
        person.setName("人类");
        person.setSex("男女都有");
        person.setAge(1024);
        person.setNationality("全球");
        person.eat();
        person.sleep();
        person.work();
        System.out.println("名字: " + person.getName() +
                "\n性别: " + person.getSex() +
                "\n年龄: " + person.getAge() +
                "\n国籍: " + person.getNationality());
    }
}
