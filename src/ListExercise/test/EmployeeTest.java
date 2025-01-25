package ListExercise.test;

import ListExercise.service.EmployeeService;

public class EmployeeTest {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        employeeService.CollectingData();
        employeeService.salaryIncrease();
    }
}
