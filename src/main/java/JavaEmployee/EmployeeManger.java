package JavaEmployee;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class EmployeeManger {
    List<Employee> employees;
    public EmployeeManger(List<Employee> employees){
        this.employees = employees;
    }

    public UUID add(Employee emp) {
        UUID id = UUID.randomUUID();
        emp.setId(id);
        this.employees.add(emp);
        return id;
    }

    public void delete(UUID emp_id) {
        this.employees = this.employees.stream().filter((emp)->{
            return emp.id != emp_id;
        }).collect(Collectors.toList());
    }

    public void replace() {
    }
}
