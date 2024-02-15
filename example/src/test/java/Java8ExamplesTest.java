import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Java8ExamplesTest {


    Java8Examples java8Examples;


    @BeforeEach
    void setUp() {
        java8Examples = new Java8Examples();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void shouldReturnFilterList() {
        List<String> stringList = java8Examples.filter(Arrays.asList("vivaan", "nitya", "anamika", "sachin", "virat"));
        Assertions.assertFalse(stringList.isEmpty());
        assertTrue(stringList.containsAll(Arrays.asList("VIRAT", "VIVAAN")));

    }

    @Test
    void shouldWorkOptional() {
        List<String> stringList = java8Examples.optional(Arrays.asList("vivaan", "nitya", "anamika", "sachin", "virat"));
        Assertions.assertFalse(stringList.isEmpty());
        assertTrue(stringList.containsAll(Arrays.asList("vivaan")));

    }
}