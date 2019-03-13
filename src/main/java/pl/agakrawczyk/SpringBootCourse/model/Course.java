package pl.agakrawczyk.SpringBootCourse.model;

import lombok.Data;

@Data
public class Course {
    private Long id;
    private String name;
    private int lenghtInSecond;
}
