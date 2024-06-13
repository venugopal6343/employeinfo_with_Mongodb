package com.example.ProjectInfo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "projects")
@Builder
public class Project {
    @Id
    public String id;
    public String name;
    public String description;
    public String status;
    public String email;
    public String phone;
    public String password;
    public String startDate;
    public String endDate;
    public String manager;
    public int team;
    public double budget;
    public double profit;
    public String image;
    public String type;
}
