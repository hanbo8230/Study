import java.sql.*;


/**
 * Created by 韩博 on 2016/9/22.
 * 1. 用户表：    t_user: username,password
 登录方法：login(String name, String psw)
 查询用户表里是否存在通过login方法传进来的用户和密码
 */
public class Q12 {
    public static void main(String args[]) throws SQLException, ClassNotFoundException {
        //gai();
        cha();
    }

    public static void gai() {
        //声明 各种变量

        String driverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/manage";
        String username = "root";
        String password = "root";
        //加载驱动
        Connection con = null;
        Statement st = null;
        try {
            Class.forName(driverClassName);
            //使用 url,username,password得到链接
            con = DriverManager.getConnection(url, username, password);
            sop("连接成功");
            //创建对象,,这个对象可以将SQL语句发送给数据库mysql
            st = con.createStatement();
            /**
             * int executeUpdate(String sql)
             * */
            String sql = "update stu set sname = '韩博' where sid =4  "; //sql语句更改
            int a = st.executeUpdate(sql); //executeUpdate();更新方法
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
        //声明 各种变量
        String driverClassName = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/manage";
        String username = "root";
        String password = "root";
        Connection con = null;
        Statement st = null;
        ResultSet a = null;
        try {
            //加载驱动
            Class.forName(driverClassName);
            //使用 url,username,password得到链接
            con = DriverManager.getConnection(url, username, password);
            sop("连接成功");
            //创建对象,,这个对象可以将SQL语句发送给数据库mysql
            st = con.createStatement();
            /**
             *   ResultSet  executeQuery(String sql); //查询语句
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
