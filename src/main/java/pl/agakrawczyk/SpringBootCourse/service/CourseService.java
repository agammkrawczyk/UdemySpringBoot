package pl.agakrawczyk.SpringBootCourse.service;

import pl.agakrawczyk.SpringBootCourse.model.CourseDTO;
import pl.agakrawczyk.SpringBootCourse.persistence.model.Course;
import pl.agakrawczyk.SpringBootCourse.persistence.repository.CourseRepo;

import java.util.List;

public interface CourseService extends BaseService<Course, Long, CourseRepo>  {
    CourseDTO getCourseDtoById(Long id);

}
