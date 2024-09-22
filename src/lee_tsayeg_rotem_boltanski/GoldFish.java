package lee_tsayeg_rotem_boltanski;

import java.util.Arrays;

public class GoldFish extends Fish {
    public static enum colorsOptions {BLACK, ORANGE, YELLOW, GOLD};

    public GoldFish(int age, double length, String[] colors, String pattern) {
        super(age, length, pattern, colors);
        this.pattern = "Smooth";
        this.colors = new String[0];
    }
}

