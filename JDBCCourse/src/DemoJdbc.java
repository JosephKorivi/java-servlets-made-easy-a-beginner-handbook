
// Step - 1 Importing the SQl Package
import java.sql.*;

public class DemoJdbc {
    public static void main(String[] args) throws Exception {

        /*
            The 6 || 7 Steps for Connecting to the Database are
            1. Importing the Packages (SQL)
            2. Load and Register the Driver
            3. Create a Connection
            4. Create a Statement
            5. Execute a Statement
            6. Close
         */

        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String password = "pgdb";
        String sql = "SELECT * FROM student";
        // Step - 2 Load and Register the Driver
        Class.forName("org.postgresql.Driver");
        // Step - 3 Create a Connection
        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("Established Connection..!");
        //  Step - 4 Create a Statement
        Statement st = con.createStatement();
        // Step - 5 Execute a Statement
        ResultSet rs = st.executeQuery(sql);
//        System.out.println(rs.next());
        while (rs.next()) {
            System.out.print(rs.getInt("sid") + " - " + rs.getString("sname") + " - " + rs.getInt("marks"));
            System.out.println();
        }
        // Step - 6 Closing the Connection
        con.close();
    }
}
