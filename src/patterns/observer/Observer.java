package patterns.observer;

public class Observer implements ObserverInterface {

    private int observerNumber;
    private static int count = 0;

    Observer() {
        this.observerNumber = count++;
    }

    @Override
    public void update(String notification) {
        System.out.println(String.format("Observer %s has notification: %s", observerNumber, notification));
    }
}
