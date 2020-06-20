package generators;

import api.Generator;

import java.awt.*;
import java.util.Random;

public class ColorGenerator implements Generator {
    @Override
    public Object generate() {
        Random rand = new Random();
        int r = rand.nextInt(255);
        int g = rand.nextInt(255);
        int b = rand.nextInt(255);
        Color randomColor = new Color(r, g, b);
        return randomColor;
    }
}
