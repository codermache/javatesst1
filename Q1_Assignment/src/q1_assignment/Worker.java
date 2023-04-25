package q1_assignment;

/**
 *
 * @author Le Truong Thinh
 */
public class Worker extends Person{
    private int salary;
    private String department;

    public Worker() {
    }

    public Worker(int salary, String department, String name) {
        super(name);
        this.salary = salary;
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return super.getName() + "\t" + salary + "\t" + department ;
    }
}
