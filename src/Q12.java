import java.sql.*;


/**
 * Created by ���� on 2016/9/22.
 * 1. �û���    t_user: username,password
 ��¼������login(String name, String psw)
 ��ѯ�û������Ƿ����ͨ��login�������������û�������
 */
public class Q12 {
    public static void main(String args[]) throws SQLException, ClassNotFoundException {
        //gai();
        cha();
    }

    public static void gai() {
        //���� ���ֱ���

        String driverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/manage";
        String username = "root";
        String password = "root";
        //��������
        Connection con = null;
        Statement st = null;
        try {
            Class.forName(driverClassName);
            //ʹ�� url,username,password�õ�����
            con = DriverManager.getConnection(url, username, password);
            sop("���ӳɹ�");
            //��������,,���������Խ�SQL��䷢�͸����ݿ�mysql
            st = con.createStatement();
            /**
             * int executeUpdate(String sql)
             * */
            String sql = "update stu set sname = '����' where sid =4  "; //sql������
            int a = st.executeUpdate(sql); //executeUpdate();���·���
            sop(a);
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

    public static void cha() {
        //���� ���ֱ���
        String driverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/manage";
        String username = "root";
        String password = "root";
        Connection con = null;
        Statement st = null;
        ResultSet a = null;
        try {
            //��������
            Class.forName(driverClassName);
            //ʹ�� url,username,password�õ�����
            con = DriverManager.getConnection(url, username, password);
            sop("���ӳɹ�");
            //��������,,���������Խ�SQL��䷢�͸����ݿ�mysql
            st = con.createStatement();
            /**
             *   ResultSet  executeQuery(String sql); //��ѯ���
             * */
            String sql = " select * from stu";
            a = st.executeQuery(sql);
            while (a.next()) {
                String b = a.getString("sid");
                String c = a.getString("sname");
                sop(b + "\t" + c);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (a != null) {
                    a.close();
                }
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


    public static void sop(Object obj) {
        System.out.println(obj);
    }
}
