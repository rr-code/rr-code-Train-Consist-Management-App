package test;

import main.Bogie;
import main.UseCase10TotalSeats;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase10TotalSeatsTest {

    @Test
    void testReduce_TotalSeatCalculation() {
        List<Bogie> bogies = List.of(
                new Bogie("Sleeper", 70),
                new Bogie("AC", 30)
        );

        int result = UseCase10TotalSeats.calculateTotalSeats(bogies);

        assertEquals(100, result);
    }

    @Test
    void testReduce_EmptyBogieList() {
        List<Bogie> bogies = new ArrayList<>();

        int result = UseCase10TotalSeats.calculateTotalSeats(bogies);

        assertEquals(0, result);
    }

    @Test
    void testReduce_SingleBogieCapacity() {
        List<Bogie> bogies = List.of(
                new Bogie("Sleeper", 80)
        );

        int result = UseCase10TotalSeats.calculateTotalSeats(bogies);

        assertEquals(80, result);
    }

    @Test
    void testReduce_MultipleBogiesAggregation() {
        List<Bogie> bogies = List.of(
                new Bogie("Sleeper", 50),
                new Bogie("AC", 50),
                new Bogie("First Class", 100)
        );

        int result = UseCase10TotalSeats.calculateTotalSeats(bogies);

        assertEquals(200, result);
    }
}
