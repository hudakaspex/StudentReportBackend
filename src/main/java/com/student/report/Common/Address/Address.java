package com.student.report.Common.Address;

import com.student.report.Common.City.City;
import com.student.report.Common.Country.Country;
import com.student.report.Common.Province.Province;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "street")
    private String street;

    @Column(name = "postal_code")
    private String postalCode;

    @OneToOne
    private City city;

    @OneToOne
    private Province province;

    @OneToOne
    private Country country;

}
