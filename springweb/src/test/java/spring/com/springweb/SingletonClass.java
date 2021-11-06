package spring.com.springweb;



public class SingletonClass implements Cloneable{

    private static SingletonClass singletonClass = new SingletonClass();

    private SingletonClass ()
    {

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
