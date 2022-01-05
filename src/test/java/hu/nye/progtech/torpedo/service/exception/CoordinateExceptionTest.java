package hu.nye.progtech.torpedo.service.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class CoordinateExceptionTest {
    @Test
    void testConstructor() {
        CoordinateException actualCoordinateException = new CoordinateException("An error occurred");
        assertNull(actualCoordinateException.getCause());
        assertEquals("hu.nye.progtech.torpedo.service.exception.CoordinateException: An error occurred",
                actualCoordinateException.toString());
        assertEquals(0, actualCoordinateException.getSuppressed().length);
        assertEquals("An error occurred", actualCoordinateException.getMessage());
        assertEquals("An error occurred", actualCoordinateException.getLocalizedMessage());
    }
}

