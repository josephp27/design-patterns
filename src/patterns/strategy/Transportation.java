package patterns.strategy;

public interface Transportation {

    String transportMethod();
}

class Flies implements Transportation {

    @Override
    public String transportMethod() {
        return "flies";
    }
}

class Walks implements Transportation {

    @Override
    public String transportMethod() {
        return "walks";
    }
}

class Swims implements Transportation {

    @Override
    public String transportMethod() {
        return "swims";
    }
}