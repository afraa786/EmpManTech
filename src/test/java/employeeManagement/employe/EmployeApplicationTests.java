package employeeManagement.employe; 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeApplicationTests {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employe"; // Update port if necessary
        String username = "root";
        String password = "wandamaximoff@_123";

        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connection successful!");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
