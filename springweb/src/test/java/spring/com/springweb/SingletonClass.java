package spring.com.springweb;



public class SingletonClass implements Cloneable{

    private static SingletonClass singletonClass = new SingletonClass(10, 10000);

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

    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object o) {
        final SingletonClass other = (SingletonClass) o;
        if (this.id == other.id)
        {
            return false;
        }
        else return false;
    }

    @Override
    public String toString() {
        return "SingletonClass{" +
                "id=" + id +
                ", salary=" + salary +
                '}';
    }

    private int id;
    private long salary;


    private SingletonClass(int id, long salary) {
        this.id = id;
        this.salary = salary;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("Cloning");
        return super.clone();
    }

    public static SingletonClass getSingletonClass()
    {
        return singletonClass;
    }


}
