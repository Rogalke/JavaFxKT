package application.model;

import lombok.*;

@Data
@NoArgsConstructor
public class User {

    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private int userId;

    public User(String username, String password, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

}

