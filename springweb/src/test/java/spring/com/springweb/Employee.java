package spring.com.springweb;

public class Employee {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    private int id;
    private long salary;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Employee(int code, int id, long salary) {
        this.code = code;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", salary=" + salary +
                ", code=" + code +
                '}';
    }

    private int code;

    @Override
    public int hashCode() {
        return this.code;
    }

    @Override
    public boolean equals(Object o) {
        final Employee other = (Employee) o;
        if (this.id == other.id)
        {
            return true;
        }
        else return false;
    }

}