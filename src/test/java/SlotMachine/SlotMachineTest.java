package SlotMachine;

import Slots.Slots;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SlotMachineTest {

    SlotMachine slotMachine;
    Slots slot1;
    Slots slot2;
    Slots slot3;

    @Before
    public void before() {
        slot1 = new Slots(1);
        slot2 = new Slots(2);
        slot3 = new Slots(3);
        slotMachine = new SlotMachine(slot1, slot2, slot3);
    }

    @Test
    public void canSetSymbols() {
        slotMachine.spin();
        assertNotNull(slot1.getSymbol());
    }
}
