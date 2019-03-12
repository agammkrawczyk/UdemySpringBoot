package pl.agakrawczyk.SpringBootCourse;

import lombok.Data;

@Data
public class Course {
    private Long id;
    private String name;
    private int lenghtInSecond;
}
