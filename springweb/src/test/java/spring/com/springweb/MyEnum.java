package spring.com.springweb;


public enum MyEnum
{
    APPLE("apple"),SAMSUNG("samsung"),HTC("htc");

    MyEnum(String p)
    {
        System.out.println(p);
    }

}

class TestEnum
{
    MyEnum myEnum;
    TestEnum(MyEnum myEnum)
    {
       this.myEnum =  myEnum;
    }
    public void checkEnum()
    {
        switch (myEnum) {
            case APPLE:
            case SAMSUNG:
                System.out.println("enum");

            case HTC:
                System.out.println("HTC");
            default:
                System.out.println("default");
        }

    }

    public static void main(String[] args) {
        TestEnum testEnum = new TestEnum(MyEnum.valueOf("APPLE"));
        testEnum.checkEnum();
    }
}