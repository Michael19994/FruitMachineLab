package Symbols;
import java.util.Random;

public enum Symbols {
    BAR( 10),
    BELL( 20),
    CHERRY( 30),
    GRAPES( 40),
    STRAWBERRY( 500),
    WATERMELON( 6000),
    Seven( 70000);

    private final int winnings;

    Symbols(int winnings) {
        this.winnings = winnings;
    }

    public int getWinnings() {
        return winnings;
    }

    public static final Random PRNG = new Random();
    public static Symbols randomSymbol() {
        Symbols[] symbols = values();
        return symbols[PRNG.nextInt(symbols.length)];
    }
}
