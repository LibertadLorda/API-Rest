package com.example.apirest.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="dogs")
public class CDog {

    @Id
    private int id;

    private int numberChip;

    private String name;

    private int age;

    private String gender;

    private String type;

    public CDog(int numberChip, String name, int age, String gender, String type) {
        this.numberChip = numberChip;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.type = type;
    }

    public CDog() {
    }
}
