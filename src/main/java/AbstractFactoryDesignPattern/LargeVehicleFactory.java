package AbstractFactoryDesignPattern;


public class LargeVehicleFactory implements VehicleFactory{
    @Override
    public Vahicle getVehicle(String type) {
            return new Bus();
    }
}
