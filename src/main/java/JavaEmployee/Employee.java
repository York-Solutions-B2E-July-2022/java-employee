package JavaEmployee;

import java.util.UUID;

public class Employee {
    UUID id;
    String name;
    int year_joined;
    float salary;
    String address;
    public Employee(String name, int year_joined, float salary, String address){
        this.name = name;
        this.year_joined = year_joined;
        this.salary = salary;
        this.address = address;
    }

    @Override
    public String toString() {

        return String.format("%s \t %s \t %s",
                this.name,
                this.year_joined,
                this.address);
    }
    public void setId(UUID id){
        this.id = id;
    }
}
