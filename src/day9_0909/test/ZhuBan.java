package day9_0909.test;

/**
 * Created by ���� on 2016/9/9.
 */
public class ZhuBan {
    //���忪��
    public void run() {
        System.out.println("ZhuBan run");
    }

    //������ýӿ�
    public void usePCI(PCI x) {
        if (x != null) {
            x.open();
            x.close();
        }
    }
}

//�����д򿪹رյĽӿ�
interface PCI {
    public void open();

    public void close();
}

class Computer {
    public static void main(String[] args) {
        ZhuBan zhuBan = new ZhuBan();
        //����ͨ��,������
        zhuBan.run();
        zhuBan.usePCI(new WangKa());
        zhuBan.usePCI(new ShengKa());
    }
}

//��������,��չ����
class WangKa implements PCI {
    //��������
    @Override
    public void open() {
        System.out.println("open WangKa");
    }

    //�����ر�
    @Override
    public void close() {
        System.out.println("close WangKa");
    }
}

//����������,��չ����
class ShengKa implements PCI {
    //��������
    @Override
    public void open() {
        System.out.println("open ShengKa");
    }

    //�����ر�
    @Override
    public void close() {
        System.out.println("close ShengKa");
    }
}