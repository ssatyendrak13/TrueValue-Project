package test;
import java.sql.*;
public class Test {
    
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/tempdb";
            String id = "root";
            String password = "Root@123";
            Connection con = DriverManager.getConnection(url , id , password);
            Statement stmt = con.createStatement();
            String sql = "select *from login";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
                System.out.println(rs.getString(3));
            }
        } catch (Exception e) {
        }
    }
    
}
