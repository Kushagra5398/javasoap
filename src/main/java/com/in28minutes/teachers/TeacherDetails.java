package com.in28minutes.teachers;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentDetails", propOrder = {
        "id",
        "name",
        "passportNumber",
        "department"
})
public class TeacherDetails {
    protected int id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String passportNumber;
    @XmlElement(required = true)
    protected String department;

    public int getId() {
        return id;
    }

    public void setId(int value) {
        this.id = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String value) {
        this.passportNumber = value;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String value) {
        this.department = value;
    }
}
