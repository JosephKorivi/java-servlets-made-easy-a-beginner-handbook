
// Step - 1: Importing the packages

import org.postgresql.util.PSQLException;

import javax.xml.transform.Result;
import java.sql.*;

public class CRUD {
public static void main(String[] args) throws Exception {
        /*
            Steps to Execute the JDBC
            Step - 1: importing the packages
            Step - 2: Load and Register Driver
            Step - 3: Create Connection
            Step - 4: Create Statement
            Step - 5: Execute Statement
            Step - 6: Close
         */

        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String password = "pgdb";
//        String sql = "delete from student where sid = 5";
        // Step - 2: Load and Register Driver
//        Class.forName("org.postgresql.Driver");
        // Step - 3: Create Connection
        Connection con = DriverManager.getConnection(url, user, password);
        System.out.println("Connection Established..!");
        //  Step - 4: Create Statement
        Statement st = con.createStatement();
        // Step - 5: Execute Query
//        st.executeUpdate(sql);
        System.out.println("Operation Done..!");
        // Step - 6: Close
        con.close();
        System.out.println("Connection closed..");
    }
}
