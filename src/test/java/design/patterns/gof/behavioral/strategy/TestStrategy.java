package design.patterns.gof.behavioral.strategy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class TestStrategy {

    @Test
    public void testarGenericStrategy(){
        Strategy strategyMock = mock(Strategy.class);
        Context context = new Context(strategyMock);

        doNothing().when(strategyMock).execute();
        context.executeStrategy();
        verify(strategyMock, times(1)).execute();
    }

    @Test
    public void testarFirstStrategy(){
        Strategy firstStrategy = spy(new FirstStrategy());
        Context context = new Context(firstStrategy);

        context.executeStrategy();
        verify(firstStrategy, times(1)).execute();
    }

    @Test
    public void testarSecondStrategy(){
        Strategy secondStrategy = spy(new SecondStrategy());
        Context context = new Context(secondStrategy);

        context.executeStrategy();
        verify(secondStrategy, times(1)).execute();
    }

}
