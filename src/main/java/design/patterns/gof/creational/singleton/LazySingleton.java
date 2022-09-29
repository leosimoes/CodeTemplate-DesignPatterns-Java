package design.patterns.gof.creational.singleton;

public class LazySingleton {

    private LazySingleton(){
    }

    private static LazySingleton INSTANCE;

    public static LazySingleton getInstance(){
        if(INSTANCE == null){
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }


}
