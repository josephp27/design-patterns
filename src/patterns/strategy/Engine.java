package patterns.strategy;

/**
 * Allows to dynamically creating new transportation methods.
 * Reduces if/else cond. list
 * Decouples
 * https://www.youtube.com/watch?v=-NCgRD9-C6o
 */
public class Engine {

    public static void main(String[] args) {
        System.out.print("Pig: ");
        Animal pig = new Pig();

        System.out.print("Bird: ");
        Animal bird = new Bird();

        System.out.print("Dolphin: ");
        Animal dolphin = new Dolphin();
    }
}
