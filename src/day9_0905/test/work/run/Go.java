package day9_0905.test.work.run;

import java.util.Scanner;

/**
 * Created by ���� on 2016/9/5.
 * 1    ����һ�������û��࣬Ҫ�������Ϣ���û�ID���û����롢email��ַ���ڽ������ʵ��ʱ��
 * ������������Ϣ����Ϊ���캯���Ĳ������룬�����û�ID���û�����ʱ����ģ�
 * email��ַ���û�ID�����ַ���"@gameschool.com"
 * 2�����û������飬��������û�ID�����룬email��ַ��ͨ�����������û�ID�������ж��ܵ�¼�ɹ����硣
 */
public class Go {
    Scanner in = new Scanner(System.in);
    //suffix ��׺
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










//�û�����ID
//    final public void inid() {
//        String id =in.next();
//        this.id=id;
//    }
//�û���������
//    final public void inMiMa(){
//        int miMa=in.nextInt();
//        this.miMa=miMa;
//    }
//�û�����email��ַ
//    public void inEmail(){
//        String email =in.next();
//        this.email=email;
//    }

}
