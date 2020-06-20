//v0
package generators;

public enum Posts {

    a("a.ua"),
    abha("abha.cc"),
    ccountant("accountant.com"),
    aol("aol.com"),
    ausi("ausi.com"),
    Bakililar("Bakililar.az"),
    bigmir("bigmir.net"),
    Biysk("Biysk.biz"),
    bk("bk.ru"),
    byke("byke.com"),
    DCEmail("DCEmail.com"),
    DocEmail("DocEmail.com"),
    dublin("dublin.com"),
    EcologyFund("EcologyFund.com"),
    email("email.ru"),
    emailfast("emailfast.com"),
    gmail("gmail.com"),
    goldmail("goldmail.ru"),
    HorseMail("HorseMail.com"),
    hotmail("hotmail.ru"),
    icqfoto("icqfoto.ru"),
    inbox("inbox.ru"),
    inet("inet.ua"),
    intimatefire("intimatefire.com"),
    irow("irow.com"),
    journalist("journalist.com"),
    kinkyemail("kinkyemail.com"),
    list("list.ru"),
    loveemail("loveemail.com"),
    mailcom("mail.com"),
    mailru("mail.ru"),
    meta("meta.ua"),
    NetZoola("NetZoola.com"),
    smartstocks("smartstocks.com"),
    smtp("smtp.ru"),
    TechEmail("TechEmail.com"),
    TheFreeSite("TheFreeSite.com"),
    tut("tut.by"),
    ua("ua.fm"),
    UltimateEmail("UltimateEmail.com"),
    usa("usa.com"),
    yahoo("yahoo.com"),
    yandex("mail.yandex.ru");

    private String postDom;

    Posts(String postDom) {
        this.postDom = postDom;
    }

    public String getPostDom() {
        return postDom;
    }
}
