package day9_0918.test.work;

import java.io.*;


/**
 * Created by ���� on 2016/9/18.
 * ��D��һ��ͼƬ���磨cat.jpg����ȡ���ݣ�д�뵽����һ��catnew.jpg�ļ���
 */
public class Work_2 {
    public static void main(String[] args) {
        Work_2.go();
    }

    public static void go() {
        File f = new File("D:\\dog.jpg");
        File f1 = new File("D:\\dognew.jpg");
        InputStream in = null;
        OutputStream os = null;

        try {
            in =new FileInputStream(f);
            os =new FileOutputStream(f1);
            while (true){
                int a=in.read();
                if(a == -1){
                    break;
                }else {
                    os.write(a);
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                os.close();
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


//        if (f.exists()) {
//            sop("����");
//            try {
//                in = new FileReader(f);
//                os = new FileWriter(f1);
//                while (true) {
//                    int a = in.read();
//                    if (a == -1) {
//                        break;
//                    } else {
//                        os.write(a);
//                    }
//                }
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            } finally {
//                try {
//                    os.close();
//                    in.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        } else {
//            sop("������");
//        }
    }

    public static void sop(Object obj) {
        System.out.println(obj);
    }
}
