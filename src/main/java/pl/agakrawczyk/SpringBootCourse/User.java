package pl.agakrawczyk.SpringBootCourse;

import lombok.Data;

@Data
public class User {
private String firstName;
private String lastName;
private String email;
private String passsword;
private boolean admin;
private boolean author;

}
