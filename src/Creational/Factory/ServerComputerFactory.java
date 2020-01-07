package Creational.Factory;

public class ServerComputerFactory implements AbstractComputerFactory {
    private String RAM;
    private String CPU;
    private String HDD;

    public ServerComputerFactory(String RAM, String CPU, String HDD){
        this.RAM=RAM;
        this.CPU=CPU;
        this.HDD=HDD;
    }


    @Override
    public Computer createComputer() {
        return new ServerComputer(RAM, CPU, HDD);
    }
}
