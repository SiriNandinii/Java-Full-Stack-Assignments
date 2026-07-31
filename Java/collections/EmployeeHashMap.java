package collections;

import java.util.HashMap;
import java.util.Map;

public class EmployeeHashMap {

    public static void main(String[] args) {

        Map<Integer, Employee> employeesMap = new HashMap<>();

        employeesMap.put(101, new Employee(101, "Rahul", "Hyderabad"));
        employeesMap.put(102, new Employee(102, "Sneha", "Chennai"));
        employeesMap.put(103, new Employee(103, "Arjun", "Bangalore"));
        employeesMap.put(104, new Employee(104, "Priya", "Delhi"));
        employeesMap.put(105, new Employee(105, "Kiran", "Mumbai"));

        // Display all employees
        System.out.println("Employee Details:");

        for (Map.Entry<Integer, Employee> entry : employeesMap.entrySet()) {

            System.out.println("Key : " + entry.getKey());

            System.out.println(entry.getValue());

            System.out.println();
        }

        // Search employee by ID
        int employeeId = 103;

        System.out.println("Searching Employee with ID : " + employeeId);

        Employee employee = employeesMap.get(employeeId);

        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee Not Found.");
        }

    }
}