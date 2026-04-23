package test;

import main.UseCase8TrainConsisntMgmt;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import main.Bogie;
public class UseCase8TrainConsisntMgmtTest {

    @Test
    void testFilter_CapacityGreaterThanThreshold() {
        List<Bogie> bogies = List.of(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 60)
        );

        List<Bogie> result = UseCase8TrainConsisntMgmt.filterBogies(bogies, 60);

        assertEquals(1, result.size());
        assertTrue(result.get(0).capacity > 60);
    }

    @Test
    void testFilter_CapacityEqualToThreshold() {
        List<Bogie> bogies = List.of(
                new Bogie("AC Chair", 70)
        );

        List<Bogie> result = UseCase8TrainConsisntMgmt.filterBogies(bogies, 70);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_CapacityLessThanThreshold() {
        List<Bogie> bogies = List.of(
                new Bogie("First Class", 50)
        );

        List<Bogie> result = UseCase8TrainConsisntMgmt.filterBogies(bogies, 60);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_MultipleBogiesMatching() {
        List<Bogie> bogies = List.of(
                new Bogie("Sleeper", 72),
                new Bogie("Sleeper", 80)
        );

        List<Bogie> result = UseCase8TrainConsisntMgmt.filterBogies(bogies, 60);

        assertEquals(2, result.size());
    }

    @Test
    void testFilter_NoBogiesMatching() {
        List<Bogie> bogies = List.of(
                new Bogie("First Class", 40)
        );

        List<Bogie> result = UseCase8TrainConsisntMgmt.filterBogies(bogies, 60);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_AllBogiesMatching() {
        List<Bogie> bogies = List.of(
                new Bogie("Sleeper", 80),
                new Bogie("AC", 90)
        );

        List<Bogie> result = UseCase8TrainConsisntMgmt.filterBogies(bogies, 60);

        assertEquals(2, result.size());
    }

    @Test
    void testFilter_EmptyBogieList() {
        List<Bogie> bogies = new ArrayList<>();

        List<Bogie> result = UseCase8TrainConsisntMgmt.filterBogies(bogies, 60);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_OriginalListUnchanged() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));

        UseCase8TrainConsisntMgmt.filterBogies(bogies, 60);

        assertEquals(1, bogies.size());
    }
}