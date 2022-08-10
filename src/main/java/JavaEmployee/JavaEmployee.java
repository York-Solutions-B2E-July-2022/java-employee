package JavaEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class JavaEmployee {
    public static void main(String[] args){
       List<Employee> employees = List.of(
                new Employee("Travis", 2021, 1000, "123 anytown usa"),
                new Employee("Billy", 2019, 1000, "123 anytown usa"),
                new Employee("Joe", 2022, 1000, "123 anytown usa")
               );
        EmployeeManger employeeManger = new EmployeeManger(new ArrayList());

        UUID id = employeeManger.add(new Employee("Bob", 2000,1000, "some town"));
        UUID id2 = employeeManger.add(new Employee("Bob1", 2000,1000, "some town"));
        System.out.println(employeeManger);
        employeeManger.delete(id);
        System.out.println(employeeManger);
        employeeManger.replace(id2, new Employee("Travis", 1992, 1000, "123 four street"));
        System.out.println(employeeManger);

        //System.out.println("Name\tYear\tAddress\t");
        //for (Employee emp: employees) {
        //    System.out.println(emp);
        //}
    }
}
