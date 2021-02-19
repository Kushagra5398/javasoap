package com.in28minutes.springboot.soap.web.services.example.teacher;

import com.in28minutes.teachers.GetTeacherDetailsRequest;
import com.in28minutes.teachers.GetTeacherDetailsResponse;
import com.in28minutes.teachers.TeacherDetails;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class TeacherDetailsEndpoint {

    @PayloadRoot(namespace = "http://in28minutes.com/teachers", localPart ="GetTeacherDetailsRequest")
    @ResponsePayload
    public GetTeacherDetailsResponse processCourseDetailsRequest(@RequestPayload GetTeacherDetailsRequest request) {
        GetTeacherDetailsResponse response = new GetTeacherDetailsResponse();
        TeacherDetails teacherDetails = new TeacherDetails();
        teacherDetails.setId(request.getId());
        teacherDetails.setName(request.getName());
        teacherDetails.setPassportNumber("E1234567");
        teacherDetails.setDepartment("Computer Science");
        response.setTeacherDetails(teacherDetails);
        return response;

    }
}

