package Slots;

import Symbols.Symbols;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SlotsTest {
    Slots slot;

    @Before
    public void before() {
        slot = new Slots(1);
    }

    @Test
    public void canGetSlotPosition() {
        assertEquals(1, slot.getPosition());
    }

    @Test
    public void canSetSymbolToSlot() {
        slot.setSymbol(Symbols.randomSymbol());
        assertNotNull(slot.getSymbol());
    }

    @Test
    public void canGetWinnings() {
        Symbols random = Symbols.randomSymbol();
        slot.setSymbol(random);
        assertEquals(random.getWinnings(), slot.getSymbol().getWinnings());
    }
}
