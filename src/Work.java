import java.util.Scanner;
import java.sql.*;

/**
 * Created by 韩博 on 2016/9/22.1. 用户表：    t_user: username,password
 * 登录方法：login(String name, String psw)
 * 查询用户表里是否存在通过login方法传进来的用户和密码
 * 用户 user
 */
public class Work {
    public static void main(String[] args) {
        user();
    }

    public static void user() {
        //声明变量
        String driverClassName = "com.mysql.jdbc.Driver";  //mysql的驱动类名
        String url = "jdbc:mysql://localhost:3306/manage";  //数据库路径
        String username = "root";    //数据库账号
        String password = "root";    //数据库密码
        //加载驱动
        Connection con = null;
        Statement st = null; //声明Statement类 用于执行静态 SQL 语句并返回它所生成结果的对象
        PreparedStatement pst = null;
        // ResultSet a = null; //声明ResultSet类 表示数据库结果集的数据表，通常通过执行查询数据库的语句生成。
        try {
            Class.forName(driverClassName);
            con = DriverManager.getConnection(url, username, password); //数据库地址
            st = con.createStatement(); //创建一个 Statement 对象来将 SQL 语句发送到数据库
            String userName = "create table user ( name varchar(50), psw varchar(50) );";
            st.executeUpdate(userName);  //创建一个名为user 的用户表
            String user1 = "insert into user values ('张三','111')";
            String user2 = "insert into user values ('李四','222')";
            st.executeUpdate(user1);
            st.executeUpdate(user2);
            //创建用户完毕


            String add = "insert into user values(?,?)";

            pst = con.prepareStatement(add);

            pst.setString(1,"王八犊子");
            pst.setString(2,"333");
            pst.executeUpdate(); //执行添加

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