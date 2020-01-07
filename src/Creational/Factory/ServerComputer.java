package Creational.Factory;

public class ServerComputer extends Computer {
    private String RAM;
    private String CPU;
    private String HDD;

    public ServerComputer(String RAM, String CPU, String HDD){
        this.RAM=RAM;
        this.CPU=CPU;
        this.HDD=HDD;
    }
    @Override
    public String getCPU() {
        return this.CPU;
    }

    @Override
    public String getRAM() {
        return this.RAM;
    }

    @Override
    public String getHDD() {
        return this.HDD;
    }
}
