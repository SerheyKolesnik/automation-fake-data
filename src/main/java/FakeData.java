import generators.ColorGenerator;
import generators.CreditCardGenerator;
import generators.CurrencyGenerator;
import generators.EmailGenerator;

public class FakeData {
    public static void main(String[] args) {
        ColorGenerator colorGenerator = new ColorGenerator();
        System.out.println(colorGenerator.generate());
        CreditCardGenerator creditCardGenerator = new CreditCardGenerator();
        System.out.println(creditCardGenerator.generate());
        CurrencyGenerator cg = new CurrencyGenerator();
        System.out.println(cg.generate());
        EmailGenerator eg = new EmailGenerator();
        System.out.println(eg.generate());
    }

}
