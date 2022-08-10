package JavaEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class JavaEmployee {
    public static void main(String[] args){
       //List<Employee> employees = List.of(
       //         new Employee("Travis", 2021, 1000, "123 anytown usa"),
       //         new Employee("Billy", 2019, 1000, "123 anytown usa"),
       //         new Employee("Joe", 2022, 1000, "123 anytown usa")
       //        );
        EmployeeManger employeeManger = new EmployeeManger(new ArrayList());

        UUID id1 = employeeManger.add(new Employee("Travis", 2000,499, "some town"));
        UUID id2 = employeeManger.add(new Employee("Billy", 2000,200, "some town"));
        UUID id3 = employeeManger.add(new Employee("Bob", 2000,310, "some town"));
        UUID id4 = employeeManger.add(new Employee("Joe", 2000,800, "some town"));
        UUID id5 = employeeManger.add(new Employee("David", 2000,200, "some town"));
        employeeManger.applyRaises();
        float avgHourly = employeeManger.getAvgHourly(40);
        System.out.println(avgHourly);
        System.out.println(employeeManger);

        /////////////////////
        //Employee joe = new Employee("Joe", 2022, 300, "123 anytown usa");
        //System.out.println(joe.getInfo(40));
        //System.out.println(joe.salary);
        //joe.addSalary();
        //Employee bill = Employee.buildEmployee("bill");
        //System.out.println(joe.salary);

        //System.out.println("Name\tYear\tAddress\t");

        //for (Employee emp: employees) {
        //    System.out.println(emp);
        //}
    }
    public static float getInfo(float salary, int hours){
         return salary / (hours * 52);
    }
    public static void addSalary(Employee employee){
        if(employee.salary < 500 ) {
            employee.salary += 10;
        }
    }
}
