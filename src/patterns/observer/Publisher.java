package patterns.observer;

import java.util.HashSet;
import java.util.Set;

class Publisher {

    private Set<ObserverInterface> observers = new HashSet<>();

    void add(ObserverInterface observer) {
        observers.add(observer);
    }

    void delete(ObserverInterface observer) {
        observers.remove(observer);
    }

    void notifyAllObservers(String notification) {
        observers.forEach(x -> x.update(notification));
    }
}
