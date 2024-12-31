package section9_oop.polymorphism.model;

import lombok.*;

@Data
@AllArgsConstructor
@Setter
@ToString

public class User {
    private Integer id;
    private String name;
    private String email;
    private String password;
    private String profile;
    private String bio;
    //
    private Boolean isDeleted;

}
