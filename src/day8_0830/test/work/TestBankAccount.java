package day8_0830.test.work;

/**
 * Created by 韩博 on 2016/8/30.
 * 要求:(3).编写main方法，在main方法中创建以账户tom,存入1000元，存期3年，
 * 后又存入2000元（利用save方法），计算存期满后的总金额（利用calcTotal方法）。
 * 存款（save），取款（fetch）及计算存期满后的总金额（calcTotal）
 */


public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        bank.name = "tom";
        bank.save();
        bank.year =3;
        bank.save();
        bank.calcTotal();
    }
}
