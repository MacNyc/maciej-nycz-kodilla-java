package Ordering;

import java.util.Objects;

public class User {

    private final int id;
    private final String nickName;
    private final String firstName;
    private final String lastName;
    private final String postCode;
    private final int houseNumber;
    private final String email;
    private final String phoneNumber;

    public User(final int id,final String nickName,final String firstName,final String lastName,final String postCode,final int houseNumber,final String email,final String phoneNumber) {
        this.id = id;
        this.nickName = nickName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.postCode = postCode;
        this.houseNumber = houseNumber;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public String getNickName() {
        return nickName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPostCode() {
        return postCode;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getId() == user.getId() &&
                getHouseNumber() == user.getHouseNumber() &&
                Objects.equals(getNickName(), user.getNickName()) &&
                Objects.equals(getFirstName(), user.getFirstName()) &&
                Objects.equals(getLastName(), user.getLastName()) &&
                Objects.equals(getPostCode(), user.getPostCode()) &&
                Objects.equals(getEmail(), user.getEmail()) &&
                Objects.equals(getPhoneNumber(), user.getPhoneNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNickName(), getFirstName(), getLastName(), getPostCode(), getHouseNumber(), getEmail(), getPhoneNumber());
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nickName='" + nickName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", postCode='" + postCode + '\'' +
                ", houseNumber=" + houseNumber +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
