package patterns.creational.prototype;

public class Driver {

    public static void main(String[] args) throws CloneNotSupportedException {

        Sheep sheep1 = new Sheep("John");
        Sheep sheep2 = sheep1.clone();

        System.out.println(sheep1.equals(sheep2));
    }
}
