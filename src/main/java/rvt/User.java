package rvt;

// https://github.com/VadimsMalickis/java-template/blob/class-work/src/main/java/rvt/Student.java

import java.time.LocalDate;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor




public class User {
    @NotEmpty(message = "Vārds nevar būt tukšs")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Only letters are allowed")
    private String name;

    @NotEmpty
    private String surname;
    private int age;
    private LocalDate birthday;
    private String gender;
    private boolean married;
    private String note;
    private String email;

    @NotEmpty
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$", message = "Must have at least one letter, number and special character")
    private String password;
    
    public String toString() {
        return String.format(
                "{%s, %s, %s, %s, %s, %s, %s, %s, %s, %s}",
                this.name,
                this.surname,
                this.age,
                this.password,
                this.birthday,
                this.gender,
                this.married,
                this.note,
                this.email
                );
    }
}
