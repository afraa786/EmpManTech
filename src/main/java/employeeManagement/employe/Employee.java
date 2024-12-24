package employeeManagement.employe;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String empID;
    private String name;
    private String email;
    private String number;
}
