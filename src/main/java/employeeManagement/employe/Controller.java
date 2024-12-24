package employeeManagement.employe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {
    private List<Employee> employees = new ArrayList<>();

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @PostMapping("/employees")
    public String createEmployee(@RequestBody Employee newEmployee) {
        employees.add(newEmployee);
        return "Saved Successfully";
    }
}
