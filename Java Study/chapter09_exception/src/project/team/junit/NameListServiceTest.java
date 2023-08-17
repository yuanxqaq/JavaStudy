package project.team.junit;

import org.junit.Test;
import project.team.domain.Employee;
import project.team.service.NameListService;
import project.team.service.TeamException;

/**
 * ClassName: NameListServiceTest
 * Description:
 *
 * @Author ZhangJiaYuan
 * @Create 2023/4/18 13:32
 * @Version 1.0
 */
public class NameListServiceTest {
    @Test
    public void testGetAllEmployees(){
        NameListService nameListService = new NameListService();
        Employee[] employees = nameListService.getAllEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
    @Test
    public void testGetEmployee(){
        try {
            NameListService nameListService = new NameListService();
            int id = 3;
            id = 13;
            Employee employee = nameListService.getEmployee(id);
            System.out.println(employee);
        } catch (TeamException e) {
//            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
