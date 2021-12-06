package JDBC;
import java.util.*;
import java.lang.*;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// for storing the valid emails from a long string          valid mails
class insert_dataToDatabase {
        public void insert(String s) throws ClassNotFoundException,SQLException{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8809/RahulDatabase","root","root");
            PreparedStatement st = con.prepareStatement("insert into Data values (?)");
            Pattern p = Pattern.compile("[a-zA-Z][a-zA-Z0-9._]+@(gmail|hotmail|yahoo|rediff|outlook).com");
            Matcher mat =p.matcher(s);

            boolean T=true;
            if (mat.find()==false)
            {
                try {
                    throw new exc();
                }catch (exc e){}
            }
            else
            {
                while (T) {
                    st.setString(1, mat.group());
                    st.execute();
                    T = mat.find();
                }
            }
            con.close();
        }
}

//Data fetching from the stored database only the last string valid emails
class showww {
    public void data() throws ClassNotFoundException,SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:8809/RahulDatabase","root","root");
        ResultSet st = con.prepareStatement("select * from data").executeQuery();
        boolean T = true ;
        if(st.next()==false)
        {
            try{
                throw new exc(8);
            }catch (exc e){return;}
        }
        else
        {
            while (T){
                System.out.println(st.getString("email"));
                T=st.next();
            }
        }
        con.close();

    }
}

// main method
public class JDBC_practice {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the data....");
     insert_dataToDatabase obj= new insert_dataToDatabase();
     obj.insert(sc.nextLine());
     showww sho = new showww();
     sho.data();

        System.out.println("rest of the java programs....🤓");
    }
}


// this is for the  custom exception
class exc extends  RuntimeException{
    exc(){
        System.out.println("No match found!!!");
    }
    exc(int e){
        System.out.println("No Updated data will found");
    }
}
