package pl.agakrawczyk.SpringBootCourse.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.agakrawczyk.SpringBootCourse.User;

@RestController
@RequestMapping(value = "/")
public class Controller {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        User user = new User();
        user.setFirstName( "Aga" );
        return "Hello End User";
    }
}
