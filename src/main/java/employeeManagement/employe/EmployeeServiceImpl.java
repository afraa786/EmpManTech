package employeeManagement.employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;  // Import the List class
import java.util.ArrayList;  // Import the ArrayList class


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository; //dependency injection

    @Override
    public String createEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "Saved Successfully";
    }

    @Override
    public List<Employee> readEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public boolean deleteEmployee(Long id) {
        if (employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public String updateEmployee(Long id, Employee employee) {
        if (employeeRepository.existsById(id)) {
            employee.setId(id); // Ensure the ID remains the same
            employeeRepository.save(employee);
            return "Employee updated successfully";
        }
        return "Employee not found";
    }

    @Override
    public String partialUpdateEmployee(Long id, Employee employee) {
        return employeeRepository.findById(id)
                .map(existingEmployee -> {
                    if (employee.getName() != null) {
                        existingEmployee.setName(employee.getName());
                    }
                    if (employee.getEmail() != null) {
                        existingEmployee.setEmail(employee.getEmail());
                    }
                    if (employee.getNumber() != null) {
                        existingEmployee.setNumber(employee.getNumber());
                    }
                    employeeRepository.save(existingEmployee);
                    return "Employee partially updated successfully";
                })
                .orElse("Employee not found");
    }
}
