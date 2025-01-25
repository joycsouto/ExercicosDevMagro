package ListExercise.service;


import ListExercise.domain.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService {

        Scanner scanner = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();
        public void CollectingData () {

            System.out.println("How many employers will be registered?");
            int quantityEmployers = scanner.nextInt();
            for (int i = 0; i < quantityEmployers; i++) {

                System.out.println("Employee #" + i);
                System.out.println("Id:");
                int id = scanner.nextInt();
                System.out.println("Name:");
                String name = scanner.next();
                System.out.println("Salary:");
                Double salary = scanner.nextDouble();
                list.add(new Employee(id, name, salary));


            }
        }
        public void salaryIncrease () {
            System.out.println("Enter the employee id the will have salary increase:");
            int increse = scanner.nextInt();
            System.out.println("Enter the percentage:");
            Integer percentage = scanner.nextInt();


            for (Employee verfication : list) {
                if (increse == verfication.getId()) {
                    double calculation = percentage * verfication.getSalary() / 100;
                    double change = verfication.getSalary() + calculation;
                    verfication.setSalary(change);
                    System.out.println("Updated salary");
                } else System.out.println("Id not found!");
                break;
            }

            for (Employee listFinal : list) {
                System.out.println(listFinal);
            }
            scanner.close();
        }

}

