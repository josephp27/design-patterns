package patterns.strategy;

abstract class Animal {

    Transportation transportation;

    void printAttributes() {
        System.out.println(transportation.transportMethod());
    }

}
