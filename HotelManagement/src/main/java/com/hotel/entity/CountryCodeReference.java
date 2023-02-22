package com.hotel.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "country_code_ref")
public class CountryCodeReference {

    @Column(name = "country_pk")
    private int countryId;

    @ManyToOne
    private Country country;

}
