package patterns.observer;

public class Engine {
    public static void main(String[] args) {

        Publisher publisher = new Publisher();

        publisher.add(new Observer());
        publisher.add(new Observer());
        publisher.add(System.out::println);
        publisher.add(new ObserverInterface() {
            @Override
            public void update(String notification) {
                System.out.println("using an anonymous class " + notification);
            }
        });

        publisher.notifyAllObservers("hello world");
        System.out.println();
        publisher.notifyAllObservers("second notification");
    }
}
