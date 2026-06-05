package studentregistration;

public class Student {
    private String firstName;
    private String lastName;
    private String email;
    private String personalCode;
    private String registrationDateTime;

    public Student(String firstName, String lastName, String email, String personalCode, String registrationDateTime) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.personalCode = personalCode;
        this.registrationDateTime = registrationDateTime;
    }

    public String getName() {
        return this.firstName;
    }

    public String getSurname() {
        return this.lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPersonalCode() {
        return this.personalCode;
    }

    public String getRegistrationDateTime() {
        return this.registrationDateTime;
    }

    public void setName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toCsvLine() {
        return this.firstName + "," + this.lastName + "," + this.email + "," + this.personalCode + "," + this.registrationDateTime;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " | " + this.email + " | " + this.personalCode + " | " + this.registrationDateTime;
    }
}
