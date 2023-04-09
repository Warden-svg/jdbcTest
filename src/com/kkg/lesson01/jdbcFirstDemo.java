package com.kkg.lesson01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * TODO
 *
 * @author kkg
 * @date 2023.3.23
 */
public class jdbcFirstDemo {

//        public static void main(String[] args) throws Exception {
////要连接的数据库URL
//            String url = "jdbc:mysql://localhost:3306/jdbcStudy? useUnicode=true&characterEncoding=utf8&useSSL=true";
////连接的数据库时使用的用户名
//            String username = "root";
////连接的数据库时使用的密码
//            String password = "123456";
////1.加载驱动
////DriverManager.registerDriver(new com.mysql.jdbc.Driver());不推荐使用
//            //这种方式来加载驱动
//            Class.forName("com.mysql.jdbc.Driver");//推荐使用这种方式来加载驱动
////2.获取与数据库的链接
//            Connection conn = DriverManager.getConnection(url, username,
//                    password);
////3.获取用于向数据库发送sql语句的statement
//            Statement st = conn.createStatement();
//            String sql = "select id,name,password,email,birthday from users";
////4.向数据库发sql,并获取代表结果集的resultset
//            ResultSet rs = st.executeQuery(sql);
////5.取出结果集的数据
//            while(rs.next()){
//                System.out.println("id=" + rs.getObject("id"));
//                System.out.println("name=" + rs.getObject("name"));
//                System.out.println("password=" + rs.getObject("password"));
//                System.out.println("email=" + rs.getObject("email"));
//                System.out.println("birthday=" + rs.getObject("birthday"));
//            rs.close();
//            st.close();
//            conn.close();
//        }
//    }
    }

