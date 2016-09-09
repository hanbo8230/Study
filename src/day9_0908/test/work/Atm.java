package day9_0908.test.work;

import java.util.Scanner;

/**
 * Created by 韩博 on 2016/9/8.
 * 1、定义一个接口有：检查是否登录的方法，取款的方法，转账的方法，
 * 存款的方法，查询的方法等等。农业银行类实现该接口
 * 2.用户类使用农业银行里面的方法查询余额，存款等等
 */
public class Atm extends User implements Int {
    private int money;
    private String zhangHao;
    private double miMa;
    int y = 0;
    int z = 0;
    Scanner in = new Scanner(System.in);
    User p1 = new User("张三", 111,1000);
    User p2 = new User("李四", 222, 2000);
    User p3 = new User("王二麻子", 333, 3000);

    User[] arr = {p1, p2, p3};

    //检查登录方法
    @Override
    public boolean dengLu() {
        String zhangHao = in.next();
        double miMa = in.nextInt();
        boolean x = false;
        if (this.zhangHao.equals(zhangHao) && this.miMa == miMa) {
            x = true;
        } else {
            while (y < 2) {
                y++;
                System.out.println("输入有误,请重新输入");
                dengLu();
            }
        }
        return x;
    }

    //取款方法
    @Override
    public void quKuan() {
        System.out.println("请输入取款金额");
        int money = in.nextInt();
        if (this.money >= money) {
            this.money -= money;
            System.out.println("当前余额为: " + this.money);
            System.out.println("是否继续取款 \n1:是\n2:否");
            y = in.nextInt();
            if (y == 1) {
                quKuan();
            }
        } else {
            System.out.println("你没有足够的余额");
        }
        System.out.println("当前余额为: " + this.money);


    }

    //存款方法
    @Override
    public void cunKuan() {
        System.out.println("请输入存款金额");
        int money = in.nextInt();
        this.money += money;
        System.out.println("当前余额为: " + this.money);
        System.out.println("是否继续存款 \n1:是\n2:否");
        y = in.nextInt();
        if (y == 1) {
            quKuan();
        }
        System.out.println("当前余额为: " + this.money);
    }

    //转账方法
    @Override
    public void zhuanZhang() {
        System.out.println("请输入转账的账号");
        String zhangHao = in.next();
        for (int x = 0; x < arr.length; x++) {
            if ((arr[x].getName()).equals(zhangHao)) {
                System.out.println("请输入转账金额");
                int z = in.nextInt();
                if (this.money > z) {
                    arr[x].setMoney(arr[x].getMoney() + z);
                    this.money -= z;
                    System.out.println("是否继续转账\n1 是\n2 否");
                    y=in.nextInt();
                    if (y==1){
                        zhuanZhang();
                    }if (y == 2){
                        System.exit(0);
                    }

                }
            } else if(x==2){
                System.out.println("查无此账户");
            }

        }


    }

    //查询方法
    @Override
    public void zhuanzhang() {


    }


//    public int getMoney() {
//        return money;
//    }
//
//    public void setMoney(int money) {
//        this.money = money;
//    }
//
//    public String getZhangHao() {
//        return zhangHao;
//    }
//
//    public void setZhangHao(String zhangHao) {
//        this.zhangHao = zhangHao;
//    }
//
//    public double getMiMa() {
//        return miMa;
//    }
//
//    public void setMiMa(double miMa) {
//        this.miMa = miMa;
//    }
}
