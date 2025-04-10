import java.sql.*;
public class InsertRecords {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String pass = "pgdb";
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);
        Statement st = con.createStatement();
        String sql = "insert into empa values(111, 'amit', 5600)";
        st.executeUpdate(sql);
        System.out.println("Records Inserted Successfully...");
        con.close();
    }
}
