package day8_0830.test.work;

/**
 * Created by ���� on 2016/8/30.
 * Ҫ��:(3).��дmain��������main�����д������˻�tom,����1000Ԫ������3�꣬
 * ���ִ���2000Ԫ������save���������������������ܽ�����calcTotal��������
 * ��save����ȡ�fetch�����������������ܽ�calcTotal��
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
