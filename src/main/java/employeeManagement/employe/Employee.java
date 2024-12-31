package employeeManagement.employe;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity  // Marks this class as a JPA entity
@Data  // Generates getters, setters, toString, equals, and hashCode methods
@NoArgsConstructor  // Generates a no-arguments constructor
@AllArgsConstructor  // Generates a constructor with all arguments
public class Employee {

    @Id  // Specifies the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Configures auto-increment for the primary key
    private Long id;  // Unique identifier for the employee

    @NotBlank(message = "Name cannot be blank")  // Ensures the name cannot be blank
    private String name;

    @Email(message = "Email should be valid")  // Validates that the email follows a correct email pattern
    private String email;

    @Pattern(regexp = "\\d{10}", message = "Number must be a 10-digit phone number")  // Ensures phone number is 10 digits
    private String number;
}
