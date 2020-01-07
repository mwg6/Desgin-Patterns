package Creational.Factory;

public interface AbstractComputerFactory {
    //requires a subclass factory be built for each sub class but eliminates the
    //need for switch or if/else statements in the concrete factory class. Allows greater extensibility
    //in large project

    public Computer createComputer();
}
