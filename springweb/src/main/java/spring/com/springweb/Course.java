package spring.com.springweb;

import org.springframework.beans.factory.annotation.Autowired;

public class Course
{

    private Integer id;
    private String name;
    private String department;


    public Course(Integer id, String name, String department, CourseBook courseBook) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
    @Autowired
    public String getAuthorName(CourseBook courseBook)
    {
        return courseBook.getAuthor();
    }


    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
}