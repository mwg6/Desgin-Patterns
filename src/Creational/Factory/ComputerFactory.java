package Creational.Factory;

public class ComputerFactory {

    public static Computer getComputer(String type, String RAM, String CPU, String HDD){
        if("PC".equalsIgnoreCase(type)){
            return new PersonalComputer(RAM,CPU,HDD);
        }
        else if("SERVER".equalsIgnoreCase(type)){
            return new ServerComputer(RAM,CPU,HDD);
        }
        else{
            return null;
        }
    }
}
