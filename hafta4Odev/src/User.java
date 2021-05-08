public class User {
    String tcNo ;
    String firstName;
    String lastName;
    String yearOfBirth;

    public User(){

    }

    public User(String tcNo, String firstName, String lastName, String yearOfBirth) {
        this.tcNo = tcNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
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

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Kullanıcı Adı" +
                "tcNo='" + getTcNo() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", yearOfBirth='" + getYearOfBirth() + '\'' +
                '}';
    }
}
