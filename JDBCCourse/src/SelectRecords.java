import java.sql.*;
public class SelectRecords {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String pass = "pgdb";
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);
        Statement st = con.createStatement();
        String sql = "select * from z1 where empno = 333";
        ResultSet rs = st.executeQuery(sql);
        if (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
            System.out.println("Records Feteched Successfully...");
        } else {
            System.out.println("Records not Exist..");
        }
        con.close();
    }
}
