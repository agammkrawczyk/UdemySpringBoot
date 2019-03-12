package pl.agakrawczyk.SpringBootCourse.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.agakrawczyk.SpringBootCourse.Course;
import pl.agakrawczyk.SpringBootCourse.WrongIdException;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/course")
public class CourseController {
    private List<Course> courses= new ArrayList<>(  );
@RequestMapping(value = "/create",method = RequestMethod.POST)
public ResponseEntity<Course> createCourse(@RequestBody Course course){
   if (course.getId()== null || course.getId()<0)
       throw new WrongIdException("Zmienna ID jest  rowna lu  mniejsza od 0");

    courses.add( course );
    System.out.println( course.getId() );
    System.out.println(course.getName());
    System.out.println(course.getLenghtInSecond());
    return new ResponseEntity<>(course, HttpStatus.CREATED );
}


    @RequestMapping(value = "/avaiable",method = RequestMethod.GET)
    public ResponseEntity<List<Course> >getAvaiableCourses(){
        return new ResponseEntity<>(courses, HttpStatus.OK );
    }

  //  @RequestMapping(value = "/bought",method = RequestMethod.GET)//fixme
  //  public ResponseEntity<List<Course> >getBoughtCourses(){
  //      return new ResponseEntity<>(courses, HttpStatus.OK );
    //}
  @RequestMapping(value = "/buy/{id}", method = RequestMethod.POST)
  public Course buyCourse(@PathVariable(value = "id") Long id) {
      System.out.println( "buyCourse" );
      Course course = null;
      for (Course c : courses) {
          if (c.getId()!= null &&c.getId().equals( id )) {
              course = c;
              break;
          }
          if (course == null) {

          }
      }
      return course;
  }

    @RequestMapping(value = "/buy2", method = RequestMethod.POST)
    public Course buyCourse2(@RequestParam (value="id")Long id){
    System.out.println( "buyCourse2" );
        return getCourse( id );


    }

    private Course getCourse(Long id) {
        Course course = null;
        for (Course c : courses) {
            if (c.getId().equals( id )) {
                course = c;
                break;
            }
            if (course == null) {

            }
        }
        return course;
    }

}
