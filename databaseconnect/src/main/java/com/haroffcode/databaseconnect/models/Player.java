package com.haroffcode.databaseconnect.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Player")
public class Player {

    @Id
    private @GeneratedValue int id;
    @Column(name = "name")
    private String name;

    @Column(name = "nationality")
    private String nationality;
    @Column(name = "birthDate")
    private Date birthDate;
    @Column(name = "titles")
    private int titles;

    public Player() {
    }

    public Player(String name, int titles, String nationality, Date birthDate) {
        super();
        this.setName(name);
        this.setBirthDate(birthDate);
        this.setNationality(nationality);
        this.setTitles(titles);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getTitles() {
        return titles;
    }

    public void setTitles(int titles) {
        this.titles = titles;
    }
}
