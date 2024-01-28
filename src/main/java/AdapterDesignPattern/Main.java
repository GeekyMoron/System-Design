package AdapterDesignPattern;

import AdapterDesignPattern.Adaptee.WeighingMachineAdaptee;
import AdapterDesignPattern.Adapter.WeighingMachineAdapterImp;

public class Main {
    public static void main(String[] args) {
        WeighingMachineAdapterImp weighingMachineAdapterImp = new WeighingMachineAdapterImp(new WeighingMachineAdaptee());
        System.out.println(weighingMachineAdapterImp.getWeightsInPound());
    }
}
