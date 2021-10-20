package com.warriors.warriors.model;

import javax.persistence.*;

@Entity
@Table(name="characters")
public class Character {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "name", length = 30,nullable = false)
    private String name;

    @Column(name = "type", length = 30, nullable = false)
    private String job;

    public Character(int id, String name, String job) {
        this.id = id;
        this.name = name;
        this.job = job;
    }

    public Character() {
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
