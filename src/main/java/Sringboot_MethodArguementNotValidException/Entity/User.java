package Sringboot_MethodArguementNotValidException.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "user")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserId", nullable = false, unique = true)
    int userId;
    @Column(name = "UserName", updatable = true)
    @NotEmpty(message = "username should not be empty")
    String name;
    @Column(name = "UserEmail", updatable = true, unique = true)
    @NotEmpty(message = "Please entor your Email")
    @Email
    String email;
    @Column(name = "UserMobileNo", updatable = true, unique = true)
    @NotEmpty(message = "Please enter your mobile number")
    @Pattern(regexp = "^[6-9]{1}[0-9]{9}$", message = "Enter proper 10 digit number")
    String mobile;
    @Column(name = "UserGender", updatable = true)
    @NotEmpty(message = "Please enter your Gender")
    String gender;
    @Column(name = "UserAge", updatable = true)
    @Min(18)
    @Max(50)
    @NotNull(message = "Age should be more than 18 years")
    @Digits(message="only digits can be ", fraction=0, integer=2)
    int age;
    @Column(name = "UserNationality", updatable = true)
    @NotEmpty(message = "Please enter your Nationality")
    String nationality;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
