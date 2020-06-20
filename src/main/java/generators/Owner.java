//v0
package generators;

public class Owner {
    private String firstName;
    private String secondfirstName;
    private String telephone;
    private String email;

    public Owner(String firstName, String secondfirstName, String telephone, String email) {
        this.firstName = firstName;
        this.secondfirstName = secondfirstName;
        this.telephone = telephone;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondfirstName() {
        return secondfirstName;
    }

    public void setSecondfirstName(String secondfirstName) {
        this.secondfirstName = secondfirstName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "firstName='" + firstName + '\'' +
                ", secondfirstName='" + secondfirstName + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
