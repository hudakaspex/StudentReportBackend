package com.student.report.Common.City;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "city")
@Getter
@Setter
public class City {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "latitude")
    private long latitude;

    @Column(name = "longitude")
    private long longitude;
}
