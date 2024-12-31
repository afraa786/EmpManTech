package employeeManagement.employe;

import java.util.List;

public interface EmployeeService {
    String createEmployee(Employee employee); // Method to create a new employee
    List <Employee> readEmployee();            // Method to get a list of all employees
    boolean deleteEmployee(Long id);   
    String updateEmployee(Long id, Employee employee); // Method to update an employee (PUT)
    String partialUpdateEmployee(Long id, Employee employee); 
     // Method to update an employee by ID
}