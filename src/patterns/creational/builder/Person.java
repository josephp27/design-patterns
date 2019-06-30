package patterns.creational.builder;

public class Person {

    private String firstName;
    private String lastName;
    private String height;

    private Person(Buildy buildy) {
        this.firstName = buildy.firstName;
        this.lastName = buildy.lastName;
        this.height = buildy.height;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", firstName, lastName, height);
    }

    public static Buildy Builder() {
        return new Buildy();
    }

    static class Buildy {
        private String firstName;
        private String lastName;
        private String height;

        public Buildy firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Buildy lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Buildy height(String height) {
            this.height = height;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
