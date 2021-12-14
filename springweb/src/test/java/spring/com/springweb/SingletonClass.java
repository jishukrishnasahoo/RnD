package spring.com.springweb;


import java.io.ObjectInputStream;
import java.io.Serializable;

public class SingletonClass implements Cloneable, Serializable{

        private static volatile SingletonClass instance = null;

        private SingletonClass() {
            if (instance != null){
                throw new RuntimeException();
            }
        }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    protected Object readResolve1()
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
