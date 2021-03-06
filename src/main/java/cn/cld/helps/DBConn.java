package cn.cld.helps;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author 程刘德
 * @version 1.0
 * @Description TODO
 * @date 2019/12/12
 */
public class DBConn {


    public static Connection getLocalConn() {
        String dbUrl = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
        String dbUser = "system";
        String dbPwd = "root";
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn =  DriverManager.getConnection(dbUrl, dbUser, dbPwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static Connection getIamConn()  {
        String dbUrl = "jdbc:oracle:thin:@(DESCRIPTION =(ADDRESS = (PROTOCOL = TCP)(HOST = 10.145.196.101)(PORT = 1521))(CONNECT_DATA =(SERVER = DEDICATED)(SERVICE_NAME = iamzwdb)))";
        String dbUser = "iam";
        String dbPwd = "iam";
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn =  DriverManager.getConnection(dbUrl, dbUser, dbPwd);;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }


    public static Connection getDbusr07ProConn() {
        String dbUrl = "jdbc:oracle:thin:@10.7.95.67:1521:iamzwdb";
        String dbUser = "dbusr07";
        String dbPwd = "K7=8]5lg";
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn =  DriverManager.getConnection(dbUrl, dbUser, dbPwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    public static Connection getDbusr06ProConn()  {
        String dbUrl = "jdbc:oracle:thin:@10.7.95.67:1521:iamzwdb";
        String dbUser = "dbusr06";
        String dbPwd = "fqIuik1!";
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn =  DriverManager.getConnection(dbUrl, dbUser, dbPwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static Connection getDbusr01ProConn()  {
        String dbUrl = "jdbc:oracle:thin:@10.7.95.67:1521:iamzwdb";
        String dbUser = "dbusr01";
        String dbPwd = "iamApp201302";
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn =  DriverManager.getConnection(dbUrl, dbUser, dbPwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    //iamApp201302

    public static Connection getMqsql()  {
        String dbUrl = "jdbc:mysql://localhost:3306/maventest";
        String dbUser = "root";
        String dbPwd = "root";
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn =  DriverManager.getConnection(dbUrl, dbUser, dbPwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }


    //----------------------------------------------
    public static Connection getDbusr01TestConn() {
        String dbUrl = "jdbc:oracle:thin:@10.145.196.101:1521:iamzwdb";
        String dbUser = "dbusr01";
        String dbPwd = "dbusr01123";
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn =  DriverManager.getConnection(dbUrl, dbUser, dbPwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static Connection getDbusr07TestConn() {
        String dbUrl = "jdbc:oracle:thin:@10.145.196.101:1521:iamzwdb";
        String dbUser = "dbusr07";
        String dbPwd = "dbusr07123";
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
             conn =  DriverManager.getConnection(dbUrl, dbUser, dbPwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }



    /*--------------------------------*/
    //			<Resource name="jdbc/cqdb_test"
    //			auth="Container"
    //			type="javax.sql.DataSource"
    //			username="coll"
    //			password="coll"
    //			driverClassName="oracle.jdbc.driver.OracleDriver"
    //			url="jdbc:oracle:thin:@10.145.196.101:1521:cqdb"
    //			maxActive="8"
    //			maxIdle="4"/>
    public static Connection getCollTestConn() {
        String dbUrl = "jdbc:oracle:thin:@10.145.196.101:1521:cqdb";
        String dbUser = "coll";
        String dbPwd = "coll";
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn =  DriverManager.getConnection(dbUrl, dbUser, dbPwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static Connection getColl04Conn() {
        String dbUrl = "jdbc:oracle:thin:@10.7.95.69:1521:cqdb";
        String dbUser = "dbusr04";
        String dbPwd = "mvqz4Ecr";
        Connection conn = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn =  DriverManager.getConnection(dbUrl, dbUser, dbPwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }


    public static Connection getLocalMySQLTestConn() {
        String dbUrl = "jdbc:mysql://localhost:3306/maventest";
        String dbUser = "root";
        String dbPwd = "root";
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //MySQL 8.0 以上版本的数据库连接有所不同：
//            Class.forName("com.mysql.cj.jdbc.Driver");
            conn =  DriverManager.getConnection(dbUrl, dbUser, dbPwd);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }


    /*hss*/





}
