package day9_0903.work.Person;

/**
 * Created by 韩博 on 2016/9/4.
 * 定义一个人类，包括属性：姓名name、性别sex、年龄gae、国籍 nationality；
 *               包括方法：吃饭eat、睡觉sleep，工作work。
 * （1）一个工人类继承自人类，派生，增加属性：单位unit、工龄workAge；重写工作方法（工人的工作是……自己想吧）。
 * （2）一个工人干部cadre类继承自工人类，派生，增加属性：职务；增加方法：开会。
 * （3）编写主函数分别对上述3类具体人物进行测试。
 */
public class Worker extends Person{
    private String unit;
    private int workAge;

    public void work() {
        System.out.println("我是工人~~我去搬砖搬砖");
    }
    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    public String getUnit() {

        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }



}
