import java.sql.*;
public class UpdateRecords {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String pass = "pgdb";
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);
        Statement st = con.createStatement();
        String sql = "update z1 set empname = 'mukesh' where empno = 222";
        st.executeUpdate(sql);
        System.out.println("Records Updated Successfully...");
        con.close();
    }
}
