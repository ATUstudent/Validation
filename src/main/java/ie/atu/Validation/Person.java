package ie.atu.Validation;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @NotBlank(message=" enter a Name!")
    private String name;

    @NotBlank(message=" enter a title!")
    private String title;

    @PositiveOrZero(message=" enter a valid id!")
    private int employeeId;

    @Min(value=18, message="Your age should be 18 or older!")
    private int age;

    @Email(message="enter a valid email!")
    private String email;

    @NotBlank(message="enter a position!")
    private String position;

    @NotBlank(message="enter a department!")
    private String department;

}
