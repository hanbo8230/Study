package day8_0831.test.work;

import java.util.Scanner;

/**
 * Created by ���� on 2016/8/31.
 * Ҫ��:3����дBankAccount�࣬Ҫ�����£�
 * ��1��.�����д����������name,String���ͣ������balance,double���ͣ���
 *      ���ڣ�year,int���ͣ������ʣ�rate,double���ͣ��ĸ����ԣ��������ʵ�Ĭ��ֵΪ0.01��
 * ��2��.�������������캯��������һ�����췽�������β�;��һ���вι��캯����
 *      ����2�����ڴ�������ʱ���ô�������ڵ��βΡ�
 * ��3��.������������������save���ͼ������������ܽ�calcTotal����
 * ��4��.��дmain��������main�����д������˻�tom,����ʱ�������ù��췽��������1000Ԫ��
 *      ���ִ���2000Ԫ(���ô�������)������3��(����)���������������ܽ�����calcTotal��������
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

    private String name;    //���������
    private double balance ;    //����
    private int year ;   //����
    private double rate = 0.01;  //����


    public BankAccount(){

    }
    public  BankAccount(double balance,int year){
        this.balance=balance;
        this.year=year;
    }
    //����
    public void save() {
        System.out.print("������Ҫ���Ǯ����: ");
        double x = in.nextDouble();
        this.balance += x;
        System.out.println("������: " + x + "Ԫ\n�������Ϊ: " + balance);
    }


    //�������������ܽ��
    public void calcTotal() {

        for(int x= 0 ;x<year ;x++ ) {
            this.balance += balance * rate;
        }
        System.out.println("������" + year + "�����ܽ��Ϊ: " + balance);
    }

}