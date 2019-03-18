package pl.agakrawczyk.SpringBootCourse.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import pl.agakrawczyk.SpringBootCourse.persistence.model.Course;

public interface CourseRepo  extends JpaRepository<Course, Long>, JpaSpecificationExecutor<Course>,BaseRepository<Course,Long> {
}

