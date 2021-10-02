package com.student.report.Core.Activity;

import com.student.report.Core.ClassRoom.ClassRoom;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Activity {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "date")
    private LocalDate date;

    @OneToOne
    private ClassRoom classRoom;
}
