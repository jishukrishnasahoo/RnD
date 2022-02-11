package spring.com.springweb;

import java.lang.annotation.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface ElectricCar
{
   int cubicCapacity() default 1000;
   String engine() default "electric";

    public int getSpeed();
}

class MyElectricCar
{
    public MyElectricCar() {
    }

    int i=1;

    @ElectricCar(cubicCapacity = 2000, getSpeed = 80)
    private int cubicCapacity1;

    public String getEngineModel()
    {
        System.out.println("Engine model");
        return "";
    }
}

class TestAnnotation
{

    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        MyElectricCar myElectricCar = new MyElectricCar();
        Class a = myElectricCar.getClass();

        /*Class c= Class.forName("spring.com.springweb.MyElectricCar");


        Class b= Class.forName("java.lang.Integer");

        System.out.println(c.getDeclaredField("i"));
        System.out.println(b.getPackage());

        Class d = ClassLoader.getSystemClassLoader().loadClass("spring.com.springweb.MyElectricCar");

        System.out.println(d.getDeclaredField("i").getName());*/

        //Field
        Field field = a.getDeclaredField("cubicCapacity1");
        Annotation annotationfield = field.getAnnotation(ElectricCar.class);
        ElectricCar eCar = (ElectricCar)annotationfield;
        System.out.println(eCar.getSpeed());

        //Method
        Method method = a.getMethod("getEngineModel", null);
        Annotation annotation1 = method.getAnnotation(ElectricCar.class);
        ElectricCar electricCarMethod = (ElectricCar)annotation1;
        System.out.println(electricCarMethod.getSpeed());

        //Class
        Annotation annotation = a.getAnnotation(ElectricCar.class);
        ElectricCar electricCar = (ElectricCar)annotation;
        System.out.println(electricCar.cubicCapacity());
    }
}
