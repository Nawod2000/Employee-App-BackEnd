package orm.emp.employeeController;


import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import orm.emp.Service.impl.EmployeeServiceImpl;
import orm.emp.dto.Employee;
import orm.emp.entity.EmployeeEntity;


import java.util.List;

@RestController
@RequestMapping("/emp-controller")
@RequiredArgsConstructor
@CrossOrigin
public class EmployeeController {


    final EmployeeServiceImpl service;
    @PostMapping("/add-employee")
    public void addEmployee(@RequestBody Employee employee){
        service.addEmployee(employee);
    }

    @GetMapping("/get-all")
    public List<EmployeeEntity> getAll(){
        return service.getAll();
    }

    @DeleteMapping("/delete-employee/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String deleteEmployee(@PathVariable Long id){
        service.deleteEmployeeById(id);
        return "Delete";
    }

    @PostMapping("/update-employee")
    public void updateEmployee(@RequestBody Employee employee){
        service.updateEmployee(employee);
    }

    @GetMapping("/find-by-id/{id}")
    public Employee findById(@PathVariable Long id){
        return service.findById(id);
    }

    @GetMapping("/find-by-first-name/{firstName}")
    public Employee findByFirstName(@PathVariable String firstName){
        return service.findByFirstName(firstName);
    }
}
