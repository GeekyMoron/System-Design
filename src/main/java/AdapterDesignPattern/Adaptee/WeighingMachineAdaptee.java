package AdapterDesignPattern.Adaptee;

public class WeighingMachineAdaptee implements WeighingMachineAdapteeInterface{

    @Override
    public int getWeightInKg() {
        return 100;
    }
}
