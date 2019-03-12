package pl.agakrawczyk.SpringBootCourse;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;
@AllArgsConstructor
@Data
public class ExceptionResponse {
    private Date timestamp;
    private String message;
    private String stackTrace;
    private String details;
}
