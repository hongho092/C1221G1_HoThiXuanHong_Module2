package collection_review;

public abstract class Person {
    protected int id;
    protected String firstName;
    protected String lastName;
    protected int birthDate;
    protected String address;
    protected int phone;
    protected String email;
    protected int candidate;

    public Person() {
    }

    public Person(int id, String firstName, String lastName, int birthDate, String address, int phone, String email, int candidate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.candidate = candidate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCandidate() {
        return candidate;
    }

    public void setCandidate(int candidate) {
        this.candidate = candidate;
    }

    @Override
    public String toString() {
        return "Person -> {" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", candidate='" + candidate + '\'' +
                '}';
    }
}
//Id, First Name, Last Name, Birth Date, Address, Phone, Email and Candidate type