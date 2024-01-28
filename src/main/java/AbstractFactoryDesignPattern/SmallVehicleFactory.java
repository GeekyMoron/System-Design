package AbstractFactoryDesignPattern;

public class SmallVehicleFactory implements VehicleFactory{
    @Override
    public Vahicle getVehicle(String type) {
          return new Cycle();
    }
}
