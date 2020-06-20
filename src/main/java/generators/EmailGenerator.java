package generators;

import api.Generator;

import java.util.Random;

public class EmailGenerator implements Generator {
    @Override
    public Object generate() {
         return randomFirstName().toString() + "." + randomSecondName().toString() + "@" + randomPost().getPostDom();
    }

    private FirstName randomFirstName() {
        int pick = new Random().nextInt(FirstName.values().length);
        return FirstName.values()[pick];
    }

    private SecondName randomSecondName() {
        int pick = new Random().nextInt(SecondName.values().length);
        return SecondName.values()[pick];
    }

    private Posts randomPost() {
        int pick = new Random().nextInt(Posts.values().length);
        return Posts.values()[pick];
    }

}
