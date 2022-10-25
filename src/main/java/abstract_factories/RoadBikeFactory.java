package abstract_factories;

public class RoadBikeFactory extends BikeFactory {
    @Override
    Tire createTire() {
        return new RoadBikeTire();
    }

    @Override
    Handlebar createHandlebar() {
        return new RoadBikeHandlebar();
    }
}
