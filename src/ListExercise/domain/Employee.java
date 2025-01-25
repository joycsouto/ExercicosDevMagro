package ListExercise.domain;

public class Employee {
    private int id;
    private String nome;
    private double salary;


    public Employee(Integer id, String nome, Double salary) {
        this.id = id;
        this.nome = nome;
        this.salary = salary;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
