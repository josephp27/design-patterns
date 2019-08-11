package patterns;

import patterns.creational.Factory.FactoryMethod;
import patterns.creational.Singleton.Singleton;

public class Main {


    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton == Singleton.getInstance());

        FactoryMethod factoryMethod = new FactoryMethod("Tall");
    }
}
