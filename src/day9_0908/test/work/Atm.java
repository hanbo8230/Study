package day9_0908.test.work;

import java.util.Scanner;

/**
 * Created by ���� on 2016/9/8.
 * 1������һ���ӿ��У�����Ƿ��¼�ķ�����ȡ��ķ�����ת�˵ķ�����
 * ���ķ�������ѯ�ķ����ȵȡ�ũҵ������ʵ�ָýӿ�
 * 2.�û���ʹ��ũҵ��������ķ�����ѯ�����ȵ�
 */
public class Atm extends User implements Int {
    private int money;
    private String zhangHao;
    private double miMa;
    int y = 0;
    int z = 0;
    Scanner in = new Scanner(System.in);
    User p1 = new User("����", 111,1000);
    User p2 = new User("����", 222, 2000);
    User p3 = new User("��������", 333, 3000);

    User[] arr = {p1, p2, p3};

    //����¼����
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
                System.out.println("��������,����������");
                dengLu();
            }
        }
        return x;
    }

    //ȡ���
    @Override
    public void quKuan() {
        System.out.println("������ȡ����");
        int money = in.nextInt();
        if (this.money >= money) {
            this.money -= money;
            System.out.println("��ǰ���Ϊ: " + this.money);
            System.out.println("�Ƿ����ȡ�� \n1:��\n2:��");
            y = in.nextInt();
            if (y == 1) {
                quKuan();
            }
        } else {
            System.out.println("��û���㹻�����");
        }
        System.out.println("��ǰ���Ϊ: " + this.money);


    }

    //����
    @Override
    public void cunKuan() {
        System.out.println("����������");
        int money = in.nextInt();
        this.money += money;
        System.out.println("��ǰ���Ϊ: " + this.money);
        System.out.println("�Ƿ������� \n1:��\n2:��");
        y = in.nextInt();
        if (y == 1) {
            quKuan();
        }
        System.out.println("��ǰ���Ϊ: " + this.money);
    }

    //ת�˷���
    @Override
    public void zhuanZhang() {
        System.out.println("������ת�˵��˺�");
        String zhangHao = in.next();
        for (int x = 0; x < arr.length; x++) {
            if ((arr[x].getName()).equals(zhangHao)) {
                System.out.println("������ת�˽��");
                int z = in.nextInt();
                if (this.money > z) {
                    arr[x].setMoney(arr[x].getMoney() + z);
                    this.money -= z;
                    System.out.println("�Ƿ����ת��\n1 ��\n2 ��");
                    y=in.nextInt();
                    if (y==1){
                        zhuanZhang();
                    }if (y == 2){
                        System.exit(0);
                    }

                }
            } else if(x==2){
                System.out.println("���޴��˻�");
            }

        }


    }

    //��ѯ����
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
