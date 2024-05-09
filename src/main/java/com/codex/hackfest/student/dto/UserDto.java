package com.codex.hackfest.student.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    @NotBlank(message = "Name should not be blank")
    private String name;

    @NotBlank(message = "Email is required.")
    private String email;

    private String gender;

    @Min(value = 18, message = "Age should be greater than 18")
    private Integer age;

    @NotNull(message = "Password cannot be null")
    @NotEmpty(message = "Password cannot be empty")
    @Size(min = 8, max = 20, message = "Password must be between 8 and 20 characters")
    private String password;
}
