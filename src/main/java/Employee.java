import java.util.SortedMap;

public abstract class Employee {

    private String name;
    private int id;
    private double salary;
    private String position;
    private String dateOfBirth;

    public Employee(String employeeName, int employeeId, String employeePosition, double employeeSalary, String employeeDateOfBirth){
        name= employeeName;
        id = employeeId;
        position=employeePosition;
        salary=employeeSalary;
        dateOfBirth=employeeDateOfBirth;
    }


    public String getName() { return name;   }
    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }



    public String toString (){
        String txt = String.format("Employee name: %s, position: %s, salary: %f", name, position, salary);
        return txt;
    }
}
