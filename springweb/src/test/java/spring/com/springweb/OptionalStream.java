package spring.com.springweb;

import org.apache.kafka.common.protocol.types.Field;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Person {

    String name;
    Optional<Integer> age;

    public Person(String name, Optional<Integer> age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Optional<Integer> getAge() {
        return age;
    }

    public void setAge(Optional<Integer> age) {
        this.age = age;
    }
}

class OptionalStream {
    public static void main(String[] args) {

        List<Person> optionals = new ArrayList<>();

        Person p1 = new Person("Girish", Optional.ofNullable(32));
        Person p2 = new Person("Rajesh", Optional.ofNullable(null));
        Person p3 = new Person("Jishu", Optional.ofNullable(31));
        optionals.add(p1);
        optionals.add(p2);
        optionals.add(p3);

        List result = optionals.stream().filter(p -> p.getAge().isPresent()).filter(j -> j.age.get() > 30).collect(Collectors.toList());
        System.out.println("Result"+ result);
    }
}