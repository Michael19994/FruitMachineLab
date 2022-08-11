package SlotMachine;

import Slots.Slots;
import Symbols.Symbols;

public class SlotMachine {

    private Slots slot1;
    private Slots slot2;
    private Slots slot3;

    public SlotMachine(Slots slots1, Slots slot2, Slots slot3) {
        this.slot1 = slots1;
        this.slot2 = slot2;
        this.slot3 = slot3;
    }

    public Slots getSlots1() {
        return slot1;
    }

    public Slots getSlot2() {
        return slot2;
    }

    public Slots getSlot3() {
        return slot3;
    }

    public void spin() {
        slot1.setSymbol(Symbols.randomSymbol());
        slot2.setSymbol(Symbols.randomSymbol());
        slot3.setSymbol(Symbols.randomSymbol());
        if (slot1.getSymbol() == slot2.getSymbol() && slot3.getSymbol());
    }


}
