package day9_0908.test.work2;

/**
 * Created by 韩博 on 2016/9/8.
 * 1、定义一个接口有：检查是否登录的方法，取款的方法，转账的方法，
 *      存款的方法，查询的方法等等。农业银行类实现该接口
 * 2.用户类使用农业银行里面的方法查询余额，存款等等
 */
public interface Int {
    //检查登录方法
    public  boolean dengLu();
    //取款方法
    public void quKuan();
    //存款方法
    public void cunKuan();
    //转账方法
    public void zhuanZhang();
    //查询方法
    public void zhuanzhang();



}
