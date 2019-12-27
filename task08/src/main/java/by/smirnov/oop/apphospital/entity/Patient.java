package by.smirnov.oop.apphospital.entity;

import java.io.Serializable;
import java.util.Objects;

public class Patient implements Serializable {
    private int id;
    private String firstName;
    private String lastName;
    private String patronymic;
    private String address;
    private String number;
    private int cartNumber;
    private String diagnosis;

    public Patient() {

    }

    public Patient(int id, String firstName, String lastName, String patronymic,
                   String address, String number, int cartNumber, String diagnosis) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.address = address;
        this.number = number;
        this.cartNumber = cartNumber;
        this.diagnosis = diagnosis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getCartNumber() {
        return cartNumber;
    }

    public void setCartNumber(int cartNumber) {
        this.cartNumber = cartNumber;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String toFile() {
        return id +
                "," + firstName +
                "," + lastName +
                "," + patronymic +
                "," + address +
                "," + number +
                "," + cartNumber +
                "," + diagnosis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return id == patient.id &&
                cartNumber == patient.cartNumber &&
                Objects.equals(address, patient.address) &&
                Objects.equals(firstName, patient.firstName) &&
                Objects.equals(lastName, patient.lastName) &&
                Objects.equals(patronymic, patient.patronymic) &&
                Objects.equals(number, patient.number) &&
                Objects.equals(diagnosis, patient.diagnosis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, address, firstName, lastName, patronymic, number, cartNumber, diagnosis);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", adress=" + address +
                ", number='" + number + '\'' +
                ", cartNumber=" + cartNumber +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}
