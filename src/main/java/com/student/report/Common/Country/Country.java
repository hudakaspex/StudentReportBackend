package com.student.report.Common.Country;

import com.student.report.Common.Province.Province;

import javax.persistence.*;
import java.util.List;

@Entity
public class Country {

    @Id
    @GeneratedValue()
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "latitude")
    private long latitude;

    @Column(name = "longitude")
    private long longitude;

    @OneToMany(cascade = CascadeType.ALL)
    @Column(name = "provinces")
    private List<Province> provinces;

}
