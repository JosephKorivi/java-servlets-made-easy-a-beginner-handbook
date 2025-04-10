import java.sql.*;
public class InsertRecords2 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String pass = "pgdb";
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);
        Statement st = con.createStatement();
        String sql = "insert into z1 (empno, empname, empsal, empgrade) values (777, 'amika', 5000, 'a'), (888, 'akanksha', 5500, 'b')";
        st.executeUpdate(sql);
        System.out.println("Records Inserted Successfully...");
        con.close();
    }
}
