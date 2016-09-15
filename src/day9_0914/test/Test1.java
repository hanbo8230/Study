package day9_0914.test;

/**
 * Created by 韩博 on 2016/9/14.
 */
public class Test1 {
    public static void main(String[] args) {

//        tey{
//            可能产生的异常代码;
//        }catch(异常类名 e){
//            对异常进行处理的代码;
//        }
//        代码段;
// *********************************************
//        tey{
//            可能产生的异常代码;
//        }catch(异常类名 e){
//            对异常进行处理的代码;
//        }fianlly{
//        }
//       通过throw 抛出异常
//       throw new 异常类对象 (" XXXXX ");
//
        String s=new String("对象");
        int a = 2;
        int b = 0;
        try{
          sop(a/b);
        }catch (Exception e){

            sop("被除数不能为0");
        }
        sop("123123");


    }
    public static void sop(Object obj) {
        System.out.println(obj);
    }
}
