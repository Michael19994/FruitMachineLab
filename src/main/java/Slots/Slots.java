package Slots;

import Symbols.Symbols;

public class Slots {
    private int position;
    private Symbols symbol;

    public Slots(int position) {
        this.position = position;
    }
    public int getPosition() {
        return this.position;
    }

    public Symbols getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbols symbol) {
        this.symbol = symbol;
    }
}
