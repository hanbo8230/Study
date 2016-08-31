package day8_0831.test.work;

import java.util.Scanner;

/**
 * Created by 韩博 on 2016/8/31.
 * 要求:3、编写BankAccount类，要求如下：
 * （1）.该类有存款人姓名（name,String类型），存款额（balance,double类型），
 *      存期（year,int类型）及利率（rate,double类型）四个属性，其中利率的默认值为0.01。
 * （2）.该类有两个构造函数，其中一个构造方法不含形参;另一个有参构造函数中
 *      包含2个用于创建对象时设置存款额与存期的形参。
 * （3）.该类有两个方法，存款（save）和计算存期满后的总金额（calcTotal）。
 * （4）.编写main方法，在main方法中创建以账户tom,创建时即（利用构造方法）存入1000元，
 *      后又存入2000元(利用存款方法存入)，存期3年(定期)，计算存期满后的总金额（利用calcTotal方法）。
 */
public class BankAccount {
    Scanner in = new Scanner(System.in);

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getYear() {

        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Scanner getIn() {

        return in;
    }

    public void setIn(Scanner in) {
        this.in = in;
    }

    private String name;    //存款人姓名
    private double balance ;    //存款额
    private int year ;   //存期
    private double rate = 0.01;  //利率


    public BankAccount(){

    }
    public  BankAccount(double balance,int year){
        this.balance=balance;
        this.year=year;
    }
    //存款方法
    public void save() {
        System.out.print("请输入要存的钱款数: ");
        double x = in.nextDouble();
        this.balance += x;
        System.out.println("您存了: " + x + "元\n您的余额为: " + balance);
    }


    //计算存期满后的总金额
    public void calcTotal() {

        for(int x= 0 ;x<year ;x++ ) {
            this.balance += balance * rate;
        }
        System.out.println("您存满" + year + "年后的总金额为: " + balance);
    }

}