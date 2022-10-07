public class Accountent extends Employee implements Salary{

    private String accountName;
    private String reportName3 = "Annual budget";


    public Accountent(String employeeName, int employeeId, String employeeDateOfBirth) {
        super(employeeName, employeeId, Consts.ACCOUNTANT_TYPE,  Consts.ACCOUNTANT_DEFAULT_SALARY, employeeDateOfBirth);
    }


    public void createReports(){
        System.out.println(String.format("The %s report was created by %s accountant", Consts.getReportName(), getName())); }

    public void createReports2(){
        System.out.println(String.format("The %s report was created by %s accountant", Consts.getReportName2(), getName())); }

    public void createReports3(){
        System.out.println(String.format("The " + reportName3 + " report was created by %s accountant", getName())); }


    public void openNewAccount(){
        System.out.println(String.format("The %s account was opened by %s accountant", accountName, getName()));
    }

    public String closeAccount(){
        String text = String.format("The %s account was closed", accountName);
        return text;
    }

    @Override
    public void receiveSalary() {
        System.out.println(String.format("The %f sum was sent to the %s employee bank account", getSalary(), getName()));
    }

    public String getAccountName() {
        return accountName;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

}
