package hu.nye.progtech.torpedo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import hu.nye.progtech.torpedo.model.MapVO;
import org.junit.jupiter.api.Test;

class MapGeneratorTest {
    @Test
    void testGenerateMap() {
        assertThrows(NegativeArraySizeException.class, () -> (new MapGenerator()).generateMap(-1));
        assertThrows(NegativeArraySizeException.class, () -> (new MapGenerator()).generateMap(-1));
    }

    @Test
    void testGenerateMap2() {
        MapVO actualGenerateMapResult = (new MapGenerator()).generateMap(9);
        assertEquals(0, actualGenerateMapResult.getHit());
        assertEquals(9, actualGenerateMapResult.getMapLength());
        assertEquals(9, actualGenerateMapResult.getMap().length);
    }
}

