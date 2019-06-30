package patterns.creational.prototype;

public class Sheep implements Cloneable {

    private String name;

    public Sheep(String name) {
        this.name = name;
    }

    @Override
    public Sheep clone() throws CloneNotSupportedException {
        return new Sheep(name);
    }

    @Override
    public boolean equals(Object obj) {
        return ((Sheep) obj).name.equals(this.name);
    }
}
