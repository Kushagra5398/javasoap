package com.in28minutes.teachers;


import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {


    public ObjectFactory() {
    }
    public GetTeacherDetailsResponse createGetTeacherDetailsResponse(){
        return new GetTeacherDetailsResponse();
    }
    public TeacherDetails createTeacherDetails(){
        return new TeacherDetails();
    }
    public GetTeacherDetailsRequest createGetTeacherDetailsRequest(){
        return new GetTeacherDetailsRequest();
    }
}

