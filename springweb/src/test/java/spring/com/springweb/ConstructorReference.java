package spring.com.springweb;

class Messageable{
    static Message getMessage(String msg)
    {
        return new Message("");
    }
}
class Message{
    Message(String msg){
        System.out.print(msg);
    }
}
public class ConstructorReference extends Messageable{

    public static Message getMessage(String msg)
    {
        return new Message("");
    }
    public static void main(String[] args) {

    }
}