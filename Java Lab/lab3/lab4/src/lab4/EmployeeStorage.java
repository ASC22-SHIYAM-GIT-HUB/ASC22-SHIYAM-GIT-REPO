package lab4;

import java.util.ArrayList;
import java.util.List;

public class EmployeeStorage {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public Employee getEmployee(int empNo) {
        for (Employee e : employees) {
            if (e.getEmpNo() == empNo) return e;
        }
        return null;
    }

    public boolean updateEmployee(Employee emp) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getEmpNo() == emp.getEmpNo()) {
                employees.set(i, emp);
                return true;
            }
        }
        return false;
    }

    public boolean deleteEmployee(int empNo) {
        return employees.removeIf(e -> e.getEmpNo() == empNo);
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }
}
