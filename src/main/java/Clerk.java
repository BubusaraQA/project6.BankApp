public class Clerk extends Employee implements Salary {

    public Clerk(String employeeName, int employeeId, String employeeDateOfBirth) {
        super(employeeName, employeeId, Consts.CLERK_TYPE, Consts.CLERK_DEFAULT_SALARY, employeeDateOfBirth);
    }


    public void callToCustomers (String customerName){
        System.out.println(String.format(getName() + " called to %s customer ", customerName ));
    }

    public void answerToCustomers (String customerName){
        System.out.println(String.format("The %s customer's call was received by " + getName(), customerName));
    }

    @Override
    public void receiveSalary() {
        System.out.println(String.format("The %f sum was sent to the %s employee bank account", getSalary(), getName()));
        }

    }

