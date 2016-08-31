package day8_0831.test.work;

import day8_0830.test.work.*;

/**
 * Created by 韩博 on 2016/8/31.
 * 要求:（4）.编写main方法，在main方法中创建以账户tom,创建时即（利用构造方法）存入1000元，
 *      后又存入2000元(利用存款方法存入)，存期3年(定期)，计算存期满后的总金额（利用calcTotal方法）。
 */
public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount= new BankAccount(1000,3);
        bankAccount.setName("汤姆");
        bankAccount.calcTotal();
        bankAccount.save();

    }
}
