package day9_0918.test;

import java.io.*;


/*
 * �����ֽ��������ļ�1.txt������
 *InputStream(������)--����FileInputStream --read()
 * 
 * FileInputStream(File file) 
          ͨ����һ����ʵ���ļ�������������һ�� FileInputStream��
          ���ļ�ͨ���ļ�ϵͳ�е� File ���� file ָ����
          
   ����ֽ������ӳ���д��2.txt
   OutputStream(������)--����FileOutputStream-- write()      
 */
public class FileInputStreamDemo {

    public static void main(String[] args) {
        //����·���µ��ļ���װ��File�����
        File f1 = new File("D:\\1.txt");
        //���������ֽ�������
        InputStream is = null;
        try {
            is = new FileInputStream(f1);
                /*
				 * ��һ�������ֽڣ�����ѵ����ļ�ĩβ���򷵻� -1�� 
				 */
            while (true) {
                int b = is.read();
                if (b == -1) {
                    break;     //�����ļ���ĩβѭ����ֹ
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
                //�رմ����������ͷ����������������ϵͳ��Դ��
                is.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        //˼����Ϊʲô����is.close();�ŵ�try����


    }

}
