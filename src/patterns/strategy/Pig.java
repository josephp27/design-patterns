package patterns.strategy;

class Pig extends Animal {

    Pig() {
        transportation = new Walks();
        printAttributes();
    }
}
