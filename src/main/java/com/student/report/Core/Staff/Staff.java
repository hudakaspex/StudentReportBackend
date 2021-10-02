package com.student.report.Core.Staff;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Staff {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "staff_id")
    private String staffId;
}
