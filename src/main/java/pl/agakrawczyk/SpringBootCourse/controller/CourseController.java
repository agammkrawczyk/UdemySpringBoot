package pl.agakrawczyk.SpringBootCourse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.agakrawczyk.SpringBootCourse.model.CourseDTO;
import pl.agakrawczyk.SpringBootCourse.exception.WrongIdException;
import pl.agakrawczyk.SpringBootCourse.persistence.model.Course;
import pl.agakrawczyk.SpringBootCourse.persistence.repository.CourseRepo;

import java.util.ArrayList;
import java.util.List;
import  pl.agakrawczyk.SpringBootCourse.persistence.model.Course;
import pl.agakrawczyk.SpringBootCourse.service.Mapper;

@RestController
@RequestMapping(value = "/course")
public class CourseController {
    private List<CourseDTO> cours = new ArrayList<>(  );

    @Autowired
    CourseRepo courseRepo;

@RequestMapping(value = "/create",method = RequestMethod.POST)
public ResponseEntity<CourseDTO> createCourse(@RequestBody CourseDTO courseDTO){
   if (courseDTO.getId()== null || courseDTO.getId()<0)
       throw new WrongIdException("Zmienna ID jest  rowna lu  mniejsza od 0");

    cours.add( courseDTO );
    System.out.println( courseDTO.getId() );
    System.out.println( courseDTO.getName());
    System.out.println( courseDTO.getLenghtInSecond());
    return new ResponseEntity<>( courseDTO, HttpStatus.CREATED );
}


    @RequestMapping(value = "/avaiable",method = RequestMethod.GET)
    public ResponseEntity<List<CourseDTO> >getAvaiableCourses(){
        return new ResponseEntity<>( cours, HttpStatus.OK );
    }

  //  @RequestMapping(value = "/bought",method = RequestMethod.GET)//fixme
  //  public ResponseEntity<List<CourseDTO> >getBoughtCourses(){
  //      return new ResponseEntity<>(cours, HttpStatus.OK );
    //}
  @RequestMapping(value = "/buy/{id}", method = RequestMethod.GET)
  public CourseDTO buyCourse(@PathVariable(value = "id") Long id) {
      System.out.println( "buyCourse" );
      Course c = courseRepo.getOne(id);
      return Mapper.courseToDTO(c);
  }

    @RequestMapping(value = "/buy2", method = RequestMethod.POST)
    public CourseDTO buyCourse2(@RequestParam (value="id")Long id){
    System.out.println( "buyCourse2" );
        return getCourse( id );


    }

    private CourseDTO getCourse(Long id) {
        CourseDTO courseDTO = null;
        for (CourseDTO c : cours) {
            if (c.getId().equals( id )) {
                courseDTO = c;
                break;
            }
            if (courseDTO == null) {

            }
        }
        return courseDTO;
    }

}
