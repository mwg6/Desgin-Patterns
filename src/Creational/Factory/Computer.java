package Creational.Factory;

public abstract class Computer {
    //serves as the super class which can instantiate and return subclasses
    public abstract String getCPU();
    public abstract String getRAM();
    public abstract String getHDD();

    @Override
    public String toString(){
        return "RAM: "+this.getRAM()+" CPU: "+this.getCPU()+" HDD: "+this.getHDD();
    }
}
