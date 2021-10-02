package com.student.report.Core.School;

import com.student.report.Common.Organization.Organization;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class School extends Organization {
    @Id
    @GeneratedValue
    private int id;

//    @OneToMany

}
