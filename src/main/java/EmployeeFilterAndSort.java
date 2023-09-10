import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeFilterAndSort {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John"));
        employees.add(new Employee("Alice"));
        employees.add(new Employee("David"));
        employees.add(new Employee("Bob"));

        List<Employee> filteredAndSortedEmployees = employees.stream()
                .filter(e -> e.getName().startsWith("A")) // Filter based on names starting with 'A'
                .sorted(Comparator.comparing(Employee::getName).reversed()) // Sort in descending order
                .collect(Collectors.toList());

        System.out.println("Filtered and Sorted Employees (Descending Order):");
        for (Employee employee : filteredAndSortedEmployees) {
            System.out.println(employee.getName());
        }
    }

    static class Employee {
        private String name;

        public Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
