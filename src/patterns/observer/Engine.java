package patterns.observer;

public class Engine {
    public static void main(String[] args) {

        Publisher publisher = new Publisher();

        publisher.add(new Observer());
        publisher.add(new Observer());

        publisher.notifyAllObservers("hello world");
    }
}
