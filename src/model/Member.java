package model;

import java.time.LocalDate;
import java.util.Objects;

public class Member {

    private String name;
    private String phoneNumber;
    private String email;
    private LocalDate associationDate;

    public Member(String name, String phoneNumber, String email, LocalDate associationDate) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.associationDate = associationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getAssociationDate() {
        return associationDate;
    }

    public void setAssociationDate(LocalDate associationDate) {
        this.associationDate = associationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(name, member.name) && Objects.equals(phoneNumber, member.phoneNumber) && Objects.equals(email, member.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber, email);
    }
}
