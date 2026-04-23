package test;

import main.Bogie;
import main.UseCase13Performance;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase13PerformanceTest {

    @Test
    void testLoopFilteringLogic() {
        List<Bogie> bogies = List.of(
                new Bogie("Sleeper", 70),
                new Bogie("AC", 50)
        );

        List<Bogie> result = UseCase13Performance.filterWithLoop(bogies);

        assertEquals(1, result.size());
    }

    @Test
    void testStreamFilteringLogic() {
        List<Bogie> bogies = List.of(
                new Bogie("Sleeper", 70),
                new Bogie("AC", 50)
        );

        List<Bogie> result = UseCase13Performance.filterWithStream(bogies);

        assertEquals(1, result.size());
    }

    @Test
    void testLoopAndStreamResultsMatch() {
        List<Bogie> bogies = List.of(
                new Bogie("Sleeper", 70),
                new Bogie("AC", 80),
                new Bogie("AC", 50)
        );

        List<Bogie> loopResult = UseCase13Performance.filterWithLoop(bogies);
        List<Bogie> streamResult = UseCase13Performance.filterWithStream(bogies);

        assertEquals(loopResult.size(), streamResult.size());
    }

    @Test
    void testExecutionTimeMeasurement() {
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            bogies.add(new Bogie("Sleeper", i));
        }

        long start = System.nanoTime();
        UseCase13Performance.filterWithStream(bogies);
        long end = System.nanoTime();

        assertTrue((end - start) > 0);
    }
}