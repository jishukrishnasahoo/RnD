package spring.com.springweb;

import java.io.*;
import java.util.Stack;

public class SerializationDemo implements Serializable
{

    static final long serialVersionUID = 2L;
    static private String name;
    static Integer id;
    transient String department;

    private Employee employee;

    public SerializationDemo(String name, int id, String department, Employee employee) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.employee = employee;
    }

    public static void main (String args [])
    {
        try {
            SerializationDemo serializationDemo =
                    new SerializationDemo("jishu", 1111, "ET", new Employee(226763, 1234, 10000));
            FileOutputStream fileOutputStream = new FileOutputStream("jk.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(serializationDemo);

            objectOutputStream.flush();
            objectOutputStream.close();


            ///////
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("jk.txt"));

            SerializationDemo serializationDemo1 = (SerializationDemo)objectInputStream.readObject();

            System.out.println("employee Code: "+serializationDemo1.employee.getCode());
            System.out.println("name: "+serializationDemo1.name);
            System.out.println("id: "+serializationDemo1.id);
            System.out.println("department: "+serializationDemo1.department);
            objectInputStream.close();

        } catch (Exception e) {

        }

    }

}
