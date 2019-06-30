package patterns.creational.builder;

public class Driver {

    public static void main(String[] args) {

        Person person = Person.Builder()
                .firstName("John")
                .lastName("Smith")
                .height("60")
                .build();

        System.out.println(person);
    }
}
