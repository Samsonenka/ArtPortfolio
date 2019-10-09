package com.artPortfolio.artPortfolio.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "personal_date")
public class PersonalData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long personalDateID;

    private String name;
    private String surname;
    private String city;
    private LocalDate DateOfBirth;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private Users user;

    public PersonalData() {
    }

    public PersonalData(Users user) {
        this.name = "name";
        this.surname = "surname";
        this.city = "city";
        DateOfBirth = LocalDate.now();
        this.user = user;
    }

    public long getPersonalDateID() {
        return personalDateID;
    }

    public void setPersonalDateID(long personalDateID) {
        this.personalDateID = personalDateID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public LocalDate getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
