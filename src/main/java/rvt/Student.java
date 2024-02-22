package rvt;

// https://github.com/VadimsMaswitchlickis/java-template/blob/class-work/src/main/java/rvt/Student.java


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
public class Student extends User {
    @NotEmpty
    private String institution;
    private String group;
    
    @NotEmpty
    @Pattern(regexp = "^[1-4]{1}$", message = "Only from year 1-4")
    @Pattern(regexp = "", message = "")
    private int year;
    
    public String toCsvString() {
        String line = String.join(", ");
        return line;
    }

}

