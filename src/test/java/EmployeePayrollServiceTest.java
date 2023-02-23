import java.util.List;

import crudeopreation.EmployeePayrollData;
import crudeopreation.EmployeePayrollService;
import org.junit.Assert;
import org.junit.Test;


public class EmployeePayrollServiceTest {
    private static final EmployeePayrollService.IOSevice DB_IO = null;

    @Test
    public void givenEmployeePayrollInDB_WhenRetrived_ShouldMatchEmployeeCount() {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        List<EmployeePayrollData> employeePayrollData = employeePayrollService.readEmployeePayrollData(DB_IO);
        Assert.assertEquals(3, employeePayrollData.size());
    }
}