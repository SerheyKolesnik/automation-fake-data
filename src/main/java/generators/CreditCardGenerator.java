//v0
package generators;

import api.Generator;

import java.util.Random;

public class CreditCardGenerator implements Generator<CreditCards> {
    Random rand = new Random();
    private String fn = randomFirstName().toString();
    private String sn = randomSecondName().toString();
    private String email = fn + "." + sn + "@" + randomPost().getPostDom();
    CurrencyGenerator currencyGenerator = new CurrencyGenerator();

    @Override
    public CreditCards generate() {

        return new CreditCards(numCard(randomTypeCardList()),
                new CurrencyGenerator().generate(),
                validDate(),
                randomTypeCardList(),
                randomDiscriptionCard(),
                randomOner(),
                randomNum(3)
        );
    }

    private String numCard(TypeCardList tcl) {
        return tcl.getBin() + randomNum(14);
    }

    private String validDate() {
        int mc = rand.nextInt(11) + 1;
        return (mc < 10) ? "0" + mc + "/" + (20 + rand.nextInt(3)) : mc + "/" + (20 + rand.nextInt(3));
    }

    private String randomNum(int digitCoyunt) {
        //Random rand = new Random();
        String rn = "";
        for (int i = 0; i < digitCoyunt; i++) {
            int numCard = rand.nextInt(9);
            rn += numCard;
        }
        return rn;
    }

    private Owner randomOner() {
        //String email = fn + "." + sn + "@" + randomPost();
        String tel = "+" + randomNum(12);

        return new Owner(fn, sn, tel, email);
    }

    private TypeCardList randomTypeCardList() {
        int pick = new Random().nextInt(TypeCardList.values().length);
        return TypeCardList.values()[pick];
    }

    private DiscriptionCard randomDiscriptionCard() {
        int pick = new Random().nextInt(DiscriptionCard.values().length);
        return DiscriptionCard.values()[pick];
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
