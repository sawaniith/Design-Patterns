package Structural.AdapterPattern;

public class KGWeightMachineAdapter implements WeightMachineAdapter{
    WeightMachine weightMachine;

    public KGWeightMachineAdapter(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getAdapterWeight() {

        double weightInPound = weightMachine.getWeightInPound();

        //Convert it to KGs
        double weightInKg = weightInPound * .45;
        return weightInKg;
    }
}
