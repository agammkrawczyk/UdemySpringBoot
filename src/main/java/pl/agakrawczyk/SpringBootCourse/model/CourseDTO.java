package pl.agakrawczyk.SpringBootCourse.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CourseDTO {
    private Long id;
    private String name;
    private int lenghtInSecond;


}
