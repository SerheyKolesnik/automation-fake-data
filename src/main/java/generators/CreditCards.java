//v0
package generators;

public class CreditCards {
    private String numCard;
    private CurrencyList currencyCard;
    private String validDate;
    private TypeCardList TypeCard;
    private DiscriptionCard descriptionCard;
    private Owner owner;
    private String CVV;

    public CreditCards(String numCard, CurrencyList currencyCard, String validDate, TypeCardList typeCard, DiscriptionCard descriptionCard, Owner owner, String CVV) {
        this.numCard = numCard;
        this.currencyCard = currencyCard;
        this.validDate = validDate;
        TypeCard = typeCard;
        this.descriptionCard = descriptionCard;
        this.owner = owner;
        this.CVV = CVV;
    }


    public String getNumCard() {
        return numCard;
    }

    public void setNumCard(String numCard) {
        this.numCard = numCard;
    }

    public String getValidDate() {
        return validDate;
    }

    public void setValidDate(String validDate) {
        this.validDate = validDate;
    }

    public TypeCardList getTypeCard() {
        return TypeCard;
    }

    public void setTypeCard(TypeCardList typeCard) {
        TypeCard = typeCard;
    }

    public DiscriptionCard getDescriptionCard() {
        return descriptionCard;
    }

    public void setDescriptionCard(DiscriptionCard descriptionCard) {
        this.descriptionCard = descriptionCard;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }

    public CurrencyList getCurrencyCard() {
        return currencyCard;
    }

    public void setCurrencyCard(CurrencyList currencyCard) {
        this.currencyCard = currencyCard;
    }

    @Override
    public String toString() {
        return "CreditCards{" +
                "numCard='" + numCard + '\'' +
                ", currencyCard=" + currencyCard +
                ", validDate='" + validDate + '\'' +
                ", TypeCard=" + TypeCard +
                ", descriptionCard=" + descriptionCard +
                ", owner=" + owner +
                ", CVV='" + CVV + '\'' +
                '}';
    }
}
