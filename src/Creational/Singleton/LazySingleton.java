package Creational.Singleton;

public class LazySingleton implements Singleton {
    //creates singleton class for use only when requested by the system. Prevents the singleton from
    //unnecessarily hogging system reources in case it's hefty.
    private static LazySingleton instance = null;

    private LazySingleton(){

    }



    public LazySingleton returnInstance(){
        if(instance==null){
            instance = new LazySingleton();
        }

        return instance;
    }
}
