import java.sql.*;

public class JdbcConnection {
    public static void main(String []args) throws Exception{
        Class.forName("org.postgresql.Driver");
        String url="jdbc:postgresql://localhost:5432/postgres";
        String uname ="postgres";
        String upassword="Apple";
                String query="select student_id,course_id,name from student_table where student_id=1";
        Connection con =DriverManager.getConnection(url,uname,upassword);
        Statement st= con.createStatement();
        ResultSet rs=st.executeQuery(query);
        rs.next();
        String name =rs.getString("name");
        System.out.println("Output name is"+name);
        st.close();
        con.close();



    }
}
