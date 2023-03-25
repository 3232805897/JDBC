package DAO;

import domain.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;
import until.JDBCUtilsByDruid;

import java.sql.Connection;
import java.sql.SQLException;

/***
 * 持久化层
 */
public class UserDao extends BasicDAO<User>{

}
