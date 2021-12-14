package spring.com.springweb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="/method6", produces={"application/json","application/xml"}, consumes="text/html")
public class CourseController
{

    @Value("${limits-service.maximum}")
    private int courseId;

    @GetMapping("/courses")
    public List<Course> getCourses()
    {

        return Arrays.asList((new Course(courseId, "Microservices", "Architect", null)));
    }

    @GetMapping("/validate")
    public String getCheck()
    {
        return "Hello World from Spring Boot";
    }

    @GetMapping("/courses/frontEnd")
    public Course getFrontEndCourse()
    {
        return new Course(2, "React", "UI", null);
    }

    @GetMapping("/courses/frontEndOther")
    public Course getFrontEndCourse1()
    {
        return new Course(3, "Angular", "UI", null);
    }

}