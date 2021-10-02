package com.student.report.Common.Province;

import com.student.report.Common.City.City;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Province {
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
    @Column(name = "cities")
    private List<City> cities;
}
