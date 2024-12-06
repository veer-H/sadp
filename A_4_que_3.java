import java.util.ArrayList;
import java.util.List;

// Component Interface
interface Employee {
    void showDetails();
    void assignTask(String task);
}

// Concrete Employee class
class RegularEmployee implements Employee {
    private String name;

    public RegularEmployee(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("Employee: " + name);
    }

    @Override
    public void assignTask(String task) {
        System.out.println(name + " is working on: " + task);
    }
}

// Manager class, which can have Employees and other Managers
class Manager implements Employee {
    private String name;
    private List<Employee> team = new ArrayList<>();

    public Manager(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        team.add(employee);
    }

    public void removeEmployee(Employee employee) {
        team.remove(employee);
    }

    @Override
    public void showDetails() {
        System.out.println("Manager: " + name);
        for (Employee emp : team) {
            emp.showDetails();
        }
    }

    @Override
    public void assignTask(String task) {
        System.out.println(name + " is delegating the task: " + task);
        for (Employee emp : team) {
            emp.assignTask(task);
        }
    }
}

public class A_4_que_3 {
    public static void main(String[] args) {
        RegularEmployee emp1 = new RegularEmployee("Alice");
        RegularEmployee emp2 = new RegularEmployee("Bob");

        Manager manager1 = new Manager("John");
        manager1.addEmployee(emp1);
        manager1.addEmployee(emp2);

        Manager generalManager = new Manager("Sarah");
        generalManager.addEmployee(manager1);

        generalManager.showDetails();
        generalManager.assignTask("Complete the report");

    }
}
