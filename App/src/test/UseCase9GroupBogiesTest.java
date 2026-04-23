package test;

import main.Bogie;
import main.UseCase9GroupBogies;

import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class UseCase9GroupBogiesTest {

    @Test
    void testGrouping_BogiesGroupedByType() {
        List<Bogie> bogies = List.of(
                new Bogie("Sleeper", 72),
                new Bogie("Sleeper", 80)
        );

        Map<String, List<Bogie>> result =
                UseCase9GroupBogies.groupBogiesByType(bogies);

        assertEquals(1, result.size());
        assertTrue(result.containsKey("Sleeper"));
    }

    @Test
    void testGrouping_DifferentBogieTypes() {
        List<Bogie> bogies = List.of(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 60)
        );

        Map<String, List<Bogie>> result =
                UseCase9GroupBogies.groupBogiesByType(bogies);

        assertEquals(2, result.size());
    }

    @Test
    void testGrouping_EmptyBogieList() {
        List<Bogie> bogies = new ArrayList<>();

        Map<String, List<Bogie>> result =
                UseCase9GroupBogies.groupBogiesByType(bogies);

        assertTrue(result.isEmpty());
    }

    @Test
    void testGrouping_GroupSizeValidation() {
        List<Bogie> bogies = List.of(
                new Bogie("Sleeper", 72),
                new Bogie("Sleeper", 80)
        );

        Map<String, List<Bogie>> result =
                UseCase9GroupBogies.groupBogiesByType(bogies);

        assertEquals(2, result.get("Sleeper").size());
    }
}
