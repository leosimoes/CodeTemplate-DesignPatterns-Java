package design.patterns.gof.creational.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSingleton {

    @Test
    public void testarEagerSingleton(){
        assertEquals(EagerSingleton.getInstance(), EagerSingleton.getInstance());
    }

    @Test
    public void testarLazySingleton(){
        assertEquals(LazySingleton.getInstance(), LazySingleton.getInstance());
    }

}
