package ex1.employee;

public class Employee {
    private int id;
    private String lastname;
    private String firstname;
    private int salary;

    public Employee(int id, String firstname, String lastname, int salary) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getName() {
        return lastname + " " + firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        return this.salary = salary + salary * percent / 100;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastname='" + lastname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
