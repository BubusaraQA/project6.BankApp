public class BankAppMain {
    public static void main(String[] args) {

        Manager manager = new Manager("John Smith", 1, "10.01.1985");
        Accountent accountent1 = new Accountent("Anna Trevis", 2, "02.05.1980");
        Accountent accountent2 = new Accountent("Maria Petrova", 3, "01.08.1985");
        Accountent accountent3 = new Accountent("Ivan Sidorov", 4, "25.09.1976");
        Clerk clerk1 = new Clerk("Lorry Black", 5, "07.10.1970");
        Clerk clerk2 = new Clerk("Aidai Gold", 6, "30.10.1990");
        Clerk clerk3 = new Clerk("Mike Super", 7, "16.12.1970");

        System.out.println(manager.toString());
        System.out.println(accountent1.toString());
        System.out.println(accountent2.toString());
        System.out.println(accountent3.toString());
        System.out.println(clerk1.toString());
        System.out.println(clerk2.toString());
        System.out.println(clerk3.toString());
        System.out.println();


        manager.fireEmployee("Valy Popov");
        manager.hireEmployee("Maria Petrova");
        manager.receiveSalary();
        System.out.println();

        accountent1.setAccountName("Month Salary");
        accountent2.setAccountName("Expenses");
        System.out.println(accountent1.closeAccount() + " by " + accountent1.getName() + " accountant");
        accountent2.openNewAccount();
        Consts.setReportName("Weekly budget");
        Consts.setReportName2("Month budget");
        accountent2.createReports();
        accountent1.createReports2();
        accountent3.createReports3();
        accountent1.receiveSalary();
        accountent2.receiveSalary();
        System.out.println();

        clerk1.answerToCustomers("Susanna");
        clerk2.callToCustomers("Gabriel");
        clerk1.receiveSalary();
        clerk2.receiveSalary();
        clerk3.receiveSalary();
        System.out.println();


    }


}
