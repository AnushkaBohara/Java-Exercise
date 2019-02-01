import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerFunctions {

    public Manager createManager() {
        System.out.println("Enter Manager Details");
        Scanner sc = new Scanner(System.in);
        String managerId = sc.nextLine();
        String name = sc.nextLine();
        return new Manager(managerId, name);
    }

    public void assignEmployeeDepartment(String managerId, String department, List<Manager> managerList, List<Employee> employeeList) {
        List<String> employeesUnderManager = getManager(managerId, managerList).getEmployeesUnderManager();
        for (Employee employee : employeeList) {
            if (employeesUnderManager.contains(employee.getEmployeeId())) {
                employee.setDepartment(department);
            }
        }
    }

    public void deleteManager(String managerId, List<Manager> managerList) {
        managerList.remove(getManager(managerId, managerList));
    }

    public void deleteAndReassign(String managerId, String newManagerId, List<Manager> managerList) {
        Manager manager = getManager(managerId, managerList);
        List<String> employeesUnderManager = manager.getEmployeesUnderManager();
        managerList.remove(manager);

        Manager newManager = getManager(newManagerId, managerList);
        newManager.setEmployeesUnderManager(employeesUnderManager);
    }


    private Manager getManager(String managerId, List<Manager> managerList) {
        Manager manager1 = new Manager();
        for (Manager manager : managerList) {
            if (manager.getManagerId().equals(managerId)) {
                manager1 = manager;
            }
        }
        return manager1;
    }
}
