public class Worker {

    private String name;
    private double salary;

    /**
     * Constructor with parameters to pass variables' values
     *
     * @param name
     * @param salary
     */
    public Worker(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * toString method to return the object's variable values
     *
     * @return string with object's name and salary
     */
    @Override
    public String toString() {
        return "Name: " + name + " - Salary: $" + salary;
    }
}
