package day9_0918.test;

import java.io.*;


/*
 * 输入字节流：从文件1.txt到程序
 *InputStream(抽象类)--子类FileInputStream --read()
 * 
 * FileInputStream(File file) 
          通过打开一个到实际文件的连接来创建一个 FileInputStream，
          该文件通过文件系统中的 File 对象 file 指定。
          
   输出字节流：从程序写到2.txt
   OutputStream(抽象类)--子类FileOutputStream-- write()      
 */
public class FileInputStreamDemo {

    public static void main(String[] args) {
        //将该路径下的文件封装成File类对象
        File f1 = new File("D:\\1.txt");
        //创建输入字节流对象
        InputStream is = null;
        try {
            is = new FileInputStream(f1);
                /*
				 * 下一个数据字节；如果已到达文件末尾，则返回 -1。 
				 */
            while (true) {
                int b = is.read();
                if (b == -1) {
                    break;     //读到文件的末尾循环终止
                } else {
                    System.out.print((char) b);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //关闭此输入流并释放与该流关联的所有系统资源。
                is.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        //思考：为什么不把is.close();放到try里面


    }

}
