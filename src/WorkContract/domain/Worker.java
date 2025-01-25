package WorkContract.domain;

import java.util.ArrayList;

public class Worker {
    private String name;
    private WorkLevel level;
    private Double baseSalary;
    private Department department;
ArrayList<HourContract> contracts = new ArrayList<>();

    public Worker(String name, WorkLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }
public void addContrats( HourContract hourContract){
        contracts.add(hourContract);
}
public void removeContracts(HourContract hourContract){
        contracts.remove(hourContract);
}
    public ArrayList<HourContract> getContracts() {
        return contracts;
    }

    public void setContracts(ArrayList<HourContract> contracts) {
        this.contracts = contracts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkLevel getLevel() {
        return level;
    }

    public void setLevel(WorkLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
