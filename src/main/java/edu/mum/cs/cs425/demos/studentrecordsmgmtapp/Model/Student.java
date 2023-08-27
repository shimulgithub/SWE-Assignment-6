package edu.mum.cs.cs425.demos.studentrecordsmgmtapp.Model;

import java.time.LocalDate;
import java.util.Date;

public class Student {
    private   int studentId  ;
    private   String name;
    private LocalDate dateOfAdmission;

    public Student(int studentId, String name, LocalDate dateOfAdmission) {
        this.studentId = studentId;
        this.name = name;
        this.dateOfAdmission = dateOfAdmission;
    }

    public int getStudentId()
    {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfAdmission() {
        return dateOfAdmission;
    }
    public void setDateOfAdmission(LocalDate dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }
}
