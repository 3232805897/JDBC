package Test;

import DAO.UserDao;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import domain.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import until.JDBCUtilsByDruid;

import javax.sql.DataSource;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Properties;

public class ConnectTest {
    public static void main(String[] args) throws Exception {
        //获取连接
        UserDao userDao = new UserDao();
        //写入sql语句
        String sql = "select * from User where name like concat(?,'%')";
        List<User> users = userDao.queryMulti(sql, User.class, "张");
        //对查询的结果
        for (User user : users) {
            System.out.println(user);
        }
        /**
         *  String sql = "insert into User values(?,?,?)";
         *  int a = userDao.update(sql, 8,"李四",10);
         */
    }
}