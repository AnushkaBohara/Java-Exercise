import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Throwable {
        List<Employee> employeeList = new ArrayList<>();
        List<Manager> managerList = new ArrayList<>();

        ManagerFunctions managerFunctions = new ManagerFunctions();
        EmployeeFunctions employeeFunctions = new EmployeeFunctions();

        managerList.add(managerFunctions.createManager());
        managerList.add(managerFunctions.createManager());
        managerList.add(managerFunctions.createManager());

        employeeList.add(employeeFunctions.createEmployee(managerList.get(0)));
        employeeList.add(employeeFunctions.createEmployee(managerList.get(1)));

        employeeFunctions.printName(employeeList);
        System.out.println(employeeList);
        System.out.println(managerList);

        managerFunctions.assignEmployeeDepartment(managerList.get(0).getManagerId(), "A", managerList, employeeList);
        managerFunctions.deleteManager(managerList.get(0).getManagerId(), managerList);
        managerFunctions.deleteAndReassign(managerList.get(0).getManagerId(), managerList.get(1).getManagerId(), managerList);

        System.out.println(managerList);
    }

}
