package pl.agakrawczyk.SpringBootCourse.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.agakrawczyk.SpringBootCourse.model.CourseDTO;
import pl.agakrawczyk.SpringBootCourse.persistence.model.Course;
import pl.agakrawczyk.SpringBootCourse.persistence.repository.CourseRepo;
@Service
public class CourseServiceImpl extends BaseServiceImpl<Course, Long, CourseRepo> implements CourseService {

    @Autowired
    private CourseRepo courseRepo;

    @Override
    public CourseRepo getRepository() {
        return courseRepo;
    }

    @Override
    public CourseDTO getCourseDtoById(Long id) {
        return Mapper.courseToDTO(getOne(id));
    }}
