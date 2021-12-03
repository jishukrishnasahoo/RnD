package spring.com.springweb;

import java.io.Serializable;

public class Employee implements Serializable{

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