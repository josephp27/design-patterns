package patterns.strategy;

public class Dolphin extends Animal {

    Dolphin() {
        transportation = new Swims();
        printAttributes();
    }
}
