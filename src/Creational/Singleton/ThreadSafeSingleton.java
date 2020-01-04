package Creational.Singleton;

public class ThreadSafeSingleton implements Singleton {
    private static ThreadSafeSingleton instance = null;

    private ThreadSafeSingleton(){}

    /*public synchronized Singleton returnInstance() {
        if(instance==null){
            instance = new ThreadSafeSingleton();
        }

        return instance;
    }*/

    //use double locking to avoid synchronized block above (and thus memory overhead)
    @Override
    public ThreadSafeSingleton returnInstance(){
        return getUsingDoubleLock();
    }

    private ThreadSafeSingleton getUsingDoubleLock(){
        if(instance==null){
            synchronized (ThreadSafeSingleton.class){
                if(instance==null){
                    instance = new ThreadSafeSingleton();
                }
            }
        }

        return instance;
    }
}
