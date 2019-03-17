package pl.agakrawczyk.SpringBootCourse.model;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class CourseDTO {
    private Long id;
    private String name;
    private int lenghtInSecond;
}
