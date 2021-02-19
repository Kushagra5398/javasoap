package com.in28minutes.springboot.soap.web.services.example.teacher;

public class Teacher {
    private Long id;
    private String name;
    private String passportNumber;
    private String department;

    public Teacher() {
        super();
    }

    public Teacher(Long id, String name, String passportNumber, String department) {
        super();
        this.id = id;
        this.name = name;
        this.passportNumber = passportNumber;
        this.department= department;
    }

    public Teacher(String passportNumber, String department) {
        super();
        this.passportNumber = passportNumber;
        this.department= department;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public void setDepartment(String department){ this.department= department;}

    public String getDepartment(String department){ return department; }

    @Override
    public String toString() {
        return String.format("Student [id=%s, name=%s, passportNumber=%s, department=%s]", id, name, passportNumber, department);
    }

}
