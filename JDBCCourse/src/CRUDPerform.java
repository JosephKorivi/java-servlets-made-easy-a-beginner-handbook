import java.sql.*;
public class CRUDPerform {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String pass = "pgdb";
        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(url, user, pass);
        Statement st = con.createStatement();
        // Creating Table...
        String sql1 = "create table v1(stno int, stname char(10), stpr int)";
        st.execute(sql1);
        System.out.println("Table Created Successfully...");
        // Inserting data(Records) into the table..
        String sql2 = "insert into v1 (stno, stname, stpr) values (111, 'amit', 78), (222, 'seema', 89)";
        st.executeUpdate(sql2);
        System.out.println("Records inserted Successfully...");
        //  Updating the Records..
        String sql3 = "update v1 set stname='nita' where stno=222";
        st.executeUpdate(sql3);
        System.out.println("Records Updated Successfully...");
        //  Displaying all the Records to the console..
        String sql4 = "select * from v1";
        ResultSet rs = st.executeQuery(sql4);
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
        }
        System.out.println("All the Records are dispalyed above in the Console..");
        con.close();
    }
}
