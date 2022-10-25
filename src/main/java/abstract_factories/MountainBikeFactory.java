package abstract_factories;

public class MountainBikeFactory extends BikeFactory {
    @Override
    public Tire createTire() {
        return new MountainBikeTire();
    }

    @Override
    Handlebar createHandlebar() {
        return new MountainBikeHandlebar();
    }
}
