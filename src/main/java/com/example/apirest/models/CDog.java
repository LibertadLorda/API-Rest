package com.example.apirest.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="dogs")
public class CDog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int id;

    private String name;

    private int age;

    private String gender;

    private String type;

    public CDog(int id, String name, int age, String gender, String type) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.type = type;
    }

    public CDog() {
    }
}
