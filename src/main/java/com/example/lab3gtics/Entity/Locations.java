package com.example.lab3gtics.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
public class Locations {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "location_id")
    private int locationId;
    @Basic
    @Column(name = "street_address")
    private String streetAddress;
    @Basic
    @Column(name = "postal_code")
    private String postalCode;
    @Basic
    @Column(name = "city")
    private String city;
    @Basic
    @Column(name = "state_province")
    private String stateProvince;
    @Basic
    @Column(name = "country_id")
    private String countryId;
}
