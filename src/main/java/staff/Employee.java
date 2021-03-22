package staff;

public abstract class Employee {

    private String name;
    private String NINumber;
    private int salary;

    public Employee(String name, String NINumber, int salary) {
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public String getNINumber() {
        return NINumber;
    }

    public int getSalary() {
        return salary;
    }

    public double raiseSalary(double payIncrement){
        salary += payIncrement;
        return salary;
    }

    public double payBonus(){
        double bonus = salary / 100 * 1;
        return salary + bonus;

    }
}
