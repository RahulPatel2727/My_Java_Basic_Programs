//package JDBC;

import java.sql.*;

public class First {
    public static void main(String[] args) throws SQLException,ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8889/RahulDatabase","root","root");
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery("select * from EMPLOYEE");
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+
                    rs.getString(2)+" "+rs.getDate(3)+" "+rs.getString(4)+" "+
                    rs.getString(5)+" "+rs.getInt(6)+" "+rs.getInt(7)+" "+
                    rs.getInt(8));
        }
        rs.close();

    }
}
