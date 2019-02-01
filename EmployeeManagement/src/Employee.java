import java.math.BigInteger;

public class Employee {
    private String fullName;
    private String phoneNumber;
    private String lastName;
    private String employeeId;
    private String type;
    private String department;

    public Employee(String fullName, String phoneNumber, String employeeId, String type) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.employeeId = employeeId;
        this.type = type;
    }

    public String getFullName() {
        return fullName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", lastName='" + lastName + '\'' +
                ", employeeId='" + employeeId + '\'' +
                ", type='" + type + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
