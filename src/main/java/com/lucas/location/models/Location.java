package com.lucas.location.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "street_name")
    private String streetName;
    @Column(name = "street_number")
    private int streetNumber;
    @Column(name = "street_number_addition")
    private String streetNumberAddition;
    @Column(name = "postal_code")
    private String postalCode;
    @Column(name = "city")
    private String city;
    @Column(name = "country")
    private String country;

    public Location() {

    }

}
