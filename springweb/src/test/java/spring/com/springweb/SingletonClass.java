package spring.com.springweb;


import java.io.ObjectInputStream;
import java.io.Serializable;

public class SingletonClass implements Cloneable, Serializable{

        private static volatile SingletonClass instance = null;

        private SingletonClass() {
            if (instance != null){
                System.out.println("try instanciating");
                throw new RuntimeException();
            }
        }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return instance;
    }


    protected Object readResolve()
    {
      return instance;
    }

    public static SingletonClass getInstance() {
            if (instance == null) {
                synchronized (SingletonClass.class) {
                    if (instance == null) {
                        instance = new SingletonClass();
                    }
                }
            }
            return instance;
        }
    }
