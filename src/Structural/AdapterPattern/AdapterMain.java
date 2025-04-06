package Structural.AdapterPattern;

public class AdapterMain {
    public static void main(String[] args) {
        WeightMachineAdapter kgWeightMachineAdapter = new KGWeightMachineAdapter(new WeightMachine());
        System.out.println(kgWeightMachineAdapter.getAdapterWeight());

        //used for type conversion like xml to json, etc
    }
}
