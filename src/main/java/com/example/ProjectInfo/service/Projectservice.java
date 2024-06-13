package com.example.ProjectInfo.service;

import com.example.ProjectInfo.dto.Projectrequest;
import com.example.ProjectInfo.model.Project;
import com.example.ProjectInfo.repository.Projectrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Projectservice {
    @Autowired
    private Projectrepo repo;

    public Project saveproject(Projectrequest project) {
       Project p=  Project.builder()
               .name(project.getName())
               .description(project.getDescription())
               .status(project.getStatus())
               .email(project.getEmail())
               .phone(project.getPhone())
               .password(project.getPassword())
               .startDate(project.getStartDate())
               .endDate(project.getEndDate())
               .manager(project.getManager())
               .team(project.getTeam())
               .budget(project.getBudget())
               .profit(project.getProfit())
               .image(project.getImage())
               .type(project.getType())
                .build();
       return repo.save(p);
    }

    public Project addproject(Project project) {
        return repo.save(project);
    }
}
