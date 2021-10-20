package spring.com.springweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController
{

    @GetMapping("/courses")
    public List<Course> getCourses()
    {
        return Arrays.asList((new Course(1, "Microservices", "Architect")));
    }

    @GetMapping("/courses/frontEnd")
    public Course getFrontEndCourse()
    {
        return new Course(2, "React", "UI");
    }

    @GetMapping("/courses/frontEndOther")
    public Course getFrontEndCourse1()
    {
        return new Course(3, "Angular", "UI");
    }

}