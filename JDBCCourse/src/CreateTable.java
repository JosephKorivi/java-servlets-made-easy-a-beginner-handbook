import java.sql.*;
public class CreateTable {
    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String pass = "pgdb";
        /*

        1. import the packages  (improt java.sql.*;)
        2. load and register the driver
        3. Create connection
        4. Create statement
        5. Execute Statement
        6. Close the connection.

         */
        Connection con = DriverManager.getConnection(url, user, pass);
        Statement st = con.createStatement();
        String s = "create table empa(empno int, empname char(10), empsal int)";
        st.executeUpdate(s);
        System.out.println("Table Created Successfully...");
        con.close();
    }
}
