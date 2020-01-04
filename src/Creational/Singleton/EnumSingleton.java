package Creational.Singleton;

public enum EnumSingleton {

    INSTANCE;

    public static void doSomething(){
        //Enums are globally accessible and promised to be created only once in the course of a program.
        //downside is no lazy initialization

    }
}
