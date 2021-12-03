package JDBC_experiments;

import java.sql.*;

public class first_JDBC {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8889/RahulDATA", "root", "root");
           System.out.println("Connection Established Successfully.");
           System.out.println("Enjoy the JDBC.");

       } catch (Exception e){
           System.out.println("Connection could not be establish.");
           System.out.println("Please check again and reconnect.");
           System.out.println(e);
       }

//      ln(rs.next());
    }
}
