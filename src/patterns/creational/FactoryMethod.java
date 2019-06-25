package patterns.creational;

/**
 * https://www.javatpoint.com/factory-method-design-pattern
 */
public class FactoryMethod {

    private interface ConstructionCompany {
        Building createBuilding();
    }

    enum BuildingType {
        Tall,
        Short
    }

    abstract class Building {

        public abstract BuildingType getBuildingType();
    }

    class PepperConstruction implements ConstructionCompany {

        @Override
        public Building createBuilding() {
            return new pepperBuilding();
        }
    }

    class pepperBuilding extends Building {

        private BuildingType buildingType;

        pepperBuilding() {
            this.buildingType = BuildingType.Tall;
        }

        @Override
        public BuildingType getBuildingType() {
            return buildingType;
        }
    }

    class ShortConstruction implements ConstructionCompany {

        @Override
        public Building createBuilding() {
            return new shortBuilding();
        }
    }

    class shortBuilding extends Building {

        private BuildingType buildingType;

        shortBuilding() {
            this.buildingType = BuildingType.Short;
        }

        @Override
        public BuildingType getBuildingType() {
            return buildingType;
        }
    }

    public FactoryMethod(String size) {

        ConstructionCompany constructionCompany;
        if (size.equals("Tall")) {
            constructionCompany = new PepperConstruction();
        }else{
            constructionCompany = new ShortConstruction();
        }

        BuildingType sizeOf = constructionCompany.createBuilding().getBuildingType();

        System.out.println(String.format("Size is: %s", sizeOf));
    }
}
