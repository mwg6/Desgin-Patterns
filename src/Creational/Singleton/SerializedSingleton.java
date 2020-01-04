package Creational.Singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

    private SerializedSingleton(){}

    private static class SingletonHelper{
        private static final SerializedSingleton INSTANCE = new SerializedSingleton();
    }

    public static SerializedSingleton returnInstance(){
        return SingletonHelper.INSTANCE;
    }

    //without below method the deserilization of a past singleton will create a new class
    protected Object readResolve(){
        return returnInstance();
    }
}
