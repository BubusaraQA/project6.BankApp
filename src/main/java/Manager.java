public class Manager extends Employee implements Salary {


    public Manager(String employeeName, int employeeId, String employeeDateOfBirth) {
        super(employeeName, employeeId, Consts.MANAGER_TYPE, Consts.MANAGER_DEFAULT_SALARY, employeeDateOfBirth);
    }


    public void hireEmployee(String employyName){
        System.out.println(String.format("The employee %s was hired", employyName));
    }

    public void fireEmployee(String employyName){
        System.out.println(String.format("The employee %s was fired", employyName));
    }

    @Override
    public void receiveSalary() {
        System.out.println(String.format("The %f sum was sent to the managers bank account", getSalary()));
    }
}
