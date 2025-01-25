package WorkContract.Service;

import WorkContract.domain.Department;
import WorkContract.domain.HourContract;
import WorkContract.domain.WorkLevel;
import WorkContract.domain.Worker;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class WorkService {

    String name;
    WorkLevel level;
    Double baseSalary;

    int valueContract;

    Date dates;
    Double valuePerHour;
    Integer hour;

    SimpleDateFormat spf = new SimpleDateFormat("dd/MM/yyyy");

    Scanner scanner = new Scanner(System.in);


    public void collectingData() throws ParseException {
        System.out.println("Enter department's name:");
        String departmentName = scanner.next();
        System.out.println("Enter work data");
        System.out.println("Name:");
        name = scanner.next();
        System.out.println("Level:");
        String levels = scanner.next();
        System.out.println("Base Salary:");
        baseSalary = scanner.nextDouble();
        System.out.println("How many contracts to this worker: ");
        valueContract = scanner.nextInt();
        Worker worker = new Worker(name, WorkLevel.valueOf(levels), baseSalary, new Department(departmentName));

        for (int i = 0; i < valueContract; i++) {
            System.out.println("Enter contract #" + i + " data:");
            System.out.println("Data (DD/MM/YYYY):");
            Date contracDate = spf.parse(scanner.next());
            System.out.println("Value per hour:");
            hour = scanner.nextInt();
            System.out.println("Duration(hour):");
            valuePerHour = scanner.nextDouble();
            HourContract hourContract = new HourContract(valuePerHour, hour, contracDate);


            System.out.println("Enter month and year to calculate income (MM/YYYY)");
            String monthYear = scanner.next();
            int month = Integer.parseInt(monthYear.substring(0, 2));
            int year = Integer.parseInt(monthYear.substring(3));
            double calculate = baseSalary + hour * valuePerHour;
            System.out.println("Name:" + worker.getName());
            System.out.println("Department:" + departmentName);
            System.out.println("Income for " +monthYear +" : "  + calculate);


        }


    }
}

