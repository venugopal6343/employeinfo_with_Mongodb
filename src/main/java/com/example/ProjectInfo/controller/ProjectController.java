package com.example.ProjectInfo.controller;

import com.example.ProjectInfo.dto.Projectrequest;
import com.example.ProjectInfo.model.Project;
import com.example.ProjectInfo.service.Projectservice;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ust-project")
public class ProjectController {
    @Autowired
    private Projectservice service;

   @PostMapping("/addvalidProject")
    public ResponseEntity<Project> addProject(@RequestBody @Valid Projectrequest project){
        return new ResponseEntity<>(service.saveproject(project), HttpStatus.OK);
    }
    @PostMapping("/addProject")
    public Project addProject(@RequestBody Project project){
        return service.addproject(project);
    }
}
