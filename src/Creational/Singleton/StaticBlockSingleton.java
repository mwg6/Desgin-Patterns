package Creational.Singleton;

public class StaticBlockSingleton implements Singleton {

    //same thought as the eager singleton but provides error handling
    //due to the static block creation. Still created regardless of need
    private static StaticBlockSingleton instance;

    static {
        try{
            instance = new StaticBlockSingleton();
        }
        catch(Exception e){
            //Error handling will occur here.
        }
    }

    private StaticBlockSingleton(){}

    public StaticBlockSingleton returnInstance(){
        return instance;
    }
}
