package model;

import lombok.*;

@Getter
@Builder
public class User {
    private String firstname;
    private String lastname;
    private String email;
    private String password;
}
