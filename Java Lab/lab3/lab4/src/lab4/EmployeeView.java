package lab4;

import java.util.List;
import java.util.Scanner;

public class EmployeeView {
    private EmployeeStorage storage;
    private Scanner scanner = new Scanner(System.in);

    public EmployeeView(EmployeeStorage storage) {
        this.storage = storage;
    }

    public void addEmployee() {
        System.out.println("Enter EmpNo:");
        int empNo = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter First Name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter Last Name:");
        String lastName = scanner.nextLine();
        System.out.println("Enter City:");
        String city = scanner.nextLine();
        System.out.println("Enter Salary:");
        double salary = Double.parseDouble(scanner.nextLine());

        Employee emp = new Employee(empNo, firstName, lastName, city, salary);
        storage.addEmployee(emp);
        System.out.println("Employee added!");
    }

    public void displayAllEmployees() {
        List<Employee> employees = storage.getAllEmployees();
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    public void updateEmployee() {
        System.out.println("Enter EmpNo to update:");
        int empNo = Integer.parseInt(scanner.nextLine());
        Employee emp = storage.getEmployee(empNo);
        if (emp == null) {
            System.out.println("Employee not found");
            return;
        }
        System.out.println("Enter new City:");
        String city = scanner.nextLine();
        System.out.println("Enter new Salary:");
        double salary = Double.parseDouble(scanner.nextLine());

        emp.setCity(city);
        emp.setSalary(salary);
        storage.updateEmployee(emp);
        System.out.println("Employee updated!");
    }

    public void deleteEmployee() {
        System.out.println("Enter EmpNo to delete:");
        int empNo = Integer.parseInt(scanner.nextLine());
        boolean removed = storage.deleteEmployee(empNo);
        if (removed) {
            System.out.println("Employee deleted.");
        } else {
            System.out.println("Employee not found.");
        }
    }
}
