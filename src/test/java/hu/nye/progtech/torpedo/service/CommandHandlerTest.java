package hu.nye.progtech.torpedo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import hu.nye.progtech.torpedo.model.CharMap;
import hu.nye.progtech.torpedo.model.MapVO;
import org.junit.jupiter.api.Test;

class CommandHandlerTest {
    @Test
    void testHandleCommand() {
        CommandHandler commandHandler = new CommandHandler();
        MapVO mapVO = new MapVO(3, new boolean[][]{new boolean[]{true, true, true, true}});

        CharMap charMap = new CharMap();
        commandHandler.handleCommand("Input", mapVO, charMap);
        assertEquals(0, mapVO.getHit());
        assertEquals(0, charMap.getMapLength());
        assertTrue(
                commandHandler.unmarshaller instanceof org.glassfish.jaxb.runtime.v2.runtime.unmarshaller.UnmarshallerImpl);
        assertTrue(commandHandler.jaxbContext instanceof org.glassfish.jaxb.runtime.v2.runtime.JAXBContextImpl);
        assertTrue(commandHandler.marshaller instanceof org.glassfish.jaxb.runtime.v2.runtime.MarshallerImpl);
    }

    @Test
    void testHandleCommand2() {
        CommandHandler commandHandler = new CommandHandler();
        MapVO mapVO = new MapVO(3, new boolean[][]{new boolean[]{true, true, true, true}});

        CharMap charMap = new CharMap();
        commandHandler.handleCommand("help", mapVO, charMap);
        assertEquals(0, mapVO.getHit());
        assertEquals(0, charMap.getMapLength());
        assertTrue(
                commandHandler.unmarshaller instanceof org.glassfish.jaxb.runtime.v2.runtime.unmarshaller.UnmarshallerImpl);
        assertTrue(commandHandler.jaxbContext instanceof org.glassfish.jaxb.runtime.v2.runtime.JAXBContextImpl);
        assertTrue(commandHandler.marshaller instanceof org.glassfish.jaxb.runtime.v2.runtime.MarshallerImpl);
    }
}

