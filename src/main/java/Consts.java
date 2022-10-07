public class Consts {

    public static final String MANAGER_TYPE="manager";
    public static final String ACCOUNTANT_TYPE="accountant";
    public static final String CLERK_TYPE="clerk";

    public static final double MANAGER_DEFAULT_SALARY = 10000;
    public static final double ACCOUNTANT_DEFAULT_SALARY = 7000;
    public static final double CLERK_DEFAULT_SALARY = 5000;
    public static String reportName1;
    public static String reportName2;




    public static String getReportName() {
        return reportName1;
    }
    public static void setReportName(String reportName) {
        Consts.reportName1 = reportName;
    }

    public static String getReportName2() {
        return reportName2;
    }
    public static void setReportName2(String reportName2) {
        Consts.reportName2 = reportName2;
    }


}
