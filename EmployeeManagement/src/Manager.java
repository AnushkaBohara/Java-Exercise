import java.util.ArrayList;
import java.util.List;

public class Manager {
    private String managerId;
    private String name;
    private List<String> employeesUnderManager = new ArrayList<>();

    public Manager() {
    }

    public Manager(String managerId, String name) {
        this.managerId = managerId;
        this.name = name;
    }

    public void setEmployeesUnderManager(String empId) {
        this.employeesUnderManager.add(empId);
    }

    public String getManagerId() {
        return managerId;
    }

    public List<String> getEmployeesUnderManager() {
        return employeesUnderManager;
    }

    public void setEmployeesUnderManager(List<String> employeesUnderManager) {
        this.employeesUnderManager.addAll(employeesUnderManager);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "managerId='" + managerId + '\'' +
                ", name='" + name + '\'' +
                ", employeesUnderManager=" + employeesUnderManager +
                '}';
    }
}
