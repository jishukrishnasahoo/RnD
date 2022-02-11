package spring.com.springweb;

import java.io.Serializable;

public class Mynumber extends Number
{

    @Override
    public int intValue() {
        return 1;
    }

    @Override
    public long longValue() {
        return 1L;
    }

    @Override
    public float floatValue() {
        return 2f;
    }

    @Override
    public double doubleValue() {
        return 1000;
    }
}