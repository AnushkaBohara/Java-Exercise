import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{

    private String managerId;
    private List<Employee> employeeList;

    public Manager(String managerId){
        this.managerId = managerId;
        this.employeeList = new ArrayList<>();
        System.out.println("Manager created");
    }

    public String getManagerId() {
        return managerId;
    }


    public void setDepartment(Employee employee, char dept){
        if(employee.manager == this){
            employee.setDepartment(dept);
        }
        addToEmployeeList(employee);
    }

    public char getDepartment(Employee employee){
        return employee.getDepartment();
    }


    public void addToEmployeeList(Employee employee){
        this.employeeList.add(employee);
    }


    public void delete(){
        for (Employee employee : this.employeeList){
            employee = null;
        }
    }

    public void reassign(Manager manager){
        for (Employee employee : this.employeeList){
            employee.setManager(manager);
        }
    }
}
