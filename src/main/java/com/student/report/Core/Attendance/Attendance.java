package com.student.report.Core.Attendance;

import com.student.report.Common.Enums.AttendanceStatus;
import com.student.report.Core.Student.Student;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Attendance {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "date")
    private LocalDate date;

    @Enumerated(EnumType.STRING)
    private AttendanceStatus status;

    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;

}
