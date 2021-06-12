import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.*;

class Client{
   String JDBC_DRIVER = "com.mysql.jdbc.Driver";
   String DB_URL = "jdbc:mysql://localhost:3306/Smodel";
   String USER = "ahmed";
   String PASS = "Ahmed1998";
   String QUERY1 = "SELECT id,name,password,email FROM Smodel WHERE id=";
   Client(){
       Scanner in = new Scanner(System.in);
       int sw;
       ResultSet rs;
       try(
           Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {
         System.out.println("To Search By ID: enter 1");
         System.out.println("To Search By Username: enter 2");
         System.out.println("To Search By Password: enter 3");
         System.out.println("To Search By Email: enter 4");
         sw = in.nextInt();

          switch(sw){
             case 1:
         System.out.println("enter the ID you want to search");
         int ID = in.nextInt();
         rs = stmt.executeQuery(QUERY1+ID);

         System.out.println("Displaying record...");
         while(rs.next()){
            System.out.print("ID: " + rs.getString("id"));
            System.out.print(", Name: " + rs.getString("name"));
            System.out.print(", Password: " + rs.getString("password"));
            System.out.println(", Email: " + rs.getString("email"));
            }
         rs.close();
         break;
             case 2:
         System.out.println("enter the Username you want to search");
         Scanner in2 = new Scanner(System.in);
         String username = in2.nextLine();
         String QUERY2 = "SELECT id, name, password, email FROM Smodel  WHERE name LIKE \'"+username+"\'";
         rs = stmt.executeQuery(QUERY2);
         System.out.println("Displaying record...");
         while(rs.next()){
            System.out.print("ID: " + rs.getString("id"));
            System.out.print(", Name: " + rs.getString("name"));
            System.out.print(", Password: " + rs.getString("password"));
            System.out.println(", Email: " + rs.getString("email"));
            }
         rs.close();
         break;
             case 3:
         System.out.println("enter the Password you want to search");
         Scanner in3 = new Scanner(System.in);
         String passwd= in3.nextLine();
         String QUERY3 = "SELECT * FROM Smodel WHERE password LIKE \'"+passwd+"\'";
         rs = stmt.executeQuery(QUERY3);
         System.out.println("Displaying record...");
         while(rs.next()){
            System.out.print("ID: " + rs.getString("id"));
            System.out.print(", Name: " + rs.getString("name"));
            System.out.print(", Password: " + rs.getString("password"));
            System.out.println(", Email: " + rs.getString("email"));
            }
         rs.close();
         break;
             case 4:
         System.out.println("enter the Email you want to search");
         Scanner in4 = new Scanner(System.in);
         String email= in4.nextLine();
         String QUERY4 = "SELECT id, name, password, email FROM Smodel WHERE email LIKE \'"+email+"\'";
         rs = stmt.executeQuery(QUERY4);
         System.out.println("Displaying record...");
         while(rs.next()){
            System.out.print("ID: " + rs.getString("id"));
            System.out.print(", Name: " + rs.getString("name"));
            System.out.print(", Password: " + rs.getString("password"));
            System.out.println(", Email: " + rs.getString("email"));
            }
         rs.close();
         break;
         default:
            System.out.println("Wrong Input");
            break;
          }
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
}

class Server{
   String JDBC_DRIVER = "com.mysql.jdbc.Driver";
   String DB_URL = "jdbc:mysql://localhost:3306/Smodel";
   String USER = "ahmed";
   String PASS = "Ahmed1998";
   String QUERY = "insert into Smodel(id,name,password,email) VALUES(? ,?, ?, ?)";
   public Server(int ID, String username, String passwd, String email){
       Scanner in = new Scanner(System.in);
       String result;
       ResultSet rs;
       try(
           Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
           PreparedStatement stmt = conn.prepareStatement(QUERY,
            ResultSet.TYPE_SCROLL_INSENSITIVE,
            ResultSet.CONCUR_UPDATABLE)
      ) {
          stmt.setInt( 1, ID );
          stmt.setString( 2, username );
          stmt.setString( 3, passwd);
          stmt.setString( 4, email);
          stmt.addBatch();

          int[] count = stmt.executeBatch();
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
}

public class StudentModel{
   int ID=4;
   String username="", email="", passwd="";
   public StudentModel() {
         Scanner in = new Scanner(System.in);
         System.out.println("## Student Database Entry ##");
         System.out.println("Enter The Student Name: ");
         username = in.nextLine();
         System.out.println("Now Enter The Student Password: ");
         passwd= in.nextLine();
         System.out.println("Now Enter The Student Email: ");
         email= in.nextLine();

         System.out.println("Do you want to send the Entered Data to the Server? [y,n]");
         String ans= in.nextLine();
         if(ans.equals("y")){
         Server ser = new Server(ID,username,passwd,email);
         ID++;
         }
         else{
         System.out.println("You Opted out of entring the Data");
         }
   }
   public static void main(String []args){
      while(true){
         System.out.println("To Exit from the program press CTRL+C\n");
         int sw;
         Scanner in = new Scanner(System.in);
         System.out.println("To Enter Data press 1:");
         System.out.println("To Search Data press 2:");
         sw = in.nextInt();
         switch(sw){
            case 1:
            StudentModel sm = new StudentModel();
            break;
            case 2:
            Client client = new Client();
            break;
            default:
            System.out.println("Wrong Input");
            break;
         }
      }
   }
}
/*
CREATE TABLE Smodel
(id int(10),
 name varchar(50),
 password varchar(50),
 email varchar(50),
 PRIMARY KEY (id )
);
insert into Smodel values(1,'Ahmed','1234','ahmed@albalochi.com');
+----+-------+----------+---------------------+
| id | name  | password | email               |
+----+-------+----------+---------------------+
|  1 | Ahmed | 1234     | ahmed@albalochi.com |
|  2 | Umair | 1212     | Umair@gmail.com     |
|  3 | Imam  | 1414     | Emam@gmail.com      |
+----+-------+----------+---------------------+
*/
