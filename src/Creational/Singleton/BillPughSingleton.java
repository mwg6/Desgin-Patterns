package Creational.Singleton;

public class BillPughSingleton{

    //use an anonymous inner class to wrap synchronicity and lazy initialization

    private BillPughSingleton(){}

    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton returnInstance(){
        return SingletonHelper.INSTANCE;
    }

}
