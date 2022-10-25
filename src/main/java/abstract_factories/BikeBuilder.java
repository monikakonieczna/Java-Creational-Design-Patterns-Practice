package abstract_factories;

/**
 * Class that collects the bike parts to build the bike
 */
public class BikeBuilder {

    public static void main(String[] args) {
        createBikeWithoutAbstractFactory();
        createBikeWithAbstractFactory("mountain bike");
    }

    /**
     * Method shows what the code look like if the Abstract Factory pattern was not used
     */
    public static void createBikeWithoutAbstractFactory(){
        MountainBikeTire mountainBikeFront = new MountainBikeTire();
        MountainBikeTire mountainBikeBack = new MountainBikeTire();
        MountainBikeHandlebar mountainBikeHandlebar = new MountainBikeHandlebar();
        mountainBikeFront.getDescription();
        mountainBikeBack.getDescription();
        mountainBikeHandlebar.getDescription();
        System.out.println();
    }

    /**
     * Method shows what the code look like if the Abstract Factory pattern was used
     * @param type determine which type of bike to make
     */
    public static void createBikeWithAbstractFactory(String type){
        BikeFactory bikeFactory = FactoryCreator.createFactory(type);
        Tire tireFront = bikeFactory.createTire();
        Tire tireBack = bikeFactory.createTire();
        Handlebar handlebar = bikeFactory.createHandlebar();
        tireFront.getDescription();;
        tireBack.getDescription();
        handlebar.getDescription();
        System.out.println();
    }
}
