package lab4;

import java.util.Scanner;

public class EmployeeApp {
    public static void main(String[] args) {
        EmployeeStorage storage = new EmployeeStorage();
        EmployeeView view = new EmployeeView(storage);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Employee\n2. Display All\n3. Update Employee\n4. Delete Employee\n5. Exit");
            System.out.print("Choose option: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    view.addEmployee();
                    break;
                case 2:
                    view.displayAllEmployees();
                    break;
                case 3:
                    view.updateEmployee();
                    break;
                case 4:
                    view.deleteEmployee();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
