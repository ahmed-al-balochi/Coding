import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.*;

public class Task1{
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
   static final String DB_URL = "jdbc:mysql://localhost:3306/test";
   static final String USER = "ahmed";
   static final String PASS = "Ahmed1998";
   static final String QUERY = "SELECT name, password FROM test";
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       String result, name, passwd;
       ResultSet rs;
       try(
           Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {
         System.out.println("to login Enter Your Name: ");
         name = in.nextLine();
         System.out.println("Now Enter Your Password: ");
         passwd= in.nextLine();

         String sql = "SELECT name,password FROM test" +
            " WHERE password ="+passwd;
         rs = stmt.executeQuery(sql);

         while(rs.next()){
            if(passwd.equals(rs.getString("password"))){
            System.out.print("Name: " + rs.getString("name"));
            System.out.println(", Password: " + rs.getString("password"));
            }
         }
         rs.close();
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
}
/*
CREATE TABLE test
(id int(10),
 name varchar(50),
 password varchar(50),
 city varchar(50),
 PRIMARY KEY (id )
);
+----+-------+----------+------+
| id | name  | password | city |
+----+-------+----------+------+
|  1 | Ahmed | 1234     | ISB  |
+----+-------+----------+------+
*/
