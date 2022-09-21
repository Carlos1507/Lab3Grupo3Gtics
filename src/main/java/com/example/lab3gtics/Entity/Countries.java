package com.example.lab3gtics.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
public class Countries {
    @Id
    @Column(name = "country_id")
    private String countryId;
    @Basic
    @Column(name = "country_name")
    private String countryName;
    @ManyToOne
    @JoinColumn(name = "region_id")
    private Regions region;
}
