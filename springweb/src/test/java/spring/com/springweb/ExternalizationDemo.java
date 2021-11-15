package spring.com.springweb;

import java.io.*;

public class ExternalizationDemo implements Serializable, Externalizable{

    private static String name;
    private transient int id;
    private String department;

    @Override
    public void writeExternal(ObjectOutput objectOutput) throws IOException {

        objectOutput.writeObject(name);
        objectOutput.writeInt(id);
        objectOutput.writeObject(department);
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        name = (String )objectInput.readObject();
        id = objectInput.readInt();
        department = (String)objectInput.readObject();
    }


    public ExternalizationDemo(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    public static void main(String ar []){
        File f= new File("Test.txt");
        ExternalizationDemo externalizationDemo = new ExternalizationDemo("asdf", 222, "CS");
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(f));
            out.writeObject(externalizationDemo);
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
            externalizationDemo=(ExternalizationDemo)in.readObject();
        } catch (Exception e) {

        }
        System.out.println("externalizationDemo name: "+externalizationDemo.name);
        System.out.println("id: "+externalizationDemo.id);
        System.out.println("department: "+externalizationDemo.department);

    }
}