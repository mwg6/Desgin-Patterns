package Creational.Singleton;

public class EagerSingleton implements Singleton {
    //simple implementation, created regardless of need by the program
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){}

    @Override
    public EagerSingleton returnInstance() {
        return instance;
    }
}
