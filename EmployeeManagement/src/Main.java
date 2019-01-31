import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static Manager createManager(){
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager(sc.nextLine());
        return manager;
    }

    public static Employee createEmployee(Manager manager){
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();
        BigInteger phoneNumber = sc.nextBigInteger();
        String EmployeeId = sc.nextLine();
        String type = sc.nextLine();
        Employee employee = new Employee(fullName, phoneNumber, EmployeeId, type, manager);
        return employee;
    }

    public static void delete(Manager manager){
        manager.delete();
        manager = null;
    }

    public static void deleteAndReassign(Manager manager, Manager newManager) throws Throwable{
        manager.reassign(newManager);
        manager = null;
    }

    public static void main(String[] args) throws Throwable {
        Manager manager1 = createManager();
        Manager manager2 = createManager();
        Employee employee1 = createEmployee(manager1);
        Employee employee2 = createEmployee(manager1);
        employee1.getName();
        manager1.setDepartment(employee1, 'A');
        manager1.setDepartment(employee2, 'B');
        delete(manager2);
        Manager manager3 = createManager();
        deleteAndReassign(manager1, manager3);
    }
}
