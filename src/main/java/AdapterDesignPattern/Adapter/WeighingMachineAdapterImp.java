package AdapterDesignPattern.Adapter;

import AdapterDesignPattern.Adaptee.WeighingMachineAdaptee;

public class WeighingMachineAdapterImp implements WeighingMachineAdapter{
    WeighingMachineAdaptee weighingMachineAdaptee;

    public WeighingMachineAdapterImp(WeighingMachineAdaptee weighingMachineAdaptee) {
        this.weighingMachineAdaptee = weighingMachineAdaptee;
    }

    @Override
    public int getWeightsInPound() {
        return (int) (weighingMachineAdaptee.getWeightInKg()/0.45);
    }
}
