package day8_0830.test.work;

import java.util.Scanner;

/**
 * Created by 韩博 on 2016/8/30.
 * 需求:(1).该类有存款人姓名（name,String类型），存款额（balance,double类型），
 * 存期（year,int类型）及利率（rate,double类型）四个属性，其中利率的默认值为0.01，
 * 设置默认的存款额为10元，存期为一年。
 * (2).该类有三个方法，存款（save），取款（fetch）及计算存期满后的总金额（calcTotal）。
 */
public class BankAccount {
    Scanner in = new Scanner(System.in);

    String name;    //存款人姓名
    double balance = 10;    //存款额
    int year = 1;   //存期
    double rate = 0.01;  //利率


    //存款方法
    public void save() {
        System.out.print("请输入要存的钱款数: ");
        double x = in.nextDouble();
        balance += x;
        System.out.println("您存了: " + x + "元\n您的余额为: " + balance);
    }

    //取款方法
    public void fetch() {
        System.out.print("请输入要取的钱款数: ");
        double y = in.nextDouble();
        if (y > balance) {
            System.out.println("没那么多钱");
        } else {
            balance -= y;
            System.out.println("您取了: " + y + "元\n您的余额为: " + balance);
        }
    }

    //计算存期满后的总金额
    public void calcTotal() {
        double n = balance + balance * rate * year;
        System.out.println("您存满" + year + "年后的总金额为: " + n);
    }

}
