package spring.com.springweb;

import java.io.Serializable;

public class Employee implements Comparable{

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    private int id;
    private Integer salary;

    public static final int fetchSalary()
    {
        return 0;
    }

    public Employee()
    {
        System.out.println("Employee object created");
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Employee(int code, int id, Integer salary) {
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
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        final Employee other = (Employee) o;
        if (this.id == other.id)
        {
            return false;
        }
        else return false;
    }

    @Override
    public int compareTo(Object o) {
        return super.hashCode();
    }
}