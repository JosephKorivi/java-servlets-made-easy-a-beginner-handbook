import java.sql.*;
import java.util.Scanner;

public class ProjectCRUD {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/demo";
        String user = "postgres";
        String password = "pgdb";

        // Create Operation
        String insertData = "INSERT INTO users (username, password, email, first_name, last_name, date_of_birth, created_at, updated_at, is_active, role, profile_picture_url, bio) " +
                "VALUES (?, ?, ?, ?, ?, ?, NOW(), NOW(), ?, ?, ?, ?)";

        Scanner scanner = new Scanner(System.in);

        // Collect user input
        System.out.print("Enter Username: ");
        String username = scanner.nextLine();

        System.out.print("Enter Password: ");
        String passwordInput = scanner.nextLine(); // Ideally, this should be hashed

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
        String dobInput = scanner.nextLine();
        Date dateOfBirth = Date.valueOf(dobInput);

        System.out.print("Is Active (true/false): ");
        boolean isActive = scanner.nextBoolean();
        scanner.nextLine(); // Consume newline left-over

        System.out.print("Enter Role (USER, ADMIN, MODERATOR): ");
        String role = scanner.nextLine();

        System.out.print("Enter Profile Picture URL: ");
        String profilePictureUrl = scanner.nextLine();

        System.out.print("Enter Bio: ");
        String bio = scanner.nextLine();

        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection Established..!");

            PreparedStatement st = con.prepareStatement(insertData);
            st.setString(1, username);
            st.setString(2, passwordInput);
            st.setString(3, email);
            st.setString(4, firstName);
            st.setString(5, lastName);
            st.setDate(6, dateOfBirth);
            st.setBoolean(7, isActive);
            st.setString(8, role);
            st.setString(9, profilePictureUrl);
            st.setString(10, bio);

            int rowsAffected = st.executeUpdate();
            System.out.println("Rows affected: " + rowsAffected);

            st.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            scanner.close(); // Close the scanner
        }
    }
}
