package day9_0914.test;

/**
 * Created by ���� on 2016/9/14.
 */
public class Test1 {
    public static void main(String[] args) {

//        tey{
//            ���ܲ������쳣����;
//        }catch(�쳣���� e){
//            ���쳣���д���Ĵ���;
//        }
//        �����;
// *********************************************
//        tey{
//            ���ܲ������쳣����;
//        }catch(�쳣���� e){
//            ���쳣���д���Ĵ���;
//        }fianlly{
//        }
//       ͨ��throw �׳��쳣
//       throw new �쳣����� (" XXXXX ");
//
        String s=new String("����");
        int a = 2;
        int b = 0;
        try{
          sop(a/b);
        }catch (Exception e){

            sop("����������Ϊ0");
        }
        sop("123123");


    }
    public static void sop(Object obj) {
        System.out.println(obj);
    }
}
