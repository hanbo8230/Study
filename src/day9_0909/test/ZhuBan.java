package day9_0909.test;

/**
 * Created by 韩博 on 2016/9/9.
 */
public class ZhuBan {
    //主板开启
    public void run() {
        System.out.println("ZhuBan run");
    }

    //主板调用接口
    public void usePCI(PCI x) {
        if (x != null) {
            x.open();
            x.close();
        }
    }
}

//创建有打开关闭的接口
interface PCI {
    public void open();

    public void close();
}

class Computer {
    public static void main(String[] args) {
        ZhuBan zhuBan = new ZhuBan();
        //电脑通电,打开主板
        zhuBan.run();
        zhuBan.usePCI(new WangKa());
        zhuBan.usePCI(new ShengKa());
    }
}

//需求上网,扩展网卡
class WangKa implements PCI {
    //网卡开启
    @Override
    public void open() {
        System.out.println("open WangKa");
    }

    //网卡关闭
    @Override
    public void close() {
        System.out.println("close WangKa");
    }
}

//需求听音乐,扩展声卡
class ShengKa implements PCI {
    //网卡开启
    @Override
    public void open() {
        System.out.println("open ShengKa");
    }

    //网卡关闭
    @Override
    public void close() {
        System.out.println("close ShengKa");
    }
}