package day9_0902.test.FatherAndSon;

import day9_0902.test.FatherAndSon.Father;

/**
 * Created by 韩博 on 2016/9/2.
 */
public class Son extends Father {
    public Son(int x) {
        System.out.println("儿砸有参数的构造方法");
    }

    public Son() {
        super(1
        );
        System.out.println("儿砸空参数的构造方法");
    }

}
