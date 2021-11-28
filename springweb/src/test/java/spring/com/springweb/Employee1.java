package spring.com.springweb;

public final class Employee1 extends Employee
{
    final String pancardNumber;
    public Employee1(String pancardNumber)
    {
        this.pancardNumber=pancardNumber;
    }
    public String getPancardNumber(){
        return pancardNumber;
    }


}