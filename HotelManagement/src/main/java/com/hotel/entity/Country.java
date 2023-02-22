package com.hotel.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "country") //db table name
public class Country {

    @Column(name = "country_pk")
    private int id;

    @Column(name = "country_name")
    private String name;

    @OneToOne(mappedBy = "country_code")
    private CountryCodeReference codeReference;

    @OneToMany(mappedBy = "country") //country is a field in CountryCodeReference
    private Set<CountryCodeReference> codeReferences;

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


}
