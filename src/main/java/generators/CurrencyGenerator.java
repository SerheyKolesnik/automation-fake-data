//vbase
package generators;

import api.Generator;

import java.util.Random;

public class CurrencyGenerator implements Generator {
    @Override
    public CurrencyList generate() {
        int pick = new Random().nextInt(CurrencyList.values().length);
        return CurrencyList.values()[pick];
    }

}
