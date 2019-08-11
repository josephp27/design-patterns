package patterns.strategy;

public class Bird extends Animal {

    Bird() {
        transportation = new Flies();
        printAttributes();
    }
}
