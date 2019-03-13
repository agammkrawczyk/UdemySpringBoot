package pl.agakrawczyk.SpringBootCourse.model;

import lombok.Data;

@Data
public class UserDTO {
private String firstName;
private String lastName;
private String email;
private String passsword;
private boolean admin;
private boolean author;

}
