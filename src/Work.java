import java.util.Scanner;
import java.sql.*;

/**
 * Created by ���� on 2016/9/22.1. �û���    t_user: username,password
 * ��¼������login(String name, String psw)
 * ��ѯ�û������Ƿ����ͨ��login�������������û�������
 * �û� user
 */
public class Work {
    public static void main(String[] args) {
        user();
    }

    public static void user() {
        //��������
        String driverClassName = "com.mysql.jdbc.Driver";  //mysql����������
        String url = "jdbc:mysql://localhost:3306/manage";  //���ݿ�·��
        String username = "root";    //���ݿ��˺�
        String password = "root";    //���ݿ�����
        //��������
        Connection con = null;
        Statement st = null; //����Statement�� ����ִ�о�̬ SQL ��䲢�����������ɽ���Ķ���
        PreparedStatement pst = null;
        // ResultSet a = null; //����ResultSet�� ��ʾ���ݿ����������ݱ�ͨ��ͨ��ִ�в�ѯ���ݿ��������ɡ�
        try {
            Class.forName(driverClassName);
            con = DriverManager.getConnection(url, username, password); //���ݿ��ַ
            st = con.createStatement(); //����һ�� Statement �������� SQL ��䷢�͵����ݿ�
            String userName = "create table user ( name varchar(50), psw varchar(50) );";
            st.executeUpdate(userName);  //����һ����Ϊuser ���û���
            String user1 = "insert into user values ('����','111')";
            String user2 = "insert into user values ('����','222')";
            st.executeUpdate(user1);
            st.executeUpdate(user2);
            //�����û����


            String add = "insert into user values(?,?)";

            pst = con.prepareStatement(add);

            pst.setString(1,"���˶���");
            pst.setString(2,"333");
            pst.executeUpdate(); //ִ�����

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (st != null) {
                    st.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}