package day8_0831.test.work;

import day8_0830.test.work.*;

/**
 * Created by ���� on 2016/8/31.
 * Ҫ��:��4��.��дmain��������main�����д������˻�tom,����ʱ�������ù��췽��������1000Ԫ��
 *      ���ִ���2000Ԫ(���ô�������)������3��(����)���������������ܽ�����calcTotal��������
 */
public class TestBankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount= new BankAccount(1000,3);
        bankAccount.setName("��ķ");
        bankAccount.calcTotal();
        bankAccount.save();

    }
}
