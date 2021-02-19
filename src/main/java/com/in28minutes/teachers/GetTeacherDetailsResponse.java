package com.in28minutes.teachers;



import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "teacherDetails"
})
@XmlRootElement(name = "GetTeacherDetailsResponse")
public class GetTeacherDetailsResponse {
    @XmlElement(name = "TeacherDetails", required = true)
    protected TeacherDetails teacherDetails;

    public TeacherDetails getTeacherDetails(){
        return teacherDetails;
    }

    public void setTeacherDetails(TeacherDetails value){
        this.teacherDetails=value;
    }
}

