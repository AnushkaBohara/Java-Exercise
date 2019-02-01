import java.math.BigInteger;
import java.util.List;
import java.util.Scanner;

public class EmployeeFunctions {

    public Employee createEmployee(Manager manager){
        System.out.println("Enter Employee Details");

        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();
        String phoneNumber = sc.nextLine();
        String employeeId = sc.nextLine();
        String type = sc.nextLine();
        manager.setEmployeesUnderManager(employeeId);
        return new Employee(fullName, phoneNumber, employeeId, type);
    }

    public void printName(List<Employee> employees){
        for (Employee employee : employees){
            System.out.println(employee.getFullName());
            System.out.println(employee.getLastName());
        }
    }
}
