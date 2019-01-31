import java.math.BigInteger;

public class Employee {
    private String fullName;
    private BigInteger phoneNumber;
    private String lastName;
    private String EmployeeId;
    private String type;
    Manager manager;
    protected char department;

    public Employee(){}

    public Employee(String fullName, BigInteger phoneNumber, String EmployeeId, String type, Manager manager){
        this.fullName = fullName;
        String[] array = (this.fullName).split(" ");
        this.lastName = array[array.length - 1];
        this.phoneNumber = phoneNumber;
        this.EmployeeId = EmployeeId;
        this.type = type;
        this.manager = manager;
        System.out.println("Employee created");
    }

    public String getEmployeeId() {
        return EmployeeId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public BigInteger getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(BigInteger phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    protected char getDepartment() {
        return department;
    }

    protected void setDepartment(char department) {
        this.department = department;
    }

    public Manager getManager() {
        return manager;
    }

    public void getName(){
        System.out.println("Full name: " + fullName);
        System.out.println("Last name: " + lastName);
    }

    public void setManager(Manager manager) {
        this.manager = manager;
        manager.addToEmployeeList(this);
    }

    public void readDetails(){
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Name: " + getFullName());
        System.out.println("Phone Number: " + getPhoneNumber().toString());
        System.out.println("Type: " + getType());
        System.out.println("Manager ID: " + getManager().getManagerId());
    }
}
