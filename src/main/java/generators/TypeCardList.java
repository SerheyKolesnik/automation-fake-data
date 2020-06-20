package generators;

public enum TypeCardList {
    Diners_Club("30", "Diners Club"),
    JCB_International("31", "JCB International"),
    American_Express("34", "American Express"),
    VISA("40", "VISA"),
    Maestro("56", "Maestro"),
    MasterCard("51", "MasterCard"),
    Discover("60", "Discover"),
    China_UnionPay("62", "China UnionPay");

    private String bin;
    private String fullName;

    TypeCardList(String bin, String fullName) {
        this.bin = bin;
        this.fullName = fullName;
    }

    public String getBin() {
        return bin;
    }

    public String getFullName() {
        return fullName;
    }
}
