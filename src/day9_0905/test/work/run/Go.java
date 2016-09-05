package day9_0905.test.work.run;

import java.util.Scanner;

/**
 * Created by 韩博 on 2016/9/5.
 * 1    定义一个网络用户类，要处理的信息有用户ID、用户密码、email地址。在建立类的实例时，
 * 把以上三个信息都作为构造函数的参数输入，其中用户ID和用户密码时必须的，
 * email地址是用户ID加上字符串"@gameschool.com"
 * 2创建用户类数组，存放三个用户ID，密码，email地址。通过键盘输入用户ID和密码判断能登录成功网络。
 */
public class Go {
    Scanner in = new Scanner(System.in);
    //suffix 后缀
    final public static String suffix = "@gameschool.com";
    public String id;
    public int miMa;
    public String email;

    public Go() {
    }

    public Go(String id, int miMa) {
        this.id = id;
        this.miMa = miMa;
        this.email = this.id + suffix;
    }










//用户输入ID
//    final public void inid() {
//        String id =in.next();
//        this.id=id;
//    }
//用户输入密码
//    final public void inMiMa(){
//        int miMa=in.nextInt();
//        this.miMa=miMa;
//    }
//用户输入email地址
//    public void inEmail(){
//        String email =in.next();
//        this.email=email;
//    }

}
