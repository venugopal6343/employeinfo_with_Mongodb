package com.example.ProjectInfo.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class Projectrequest {
    public int id;
    @NotNull(message = "Name is required")
    public String name;
    @NotBlank(message = "description is required")
    public String description;
    @NotBlank
    public String status;
    @Email(message = "Invalid email format")
    public String email;
    @Pattern(regexp = "^\\d{10}$", message = "Invalid phone number format")
    public String phone;
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$", message = "Invalid password format")
    public String password;
    @NotBlank
    public String startDate;
    @NotBlank
    public String endDate;
    @NotBlank
    public String manager;
    @Min(2)
    @Max(20)
    public int team;
    @Min(200000)
    @Max(200000000)
    public double budget;
    @Min(0)
    @Max(200000000)
    public double profit;
    @NotNull
    public String image;
    public String type;
}
