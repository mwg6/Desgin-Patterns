package Creational.Factory;

public class PersonalComputerFacotry implements AbstractComputerFactory {

    private String RAM;
    private String CPU;
    private String HDD;

    public PersonalComputerFacotry(String RAM, String CPU, String HDD){
        this.RAM=RAM;
        this.CPU=CPU;
        this.HDD=HDD;
    }

    @Override
    public Computer createComputer() {
        return new PersonalComputer(RAM, CPU, HDD);
    }
}
