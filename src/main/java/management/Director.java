package management;

public class Director extends Manager{

    double budget;

    public Director(String name, String NINumber, int salary, String deptName, double budget) {
        super(name, NINumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget(){
        return this.budget;
    }
}
