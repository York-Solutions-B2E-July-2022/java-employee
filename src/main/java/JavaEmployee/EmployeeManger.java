package JavaEmployee;

import java.util.ArrayList;
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
        //ArrayList<Employee> newarray = new ArrayList<Employee>();
        //for(Employee emp :employees){
        //    if(func(emp)){
        //        newarray.add(emp);
        //    }
        //}
    }

    public void replace(UUID emp_id, Employee employee) {
        this.employees = this.employees.stream().map((emp)->{
            if(emp.id == emp_id) {
                employee.setId(emp_id);
                return employee;
            }
            return emp;
        }).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        //System.out.println("Name\tYear\tAddress\t");

        String newstring = "Name\tYear\tAddress\tSalary\n";
        for ( Employee emp: this.employees) {
            newstring += emp.toString() + "\n";
        }
        return newstring;
    }

    public float getAvgHourly(int hours){
        float total = 0;
        for (Employee emp: this.employees){
            total += emp.getInfo(hours);
        }
        return total / this.employees.size();
    }
    public void applyRaises(){
        for (Employee emp: this.employees){
            emp.addSalary();
        }
    }
}
